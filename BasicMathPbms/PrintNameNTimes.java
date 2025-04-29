import java.util.Scanner;

public class PrintNameNTimes {

    public static void printNameRec(String name,int count){
        if(count == 0) return;
        System.out.println(name);
        printNameRec(name, count-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        printNameRec(sc.nextLine(),sc.nextInt());
    }
}
