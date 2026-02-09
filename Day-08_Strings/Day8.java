public class Day8 {
  

        public static int CountVowels(String str){
            int count = 0;

            for(int i = 0; i < str.length(); i++){
                char ch = Character.toLowerCase(str.charAt(i));
                if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                    count  ++;
                }
            }
            return count;

        }

        public static String ReverseStr(String str){
            String rev = " ";

            for(int i = str.length()-1;i>=0;i--){
                rev += Character.toUpperCase(str.charAt(i));
            }
            return rev;
        }

        public static boolean isPalindrome(String str){
            String rev = ReverseStr(str);
            return str.equalsIgnoreCase(str);
        }
          public static void main(String[] args){

            String name = "Madam";

            System.out.println("the vowels present in string is : " + CountVowels(name));
            System.out.println("the reversed string is : " + ReverseStr(name));

            System.out.println(isPalindrome(name));

    }
    
}
