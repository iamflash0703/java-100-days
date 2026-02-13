public class Day16 {
    public static int SumOfNum(int n){
        if (n == 0){
            return 0;
        }
        return n + SumOfNum(n- 1);
    }
    public static int Palindrome(int n, int rev){
        if(n==0){
            return rev;
        }
        return Palindrome(n / 10, rev * 10 + n % 10);
    }
    public static boolean isPalindrome(String s,int start, int end){
        if(start == end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;

        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args){
        
        
        System.out.println("the Sum of numbers is : " + SumOfNum(5));
        int n =121;

        if(n==Palindrome(n, 0)){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }
        String s = "madam";
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
    
}
