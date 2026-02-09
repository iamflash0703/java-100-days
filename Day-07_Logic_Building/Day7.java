public class Day7 {

    public static int FindSum(int marks[]){
        int sum = 0;
        for(int i =0;i<marks.length;i++){
            sum +=marks[i];
        }
        return sum;
    } 
    public static double CalAvg(int marks[]){
        int sum = FindSum(marks);
        return (double) sum/marks.length;
    }

    public static void Finding(int marks[]){
        double avg = CalAvg(marks);
        int above = 0;
        int below = 0;

        for(int i = 0 ;i < marks.length;i++){
            if(marks[i] > avg){
                above++;
            }else if(marks[i] < avg){
                below++;
            }

        }
        System.out.println("The avg is : " + avg);
        System.err.println("Above avg is : " +above);
        System.out.println("Below avg is : " + below);

        
           
    }
    public static void main(String[] args){
        int marks[] = {77,87,89,98,70,78};
        Finding(marks);
    }
    
}
