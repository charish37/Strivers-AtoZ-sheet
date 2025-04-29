import java.util.Arrays;

public class ReverseNumbers {

    // public static int[] PrintReverseArray(int[] arr,int i, int j){
    //    if(i >= j) return arr;
    //    int temp = arr[i];
    //    arr[i] = arr[j];
    //    arr[j] = temp;
    //    return PrintReverseArray(arr, i+1, j-1);

    // improve performance by using loops instead of recursion

    public static int[] PrintReverseArray(int[] arr){
        
        int len = arr.length-1;
        int i=0,j=len;
       while(i < j){
         int temp = arr[i];
         arr[i++] = arr[j];
         arr[j--] = temp;
       }
       return arr;
    }
    public static void main(String args[]){
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(PrintReverseArray(arr)));
    }
}
