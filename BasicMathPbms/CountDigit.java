import java.util.Scanner;

public class CountDigit{

    // brute force approach
    // public  static int countVal(int num){
    //   int count = 0;
    //    while(num > 0){
    //     count++;
    //     num = num / 10;
    //    }
    //   return count;
    // }

    // optimal sol
    public static int countVal(int num){
      return (int) Math.log10(num) + 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int countVal = sc.nextInt();
      System.out.println(countVal(countVal));
    }
}