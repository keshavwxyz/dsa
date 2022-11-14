package Assignment.functions;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 16;
        System.out.println(OE(a));
    }
    static String OE(int a){
        String temp="Odd";
        if(a%2==0) temp="even";
        return temp;
    }
}
