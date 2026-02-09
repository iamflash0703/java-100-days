public class Day6 {

    public static int findsum(int marks[]){
        int sum = 0;

        for(int i = 0;i<marks.length;i++){
            sum = sum+marks[i];
        }
        return sum;

        
    }
    public static double FindAvg(int marks[]){
        int sum = findsum(marks);
        return (double) sum/marks.length;
    

    }
    public static int FindMin(int marks[]){
        int min = marks[0];
        for(int i =1;i<marks.length;i++){
            if(marks[i]<marks[0]){
                min = marks[i];
            }
        }
        return min;
    }
    public static int FindMax(int marks[]){
        int max = marks[0];
        for(int i = 1;i<marks.length;i++){
            if(marks[0]<marks[i]){
                max = marks[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int marks[] = {87,76,78,89,67};

        int sum = findsum(marks);
        double avg = FindAvg(marks);

        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + avg);

        int min = FindMin(marks);
        System.out.println("The min marks is :" + min);
        int max = FindMax(marks);
        System.out.println("The max marks is :" + max);
    

    }
    
}