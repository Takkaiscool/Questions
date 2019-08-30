import com.sun.tools.javac.util.StringUtils;

public class StringDuplication {

    public static void main(String[] args) {
        String data="thoughtworks";
        data=data.toUpperCase();
        int []output=new int[100];
        for(int i=0;i<data.length();i++){
            output[data.charAt(i)]++;
        }
        for(int i=0;i<output.length;i++){
            if(output[i]>0)
                System.out.println((char)i+":"+output[i]);
        }
    }
}
