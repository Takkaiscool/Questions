package medium;

import java.util.ArrayList;
import java.util.List;

public class WordDuplication {
    public static void main(String[] args) {
        int []data={1,3,4,5,2,1,4,1,1,5,6,7,8,8};
        List<Integer> output=new ArrayList<>();
        for(int i=0;i<data.length-1;i++){

            for(int j=i+1;j<data.length;j++){
                if(data[i]==data[j]&&!output.contains(data[i])){
                    output.add(data[i]);
                }
            }
        }
        System.out.println(output);
    }
}
