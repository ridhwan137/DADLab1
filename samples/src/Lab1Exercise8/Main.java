//DAD_Lab1_Exercise8
package Lab1Exercise8;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		//Declare Scanner to get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert How Many Human: ");
		int humanNumber = sc.nextInt();
		
		// Declare Object
		Humans humans = new Humans();
		Human[] human = new Human[humanNumber];
		
		// Get user input on Name and Weight
		for(int i = 0;i<humanNumber;i++)
		{
			human[i] = new Human();
			
			System.out.print("Insert Name Of Human : ");
			sc.nextLine();
			String name = sc.nextLine();
			human[i].setName(name);
			
			System.out.print("Insert Human Weight (in Kg) : ");
			double weight = sc.nextDouble();
			human[i].setHumanWeightEarth(weight);
		
			Convert WeightOnMars = new Convert();
			human[i].setHumanWeightMars(WeightOnMars.getHumanWeightMars(weight));
			humans.people.add(human[i]);
		}
		sc.close();
		
		//Display Human Weight on Earth and Mars
		for(int i = 0;i<humans.people.size();i++) {
			
		System.out.println("\n"+humans.people.get(i).getName()+" weight on Earth is : "+humans.people.get(i).getHumanWeightEarth()+"Kg");
		System.out.println(humans.people.get(i).getName()+" weight on Mars is : "+String.format("%.2f", humans.people.get(i).getHumanWeightMars())+"Kg");
		}
	}
}
