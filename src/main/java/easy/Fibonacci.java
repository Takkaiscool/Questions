package easy;

public class Fibonacci {
    public static void main(String[] args) {
        int prev=0;
        int next=1;
        int n=4;
        for(int i=0;i<n;i++){
            if(i==1){
                System.out.println(next);
            }else if(i==0){
                System.out.println(prev);
            }else {
                next=prev+next;
                prev=next;
                System.out.println(next);
            }
        }


    }
}
