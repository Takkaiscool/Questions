public class BitPattern {
    public static void main(String[] args) {
        int []data={1,3,2,3,4,1};
        int []output=new int[data.length];
        int []secOutput=new int[data.length];
        int ele;
        output[0]=0;
        for(int i=1;i<data.length;i++){
            ele=data[i];
            for(int j=0;j<i;j++){
                if(data[j]==ele){
                    output[i]=1;
                    break;
                }else{
                    output[i]=0;
                }
            }
        }
        System.out.println("First Output ");
        for(int k=0;k<output.length;k++){
            System.out.print(output[k]);
        }
        System.out.println();
        for(int i=0;i<data.length;i++){
            ele=data[i];
            for(int j=0;j<(data.length-2)-i;j++){
                if(data[j]==ele){
                    secOutput[i]=1;
                    break;
                }else{
                    secOutput[i]=0;
                }
            }
        }
        System.out.println("Second Output");
        for(int k=0;k<secOutput.length;k++){
            System.out.print(secOutput[k]);
        }
    }
}
