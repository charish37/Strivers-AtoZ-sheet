import java.util.ArrayList;
import java.util.Scanner;

public class PrintDivisors {

    public static ArrayList<Integer> findDivisors(int num){
       ArrayList<Integer> divisors = new ArrayList<>();
       int sqRootValue = (int) Math.sqrt(num);

       for(int i = 1; i <= sqRootValue; i++){
          int otherVal = num / i;
          if(num % i == 0 && i != otherVal){
            divisors.add(i);
            divisors.add(otherVal);
          } else {
            divisors.add(i);
          }
       }
       return divisors;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(findDivisors(sc.nextInt()));
    }
}
