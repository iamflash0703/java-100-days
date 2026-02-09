public class Day3{
    public static void main(String[] args) {
        int marks[] = {77,78,98,76};
        //Printing just  the marks

        for(int i=0;i<marks.length;i++){
            System.out.println("marks are : " + marks[i]);
        }
        //Sum of all the marks
        int sum = 0;

        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        System.out.println("sum of all the marks are : " + sum);

        //printing highest mark in the array

        int highest = marks[0];
        for(int i =1; i<marks.length;i++){
            if(marks[i]>marks[0]){
                int Highest  = marks[i];
                System.out.println("Highest in this array is : " + marks[i]);
            }
        }

        int lowest = marks[0];

        for(int i=1;i<marks.length;i++){
            if(marks[i]<marks[0]){
                System.out.println("Lowest in this array is : " + marks[i]);
            }
        }
    }
}