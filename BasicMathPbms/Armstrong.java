import java.util.Scanner;

public class Armstrong {

    public static boolean checkArmstrong(int num){
        int power = (int)Math.log10(num) + 1;
        int temp = num;
        int sum = 0;
      while(temp > 0){
        int digit = temp % 10;
        sum = sum + (int)Math.pow(digit, power);
        temp /= 10;
      }
      return num == sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println(checkArmstrong(sc.nextInt()));
    }
}
