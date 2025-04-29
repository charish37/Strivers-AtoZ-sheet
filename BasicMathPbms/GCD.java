import java.util.Scanner;

public class GCD {

    // bruteforce

    // public static int findGcd(int num1, int num2){
    //     int gcd = 1;
    //     for(int i = 1; i <= Math.min(num1,num2); i++){
    //         if(num1%i == 0 && num2%i == 0) gcd = i;
    //     }
    //     return gcd;
    // }

    //optimal approach

    public static int findGcd(int num1,int num2){
      while(num1 > 0 && num2 > 0){
        if(num1 > num2) num1 = num1%num2;
        else num2 = num2%num1;
      }
      if(num1 == 0) return num2;
      return num1;
    }

    
    // public static int findGcd(int num1,int num2){
    //     if(num1 == 0) return num2;
    //       else if(num2 == 0) return num1;
    //       else if(num1 > num2) return findGcd(num1-num2, num2);
    //       else return findGcd(num1, num2-num1);
    // }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(findGcd(num1,num2));
    }
}
