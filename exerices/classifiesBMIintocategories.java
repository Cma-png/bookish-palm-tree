import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      double kg = sc.nextDouble();
      double m = sc.nextDouble();
      double bmi = kg / (m * m);
      System.out.printf("%1.2f kg, %1.2f m, BMI = %.2f", kg, m, bmi);
        if(bmi < 18.5) {
            System.out.println(" (Underweight)");
            
        } else if ((bmi >= 18.5) && (bmi < 25)) {
            System.out.println(" (Normal)");
            
        } else if ((bmi >= 25) && (bmi < 30)) {
            System.out.println(" (Overweight)");
            
        } else {
            System.out.println(" (Obese)");
        }
    }
}
