import java.util.Scanner;
import java.util.*;

public class Fibonacci {

    

    public static int printFibonacci(int num,Integer[] arr){
        if(num < 2) {
            arr[num] = num;
            return num;
        } else {
            if(arr[num-2] == null){
                arr[num-2] = printFibonacci(num-2,arr);
            } 
            if(arr[num-1] == null){
                arr[num-1] = printFibonacci(num-1,arr);
            }
        }
        return arr[num-2] + arr[num-1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for arr change array type from int[] to Integer[], because Integer is an object wrapper for int, and can hold null values.


        Integer[] arr = new Integer[n+1];
        Arrays.fill(arr,null);
        System.out.println(printFibonacci(n,arr));
    }
}
