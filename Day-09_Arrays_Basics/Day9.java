public class Day9 {

   public static void ReverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
 
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        
    
    public static int MaxInArray(int arr[]){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;


    }

    public static boolean ArrSort(int arr[]){

        for(int i = 0;i < arr.length; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4};

        ReverseArray(arr);

         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nthe maximum no. in array is : " + MaxInArray(arr));
        System.out.println("\nthe array is sorted : " + ArrSort(arr));
    }
    
}
