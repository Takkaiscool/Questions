public class LeftShift {
    public static void main(String[] args) {
        String data="Arunkumar";
        int leftShift=1;
        int rightShift=2;
        char character=' ';
        int k=0;
        for(int i=0;i<leftShift;i++){
            character=data.charAt(0);
            data=data.substring(1);
            data+=character+"";

        }
        System.out.println("Left Shift ouput "+data);
        for(int i=0;i<rightShift;i++){
            character=data.charAt(data.length()-1);
            data=character+data.substring(0,data.length()-1);
        }
        System.out.println("Right Shift output "+data);

    }
}
