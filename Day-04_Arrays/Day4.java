public class Day4{
    
        public static void greet(){
            System.out.println("Hello. I am  learning java seriously ..");
        }

        public static int PrintSum(int a, int b){

            int sum = a + b;
            System.out.println("The sum of both the integers is : " + sum);
            return sum;
        }

        public static int FindMax(int a , int b){
            if(a>b) return a;
            else return b;

        } 


        public static void main(String[] args) {
            greet();

            int a = 7;
            int b = 3;

            PrintSum(a,b);


            int max = FindMax(13,23);

            System.out.println("The max no. bet both is : " + max);


    
        }
}