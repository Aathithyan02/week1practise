import java.util.Scanner;

public class yearprob {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int year = a/365;
            int rem = a%365;
            int month = rem/30;
            int days =rem%30;
            System.out.println("Years:"+year);
            System.out.println("Month:"+month);
            System.out.println("Days:"+days);
}
}
