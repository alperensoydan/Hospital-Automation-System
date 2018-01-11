import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("WELCOME");

		int selection;
		int selection2;
		int selection3;
		int numberOfPatient = 6;

		regist[] patient = new regist[100];

		regist p1 = new regist("195429", "MelihcanKAYRA", "Man", "11.05.1996",
				"AB Rh+", "06.01.2016", "Dermatology", "Esra CARMAN");
		patient[0] = p1;
		regist p2 = new regist("849452", "AlperenSOYDAN", "Man", "03.07.1996",
				"B Rh+", "03.01.2016", "Allergy, Immunology and Pulmonology",
				"Karina W. Davidson");
		patient[1] = p2;
		regist p3 = new regist("197326", "MarryWATSON", "Woman", "19.11.1965",
				"0 Rh+", "11.01.2016", "Psychiatry", "Atheir Abbas");
		patient[2] = p3;
		regist p4 = new regist("264125", "LeeSIN", "Man", "17.01.1983",
				"0 Rh-", "31.12.2015", "Ophthalmology",
				"Vivienne C. Greenstein");
		patient[3] = p4;
		regist p5 = new regist("158793", "TahmKENCH", "Man", "21.06.1975",
				"AB Rh-", "05.01.2015",
				"Endocrinology, Diabetes and Metabolism", "Mundo Shen");
		patient[4] = p5;
		regist p6 = new regist("488251", "AhriKLICKO", "Woman", "04.09.1994",
				"0 Rh-", "08.01.2015", "Family Medicine", "Rachel F. Bregman");
		patient[5] = p6;
		do {
			printMenu();
			selection = input.nextInt();
			if (selection == 1) {

				System.out.println(" Enter the Identity number: ");
				String ID = input.next();
				System.out.println(" Enter the name: ");
				String name = input.next();
				System.out.println(" Enter the gender: ");
				String gender = input.next();
				System.out.println(" Enter the birth date: ");
				String bdate = input.next();
				System.out.println(" Enter the blood group: ");
				String bgroup = input.next();
				System.out.println(" Enter the registration date: ");
				String rdate = input.next();
				System.out.println(" Enter the clinical name: ");
				String cname = input.next();
				System.out.println(" Enter the doctor name: ");
				String dname = input.next();
				System.out.println(" NEW PATIENT ADDED");

				patient[numberOfPatient] = new regist(ID, name, gender, bdate,
						bgroup, rdate, cname, dname);
				numberOfPatient++;

				do {
					printMenu3();

					selection3 = input.nextInt();
					if (selection3 == 0) {
						System.exit(0);
					}

				}
				while (selection != 1);
			}

			else if (selection == 2) {
				do {
					printMenu2();

					selection2 = input.nextInt();

					if (selection2 == 1) {

						System.out.print("Enter ID");
						String s1;
						s1 = input.next();
						for (int a = 0; a < 100; a++) {
							if (patient[a] == null) {
								System.out.println("NO");
								break;
							}
							if (s1.equals(patient[a].getID())) {
								System.out.println(patient[a]);
								break;
							}

						}

					}
					else if (selection2 == 2) {

						System.out
								.print("Enter NAME(Please write your name and surname adjacent):");
						String s1;
						s1 = input.next();
						for (int a = 0; a < 100; a++) {
							if (patient[a] == null) {
								System.out.println("NO");
								break;
							}
							if (s1.equals(patient[a].getNAME())) {
								System.out.println(patient[a]);
								break;
							}

						}

					}
				}
				while (selection2 != 0);

			}

		}
		while (selection != 0);
	}

	public static void printMenu() {
		System.out.println("[1] NEW PATIENT REGISTRATION");
		System.out.println("[2] SEARCH REGISTERED PATIENT");
		System.out.println("[0) EXIT");

	}

	public static void printMenu2() {
		System.out.println("**SEARCHING MENU**");
		System.out.println("[1] by ID");
		System.out.println("[2] by NAME");
		System.out.println("[0] FOR TOP MENU");
	}

	public static void printMenu3() {
		System.out.println("[1] TOP MENU");
		System.out.println("[0] EXIT");
	}

}
