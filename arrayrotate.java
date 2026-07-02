import java.util.Arrays;

public class arrayrotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));

        int k = 2;
        int n = arr.length;

        int[] rotated  = new int[n];

        for (int i = 0; i < n; i++){
            rotated[i] = arr[(i + k) % n];
        }

        System.out.println(Arrays.toString(rotated));
    }
    
}
