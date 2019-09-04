package easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArray {

    static int hourglassSum(int[][] arr) {
        ArrayList<Integer> ouput=new ArrayList<>();

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                ouput.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);

            }
        }
        int larg=ouput.get(0);
        for(int i=0;i<ouput.size();i++){
            System.out.print(ouput.get(i)+"\t");
            if(larg<ouput.get(i)){
                larg=ouput.get(i);

            }
        }
        return larg;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int[][] arr = new int[6][6];
        arr[0][0]=0;
        arr[0][1]=-4;
        arr[0][2]=-6;
        arr[0][3]=0;
        arr[0][4]=7;
        arr[0][5]=-6;
        arr[1][0]=-1;
        arr[1][1]=-2;
        arr[1][2]=-6;
        arr[1][3]=-8;
        arr[1][4]=-3;
        arr[1][5]=-1;
        arr[2][0]=-8;
        arr[2][1]=-4;
        arr[2][2]=-2;
        arr[2][3]=-8;
        arr[2][4]=-8;
        arr[2][5]=-6;
        arr[3][0]=-3;
        arr[3][1]=-1;
        arr[3][2]=-2;
        arr[3][3]=-5;
        arr[3][4]=-7;
        arr[3][5]=-4;
        arr[4][0]=-3;
        arr[4][1]=-5;
        arr[4][2]=-3;
        arr[4][3]=-6;
        arr[4][4]=-6;
        arr[4][5]=-6;
        arr[5][0]=-3;
        arr[5][1]=-6;
        arr[5][2]=0;
        arr[5][3]=-8;
        arr[5][4]=-6;
        arr[5][5]=-7;

        /*for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }*/

        int result = hourglassSum(arr);
        System.out.println(result);



    }
}
