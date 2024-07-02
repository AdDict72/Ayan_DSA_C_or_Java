public class PrintName{

    static void name(int i,int n){
        if(i>n) return;
        System.out.println("I am Ayan.");
        name(i+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        name(1, n);
    }
}