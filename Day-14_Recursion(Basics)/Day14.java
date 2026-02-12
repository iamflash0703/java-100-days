public class Day14 {

    public static int factorial(int n){
        if(n == 1){//base case
            return 1;
        }
        else{
            return n * factorial(n-1);//recursive call
        }
        

    }
    public static int SumRecursion(int n){
        if(n == 0){//base case
            return 0;
        }
        else{
            return n + SumRecursion(n-1);//recursive call
        }
    }

    public static int Fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return Fibonacci(n-1) + Fibonacci(n-2);
        
    }
    public static void main(String[] args){
        int n = 4;

        int result1 = factorial(n);

        System.out.println("Factorial is : " + result1);

        int result2 = SumRecursion(n);

        System.out.println("Sum  is : " + result2);

        int result3 = Fibonacci(n);

        System.out.println("Fibonacci is : " + result3);

    }
    
}
