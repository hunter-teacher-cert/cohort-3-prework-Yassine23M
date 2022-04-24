import java.util.Scanner;
public class Celcius {
    public static void main(String[] args) {
        double C;
        double F;
        final double FRAC = (9.0/5.0);
        final double ADD = 32;
        Scanner in = new Scanner(System.in);

        // prompt the user to enter temperature in Celcius
        System.out.print("Enter Temp in Celcius ");
        num = in.nextDouble();

        // convert to Fahrenheit and print
        F = (C*FRAC)+ADD;
        System.out.printf("%.1f C = %.1f F", C,F);
      }
}