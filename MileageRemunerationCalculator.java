import java.util.Scanner;

public class MileageRemunerationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter beginning odometer reading: ");
        double start = scanner.nextDouble();

        System.out.print("Enter ending odometer reading: ");
        double end = scanner.nextDouble();

    
        double distance = end - start;

        
        double remuneration = Math.round(distance * 25);
        System.out.printf("You traveled %.2f miles. At Rs.25 per mile, your remuneration is Rs.%.2f\n",
                          distance, remuneration);
    }
}
