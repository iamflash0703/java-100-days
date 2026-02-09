public class Day2 {
    public static void main(String[] args) {
        //Printing just numbers
        for(int i = 0;i<=10;i++){
            System.out.println("Numbers are : " + i);
        }

        //printing even numbers
        for(int i = 0;i <= 100; i++){
            if(i%2==0){
                System.out.println("Even numbers are : " + i);
            }
        }    
        //Printing all of the sums upto 100
        int sum = 0;
        for(int i = 0;i <= 100;i++){
            sum +=i;
            
        }  
        System.out.println("Sums of 1 to 100 are : " + sum);  

        
        
    }
}
