package medium;

import java.util.Scanner;

public class ParseIntFunction {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the value");

        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
        boolean negative=false;
        int output=0;
        int i=0;
        if(data.charAt(0)=='-'){
                i++;
                negative=true;
        }
        for(int k=i;k<data.length();k++){
            output*=10;
            switch (data.charAt(k)){
                case '0':output+=0;break;
                case '1':output+=1;break;
                case '2':output+=2;break;
                case '3':output+=3;break;
                case '4':output+=4;break;
                case '5':output+=5;break;
                case '6':output+=6;break;
                case '7':output+=7;break;
                case '8':output+=8;break;
                case '9':output+=9;break;
                default:throw new Exception("Data Exception");

            }

        }
        if(negative)
            output=output-(output*2);

        System.out.println(output);

    }

}
