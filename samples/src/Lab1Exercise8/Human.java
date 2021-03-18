package Lab1Exercise8;

public class Human {

	 	private String name = "";
		private double humanWeightEarth = 0;
		private double humanWeightMars = 0;
		
		void setName(String name) {
			this.name = name;
		}
		
		String getName()
		{
			return name;
		}
		
		void setHumanWeightEarth(double weight) {
			this.humanWeightEarth = weight;
		}
		
		double getHumanWeightEarth() {
			return humanWeightEarth;
		}
		
		void setHumanWeightMars(double weight) {
			this.humanWeightMars = weight;
		}
		
		double getHumanWeightMars() {
			return humanWeightMars;
		}
}
