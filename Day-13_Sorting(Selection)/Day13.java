public class Day13 {

    //in terms of swapping between bubble and selsection sort -> selection sort is better because it swaps n-1 times 

    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int MinIndex = i;
            
            
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[MinIndex]){
                MinIndex = j;
                }
           } 
           int temp = arr[MinIndex];
           arr[MinIndex] = arr[i];
           arr[i] = temp;
        }
    }
       public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        SelectionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
