
public class activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentPopulation = 312032486.0;
		double birthPerYear = (365.0*24*60*60) / 7.0;
		double deathPerYear = (365.0*24*60*60) / 13.0;
		double immigrantPerYear = (365.0*24*60*60) / 45.0;
		double decreasePerYear = deathPerYear;
		double increasePerYear = birthPerYear + immigrantPerYear;
		double changePerYear = increasePerYear - decreasePerYear;
		
		System.out.print("The population after 1 Year is " + (currentPopulation + (changePerYear * 1.0)) + "\n");
		System.out.print("The population after 2 Year is " + (currentPopulation + (changePerYear * 2.0)) + "\n");
		System.out.print("The population after 3 Year is " + (currentPopulation + (changePerYear * 3.0)) + "\n");		
		System.out.print("The population after 4 Year is " + (currentPopulation + (changePerYear * 4.0)) + "\n");
		System.out.print("The population after 5 Year is " + (currentPopulation + (changePerYear * 5.0)) + "\n");
	}

}
