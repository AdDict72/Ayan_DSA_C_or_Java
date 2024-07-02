public class PrintNumbers {
    static int num(int start,int end){
        System.out.print(start + " ");        
        if(start==end){
            return 0;
        }
        return num(start+1, end);
    }
    public static void main(String[] args) {
        int n =10;
        num(1, n);
    }

}
