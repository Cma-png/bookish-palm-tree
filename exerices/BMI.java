import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      double m = sc.nextDouble();
      double MinW = m * m * 18.5;
      double MaxW = m * m * 25;
      System.out.printf(" For %1.2f m, the normal weight should be between %.2f kg and %.2f kg.\n", m, MinW, MaxW);
    }
}
