import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(int val){
        // brute force approach is to reverse a value and check either two values are same or not
      int revVal = 0;
      while(val > revVal){
        revVal = revVal * 10 + val % 10;
        val = val / 10;
      }
       return val == revVal || val == revVal / 10;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(checkPalindrome(sc.nextInt()));
    }
}
