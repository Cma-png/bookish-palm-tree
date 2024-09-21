import java.util.Scanner;
public class Ex1_3 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      double kg = sc.nextDouble();
      double m = sc.nextDouble();
      double bmi = kg / (m * m);
      System.out.printf("%1.2f kg, %1.2f m, BMI = %1.4f\n", kg, m, bmi);
    }
}
