public class Factorial {
        static int fac(int n,int fact){
            if(n<1){
                return fact;
            }
            return fac(n-1,fact*n);
        }
        public static void main(String[] args) {
            int n =4;
            System.out.println( "Factorial of "+n+"! is : "+ fac(n,1));
        }
    }

