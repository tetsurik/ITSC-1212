
public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometer = 14;
		double minute = 45;
		double second = 30;
		double mile = kilometer / 1.6;
		double hour = (minute *(1.0/60)) + (second * (1.0/(60*60)));
		double mph = mile/hour;
		
		System.out.print("The Speed in mph is " + mph);
	}
}
