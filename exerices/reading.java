import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double [] arr = new double[n];
        int count = arr.length;
        System.out.println("Total number of quiz scores = " + count);
        
        double sum = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        for(int i = 0; i<arr.length; i++){
            sum += arr[i]; //sum
        }
        double average = sum / arr.length; //average
        
      System.out.format("Average = %.2f\n", average);
      
      double variance = 0;
      for (int i = 0; i < arr.length; i++){
          variance += ((arr[i] - average)*(arr[i] - average)) / arr.length  ; //variance
      }
      double standardDeviation = Math.sqrt(variance);
      System.out.format("Standard deviation = %.2f\n", standardDeviation);
    }
}
