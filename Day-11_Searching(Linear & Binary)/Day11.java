public class Day11 {
    
    public static int LinearSearch(int arr[] , int target){//Time complexity : O(n)
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;//index found
            }
        }
        return -1;//Not found
    }

    public static int BinarySearch(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        int[] arr = {10,25,30,45,50,55};

        int index = LinearSearch(arr,45);

        if(index != -1){
            System.out.println("Found at : " + index);
        }else{
            System.out.println("Not found ..");
        }

        int idx = BinarySearch(arr,50);
        System.out.println("Found at : " + idx);
    }
    
}
