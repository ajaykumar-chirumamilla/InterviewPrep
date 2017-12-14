package com.application.text;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;

/**
 * Created by Yaswanth on 2/7/17.
 */
public class EditorMain {

    /**
     *
     * Set Property - > -Dfile.path=/Users/Yaswanth/Documents/iWorkspace/TextParser/input.txt
     *
     * @param args
     */

    public static void main(String[] args) {

        new EditorMain().edit();
    }

    public void edit(){
        CustomFileReader reader = new CustomFileReader("C:\\Users\\akumar074c\\Desktop\\test.txt");
        List<String> lines = reader.readLines();
        if(lines != null && !lines.isEmpty()){
            lines.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    for(Edit.Operation operation : Edit.Operation.values()){
                        if(s.contains(operation.getTag())){
                            List<String> args = getArguments(s, operation.getTag());
                            if(args == null || args.size() != operation.getArgCount()){
                                throw new RuntimeException("Invalid Arguments for Operation : " + operation.getTag() + " @ line : " + s);
                            }
                            switch (operation){
                                case REPLACE:
                                    System.out.println(new Edit(getInputLine(s)).findAndReplace(args.get(0), args.get(1)));
                                    break;
                                case SWAP:
                                    System.out.println(new Edit(getInputLine(s)).swap(Integer.parseInt(args.get(0)), Integer.parseInt(args.get(1))));
                                    break;
                                case UPPERCASE:
                                    System.out.println(new Edit(getInputLine(s)).toggleWordToUpperCase(args.get(0)));
                                    break;
                                case REVERSE:
                                    System.out.println(new Edit(getInputLine(s)).reverse());
                                    break;
                            }
                        }
                    }
                }
            });
        }
    }

    private List<String> getArguments(String line, String operation){
        String argStr = line.substring(line.indexOf(operation) + operation.length(), line.length());
        StringTokenizer tokenizer = new StringTokenizer(argStr);
        List<String> args = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            args.add(tokenizer.nextToken());
        }
        return args;
    }

    private String getInputLine(String line){
        return line.substring(0, line.indexOf("#"));
    }

}