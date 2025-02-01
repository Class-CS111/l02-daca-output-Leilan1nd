// PARTNER NAME: Leilani Piland
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 1-30-2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surName, givenName, uscisNum, categoryNum, cardNum;
		surName = "SPECIMEN";
		givenName = "TEST V";
		uscisNum = "000-000-725";
		categoryNum = "c09";
		cardNum = "SRC0000000725";
		char sex = 'M'; 

		//Birthday
		String birthCountry = "Ethiopia";
		String birthMonth = "JAN";
		int birthDay = 01;
		int birthYear = 1920; 

		int validMonth, validDay, validYear;
		validMonth = 01;
		validDay = 01; 
		validYear = 80;
	
		int expireMonth, expireDay, expireYear;
		expireMonth = 5; 
		expireDay = 10;
		expireYear = 11;	
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                           Surname");
		System.out.println("║   ⳼⳼⳼⳼⳼ⲼⲼⲼⲼ⳹⳹⳹⳹⳹      " + surName  );
		System.out.println("║  ◜----.    .----◝ ⳹   Given Name");
		System.out.println("║ (   ◉  \\  /  ◉  )     " + givenName);
		System.out.println("║ |      |  |           USCIS#      Category   Card#");
		System.out.println("║ |    _⟅  ⟅_            "+ uscisNum + "    " + categoryNum +"    "  + cardNum );
		System.out.println("║ ⭛    (_    _)         Country of Birth");
		System.out.println("║  ⭛   ,    `--`    ,      " + birthCountry);
		System.out.println("║   ❲\'-.______.-'❳      Terms and Conditions");
		System.out.println("║    \\   ⩳⩳⩳      /       None ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " +birthDay + " " + birthMonth + " " + birthYear + "	" + sex);
		System.out.println("║                       Valid From:   " + validMonth +" / " + validDay + " / " + validYear);
		System.out.println("║                       Card Expires:  " + expireMonth + " / " + expireDay + " / " + expireYear);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}