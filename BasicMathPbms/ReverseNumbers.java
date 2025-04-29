import java.util.Arrays;

public class ReverseNumbers {

    public static int[] PrintReverseArray(int[] arr,int i, int j){
       if(i >= j) return arr;
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
       return PrintReverseArray(arr, i+1, j-1);
    }
    public static void main(String args[]){
        int[] arr = new int[] {1,2,3,4,5};
        int len = arr.length-1;
        System.out.println(Arrays.toString(PrintReverseArray(arr,0,len)));
    }
}
