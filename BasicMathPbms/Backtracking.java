import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public static void backTracking(int[] arr,int start,int end, List<List<Integer>> result, List<Integer> sublist){
        result.add(new ArrayList<>(sublist));
        for(int i = start; i< end; i++){
        sublist.add(arr[i]);
        backTracking(arr, start+1, end, result, sublist);
        sublist.remove(sublist.size() - 1);
       }  
    }

    public static void main(String args[]){
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> Sublist = new ArrayList<>();
        int[] arr = new int[]{1,2,3};
        backTracking(arr,0,arr.length, results,Sublist);
        System.out.println(results);
    }
}
