/*
 * @author Tetsu Ri
 * @version 05/30/2019
 * 
 * Description:
 * 			This program should have the user input their birth month and birth day. 
 * 			Then, display their Zodiac Sign (Aries, Taurus, etc.), as well as one additional fact about that particular sign.

			Lastly, it will randomly generated month and day and display the Zodiac Sign of this random date.

 * 
 * Pseudocode:
 * 			create Scanner 
			Prompt the user for month and date
			Create variables for month and date
			Create random month and date
			Create string for sign and info
			Create if-else statement for picking the right signs according to month and date
				Capricorn: Jan. 20 – Feb. 16 
				Aquarius: Feb. 16 – March 11 
				Pisces: March 11 – April 18 
				Aries: April 18 – May 13 
				Taurus: May 13 – June 21 
				Gemini: June 21 – July 20 
								Cancer: July 20 – Aug. 10 
				Leo: Aug. 10 – Sept. 16 
				Virgo: Sept. 16 – Oct. 30 
				Libra: Oct. 30 – Nov. 23 
				Scorpio: Nov. 23 – Nov. 29 
				Ophiuchus: Nov. 29 – Dec. 17 
				Sagittarius: Dec. 17 – Jan. 20
			Create if else statement for picking the right info
			Display result for user input
			Display result for random input
		


 */
import java.util.Scanner; // Import Scanner


public class ZodiacSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new Scanner
		Scanner input = new Scanner(System.in);
		
		//Assignment ID
		System.out.println("ID003");
		
		System.out.println("Enter the month you were born: ");
		int month = input.nextInt();
		
		System.out.println("Enter the day you were born: ");
		int day = input.nextInt();
		
		int newMonth = (int)(Math.random() * (12 - 1 + 1)) +1;
		int newDay = (int)(Math.random() * (31 - 1 + 1)) +1; ;
		
		String sign="";
		String info="";
		
		// Logic for picking sign
		 if (month == 1) {
	         if (day < 20)
	            sign = "Capricorn";
	         else
	            sign = "Aquarius";
	      } else if (month == 2) {
	         if (day < 19)
	            sign = "Aquarius";
	         else
	            sign = "Pisces";
	      } else if(month == 3) {
	         if (day < 21)
	            sign = "Pisces";
	         else
	            sign = "Aries";
	      } else if (month == 4) {
	         if (day < 20)
	            sign = "Aries";
	         else
	            sign = "Taurus";
	      } else if (month == 5) {
	         if (day < 21)
	            sign = "Taurus";
	         else
	            sign = "Gemini";
	      } else if( month == 6) {
	         if (day < 21)
	            sign = "Gemini";
	         else
	            sign = "Cancer";
	      } else if (month == 7) {
	         if (day < 23)
	            sign = "Cancer";
	         else
	            sign = "Leo";
	      } else if( month == 8) {
	         if (day < 23) 
	            sign = "Leo"; 
	         else
	            sign = "Virgo";
	      } else if (month == 9) {
	         if (day < 23)
	            sign = "Virgo";
	         else
	            sign = "Libra";
	      } else if (month == 10) {
	         if (day < 23)
	            sign = "Libra";
	         else
	            sign = "Scorpio";
	      } else if (month == 11) {
	         if (day < 22)
	            sign = "scorpio";
	         else
	            sign = "Sagittarius";
	      } else if (month == 12) {  
	         if (day < 22)
	            sign = "Sagittarius"; 
	         else
	            sign ="Capricorn";
	      }
		 // Logic for info
		 if (sign == "Capricorn") {
			 info = "Capricorn is a sign that represents time and responsibility,"
	         			+ " and its representatives are traditional and often very "
	         			+ "serious by nature.";
		 } else if (sign == "Aquarius") {
			 info = "Aquarius-born are shy and quiet , but on the other hand they"
			 		+ " can be eccentric and energetic.";
		 } else if (sign == "Pisces") {
			 info = "Pisces are very friendly, so they often find themselves "
			 		+ "in a company of very different people.";
		 } else if (sign == "Aries") {
			 info = "As the first sign in the zodiac, the presence of Aries always"
			 		+ " marks the beginning of something energetic and turbulent. ";
		 }else if (sign == "Taurus") {
			 info = "Practical and well-grounded, Taurus is the sign that harvests "
			 		+ "the fruits of labor.";
		 }else if (sign == "Gemini") {
			 info = "Expressive and quick-witted, Gemini represents two different"
			 		+ " personalities in one and you will never be sure which one you "
			 		+ "will face. ";
		 }else if (sign == "Cancer") {
			 info = "Deeply intuitive and sentimental, Cancer can be one of the"
			 		+ " most challenging zodiac signs to get to know. ";
		 }else if (sign == "Leo") {
			 info = "People born under the sign of Leo are natural born leaders. "
			 		+ "They are dramatic, creative, self-confident, dominant and "
			 		+ "extremely difficult to resist, able to achieve anything they"
			 		+ " want to in any area of life they commit to.";
		 }else if (sign == "Virgo") {
			 info = "Virgos are always paying attention to the smallest details and"
			 		+ " their deep sense of humanity makes them one of the most careful"
			 		+ " signs of the zodiac. ";
		 }else if (sign == "Libra") {
			 info = "People born under the sign of Libra are peaceful, fair, and they"
			 		+ " hate being alone.";
		 }else if (sign == "Scorpio") {
			 info = "Scorpio-born are passionate and assertive people. They are determined"
			 		+ " and decisive, and will research until they find out the truth. ";
		 }else if (sign == "Sagittarius") {
			 info = "Curious and energetic, Sagittarius is one of the biggest travelers"
			 		+ " among all zodiac signs. ";
		 }
	      System.out.println("Your Zodiac Sign is " + sign + "!");
	      System.out.println(info);
	      
	      System.out.println("Generating random month and day: " + newMonth + " "+ newDay);
	      month = newMonth;
	      day = newDay;
	      if (month == 1) {
		         if (day < 20)
		            sign = "Capricorn";
		         else
		            sign = "Aquarius";
		      } else if (month == 2) {
		         if (day < 19)
		            sign = "Aquarius";
		         else
		            sign = "Pisces";
		      } else if(month == 3) {
		         if (day < 21)
		            sign = "Pisces";
		         else
		            sign = "Aries";
		      } else if (month == 4) {
		         if (day < 20)
		            sign = "Aries";
		         else
		            sign = "Taurus";
		      } else if (month == 5) {
		         if (day < 21)
		            sign = "Taurus";
		         else
		            sign = "Gemini";
		      } else if( month == 6) {
		         if (day < 21)
		            sign = "Gemini";
		         else
		            sign = "Cancer";
		      } else if (month == 7) {
		         if (day < 23)
		            sign = "Cancer";
		         else
		            sign = "Leo";
		      } else if( month == 8) {
		         if (day < 23) 
		            sign = "Leo"; 
		         else
		            sign = "Virgo";
		      } else if (month == 9) {
		         if (day < 23)
		            sign = "Virgo";
		         else
		            sign = "Libra";
		      } else if (month == 10) {
		         if (day < 23)
		            sign = "Libra";
		         else
		            sign = "Scorpio";
		      } else if (month == 11) {
		         if (day < 22)
		            sign = "scorpio";
		         else
		            sign = "Sagittarius";
		      } else if (month == 12) {  
		         if (day < 22)
		            sign = "Sagittarius"; 
		         else
		            sign ="Capricorn";
		      }
			 if (sign == "Capricorn") {
				 info = "Capricorn is a sign that represents time and responsibility,"
		         			+ " and its representatives are traditional and often very "
		         			+ "serious by nature.";
			 } else if (sign == "Aquarius") {
				 info = "Aquarius-born are shy and quiet , but on the other hand they"
				 		+ " can be eccentric and energetic.";
			 } else if (sign == "Pisces") {
				 info = "Pisces are very friendly, so they often find themselves "
				 		+ "in a company of very different people.";
			 } else if (sign == "Aries") {
				 info = "As the first sign in the zodiac, the presence of Aries always"
				 		+ " marks the beginning of something energetic and turbulent. ";
			 }else if (sign == "Taurus") {
				 info = "Practical and well-grounded, Taurus is the sign that harvests "
				 		+ "the fruits of labor.";
			 }else if (sign == "Gemini") {
				 info = "Expressive and quick-witted, Gemini represents two different"
				 		+ " personalities in one and you will never be sure which one you "
				 		+ "will face. ";
			 }else if (sign == "Cancer") {
				 info = "Deeply intuitive and sentimental, Cancer can be one of the"
				 		+ " most challenging zodiac signs to get to know. ";
			 }else if (sign == "Leo") {
				 info = "People born under the sign of Leo are natural born leaders. "
				 		+ "They are dramatic, creative, self-confident, dominant and "
				 		+ "extremely difficult to resist, able to achieve anything they"
				 		+ " want to in any area of life they commit to.";
			 }else if (sign == "Virgo") {
				 info = "Virgos are always paying attention to the smallest details and"
				 		+ " their deep sense of humanity makes them one of the most careful"
				 		+ " signs of the zodiac. ";
			 }else if (sign == "Libra") {
				 info = "People born under the sign of Libra are peaceful, fair, and they"
				 		+ " hate being alone.";
			 }else if (sign == "Scorpio") {
				 info = "Scorpio-born are passionate and assertive people. They are determined"
				 		+ " and decisive, and will research until they find out the truth. ";
			 }else if (sign == "Sagittarius") {
				 info = "Curious and energetic, Sagittarius is one of the biggest travelers"
				 		+ " among all zodiac signs. ";
			 }
	      System.out.println("Your random Zodiac Sign is " + sign + "!");
	      System.out.println(info);
		
	}}