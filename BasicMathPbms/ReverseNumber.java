import java.util.Scanner;

public class ReverseNumber {

    // brute force approach

    public static int reverseNumb(int num){
        int revVal = 0;
        while(num > 0){
            revVal = revVal * 10 + num % 10;
            num = num /10;
        }

        return revVal;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseNumb(sc.nextInt()));
    }
}
