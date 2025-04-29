import java.util.Scanner;

public class CheckPrime {

    public static boolean findPrime(int n){
        int sqrtValue = (int) Math.sqrt(n);
        for(int i = 2; i<= sqrtValue; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(findPrime(sc.nextInt()));
    }
}