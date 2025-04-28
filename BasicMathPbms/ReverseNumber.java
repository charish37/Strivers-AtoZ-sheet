import java.util.Scanner;

public class ReverseNumber {

    // brute force approach

    public static int reverseNumb(int num){
        int revVal = 0;
        while(num > 0){
            int digit = num % 10;
            int maxVal = Integer.MAX_VALUE;
            int minVal = Integer.MIN_VALUE;
            if(revVal > maxVal / 10 || revVal < minVal/10) return 0;
            revVal = revVal * 10 + digit;
            num = num /10;
        }

        return revVal;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseNumb(sc.nextInt()));
    }
}
