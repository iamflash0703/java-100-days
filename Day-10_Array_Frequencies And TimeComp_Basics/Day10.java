public class Day10{

    public static int CountEle(int arr[] , int target){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
               count++;
            }
        }
        return count;
    }

    //time complexity -> O(n^2)
    public static void PrintAllFrequencies(int arr[]){
        boolean[] visited  = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){//Pick elements
            if(visited[i]){
                continue;//Why continue is important ? -> Don't run rest of loop go to next index
            }
            int count = 1;

            for(int j = i + 1;j < arr.length; j++){//Count same elements
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;//avoid duplicates
                }
            }
            System.out.println(arr[i] + "->" + count);
        }

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3,4,1,2,3,4};

        System.out.println("the frequency of 2 is : " + CountEle(arr, 2));

        PrintAllFrequencies(arr);
    }
}