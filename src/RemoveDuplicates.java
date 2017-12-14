
public class RemoveDuplicates {
	public void removeDups() {
	   String version = "2.6.2-SNAPSHOT";
      if(version.contains("SNAPSHOT") || version.contains("snapshot")){
         version = version.substring(0, version.length()-9);
      }
      System.out.println(version);
	}
	public static void main(String args[]) {
	   RemoveDuplicates r = new RemoveDuplicates();
	   r.removeDups();
	}
}
