package easy;

public class MergeString {
    public static void main(String[] args) {
        String str1="abc";
        String str2="def";
        String output=new String();
        for(int i=0;i<str1.length();i++){
            output+=str1.charAt(i)+""+str2.charAt(i);
        }
        System.out.println(output);
    }
}
