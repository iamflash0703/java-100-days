public class Day5 {

    public static int CalculateMarks(int marks[]){

        int sum = 0;
        for(int i = 0; i < marks.length;i++){
            sum += marks[i];

        }

        return sum;
    }

    public static int HighestMark(int marks[]){
        int highest = marks[0];

        for(int i =1;i<marks.length;i++){
            if(marks[i]>marks[0]){
                highest = marks[i];
            }
            
        }
       return highest; 
    }

    public static void main(String[] args){

        int marks[] = {76,77,65,87,67,98};
        double totalSub = 6;

        int Cal = CalculateMarks(marks);

        System.out.println("The calculations of all the marks is : " + Cal);

        //to find the percemtage 

        double percentage = Cal / totalSub;
        System.out.println("The percentage is : " + percentage);


        int HighestMarks = HighestMark(marks);
        System.out.println("The highest mark obtained by the student is : " + HighestMarks);

        
    }
    
}
