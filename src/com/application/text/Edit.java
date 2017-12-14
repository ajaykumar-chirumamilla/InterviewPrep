package com.application.text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;

/**
 * Created by Yaswanth on 2/7/17.
 */
public class Edit {

    private static final String WORD1_ALIAS = "$$$$";
    private static final String WORD2_ALIAS = "####";

    private List<String> tokens;
    private StringBuilder lb;
    private String findWord;
    private String replaceWord;

    public Edit(String line){
        this.lb = new StringBuilder(line);
        this.tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
    }

    private StringBuilder replace(String find, String replace){
        int index;
        while ((index = lb.indexOf(find)) != -1) {
            lb.replace(index, index + find.length(), replace);
        }
        return lb;
    }

    private String getLastWord() {
        return lb.substring(lb.lastIndexOf(" ") + 1);
    }

    public String findAndReplace(String find, String replace){
        return replace(find, replace).toString();
    }

    private String swap(String word1, String word2){
        if(!tokens.contains(word1) || !tokens.contains(word2)){
            throw new RuntimeException("One or more the words doesn't belong to the line");
        }
        if(word1 != null && word2 != null) {
            lb = replace(word1, WORD1_ALIAS);
            lb = replace(word2, WORD2_ALIAS);
            lb = replace(WORD1_ALIAS, word2);
            lb = replace(WORD2_ALIAS, word1);
        }
        return lb.toString();
    }

    //329
    public String swap(Integer position1, Integer position2){
        if(position1 <= 0 || position1 > tokens.size()
                || position2 <= 0 || position2 > tokens.size()){
            throw new RuntimeException("Invalid positions. Please choose positions between 1 and " + tokens.size());
        }
        return swap(tokens.get(position1-1), tokens.get(position2-1));
    }

    public String toggleWordToUpperCase(String position){
        if(position == null || (!position.equalsIgnoreCase("last") && !position.equalsIgnoreCase("first"))){
            throw new RuntimeException("Invalid Position : " + position);
        }
        int pos = 0;
        if(position.equalsIgnoreCase("last")){
            pos = tokens.size() - 1;
        } else if(position.equalsIgnoreCase("first")){
            pos = 0;
        } else {
            try{
                pos = Integer.parseInt(position);
            }catch (Exception e){
            	System.out.println("--");
                throw  new RuntimeException("Invalid Position : " + position);
            }

            if(pos < 0 || pos >= tokens.size()){
                throw  new RuntimeException("Invalid Position : " + position);
            }
        }
        String word = tokens.get(pos);
        int wordIndex = lb.indexOf(word);
        return lb.replace(wordIndex, wordIndex + word.length(), word.toUpperCase()).toString();
    }

    public String reverse(){
        Collections.reverse(tokens);
        return String.join(" ", tokens);
    }

    public enum Operation {
        REPLACE("#replace", 2), SWAP("#swap", 2), UPPERCASE("#uppercase", 1), REVERSE("#reverse", 0);

        final String tag;
        final int argCount;

        Operation(String tag, int argCount){
            this.tag = tag;
            this.argCount = argCount;
        }

        public String getTag() {
            return tag;
        }

        public int getArgCount() {
            return argCount;
        }
    }

}
