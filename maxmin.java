import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        int max, min;

        
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        
        System.out.println("Max=" + max + " Min=" + min);
    }
}

    

