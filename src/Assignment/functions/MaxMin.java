package Assignment.functions;

public class MaxMin {
    public static void main(String[] args) {
        int a=45,b=64,c=34;
        System.out.println("max: "+max(a,b,c));
        System.out.println("min: "+min(a,b,c));
    }
    static int max(int a,int b,int c){
        int temp=a;
        if (b>a) temp =b;
        if (c>a && c>b) temp =c;
        return temp;
    }
    static int min(int a,int b,int c){
        int temp=a;
        if (b<a) temp =b;
        if (c<a && c<b) temp =c;
        return temp;
    }
}
