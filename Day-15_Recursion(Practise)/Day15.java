public class Day15 {
    //Counting Digits
    public static int CountDigits(int n){
        if(n == 0){
            return 0;
        }

        return 1 + CountDigits(n / 10);
    }
    //Power Of a Number

    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * Power(x,n-1);
    }

    //Reverse a number using Recursion
    public static int Reverse(int n, int rev){
        if(n == 0){
            return rev;
        }
        return Reverse(n / 10 , rev * 10 + n % 10);
    }

    public static void main(String[] args){
        int n = 12345;

        if(n == 0){
            System.out.println("Digits : 1");
        }else{
            System.out.println("Digits : " + CountDigits(n));
        }

        System.out.println("The Answer is : " + Power(2, 3));
        int result = Reverse(1234, 0);
        System.out.println(result);
    }
    
}
