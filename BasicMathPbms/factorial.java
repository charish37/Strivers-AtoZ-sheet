import java.util.Scanner;

public class factorial {

    public static int printFactorial(int num){
        if(num == 0) return 1;
        return num * printFactorial(num-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(printFactorial(sc.nextInt()));
    }
}
