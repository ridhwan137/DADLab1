//DAD_Lab1_Exercise7

package Lab1Exercise7;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args)
    {
        //Declare Variable
        double weightOnEarth;
        double weightOnMars;
        
        //Calculate the  weight on Earth
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter Your Weight: ");
        weightOnEarth = sc.nextDouble();
        
        sc.close();
        
        System.out.print("\nYour weight on Earth is: " + String.format("%.2f",weightOnEarth)+ "Kg");
        
        // Convert Weight on Earth to Mar
        weightOnMars = (weightOnEarth/9.81) * 3.711;
        
        System.out.print("\nYour weight on Mars is: " + String.format("%.2f",weightOnMars)+ "Kg");
        
    }
    
}
