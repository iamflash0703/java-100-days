
    public class Day12 {

    /*  Why Sorting is needed ?
    -> Binary Search needs Sorted array.
    -> Makes data easier to Understand.
    -> Used everywhere (databases,rankings,etc).

    Example :
    Unsorted -> {4,2,1,3}
    Sorted -> {1,2,3,4}

    */

    //Bubble Sort : How it Works ? -> Big elements Bubble up to the end.. 
    //Time Complexity -> O(n^2)

    public static void BubbleSort(int arr[]){
        int n = arr.length;

        for(int i = 0;  i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        BubbleSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        
    }
    
}

    


