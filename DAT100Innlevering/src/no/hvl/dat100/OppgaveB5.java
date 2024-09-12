package no.hvl.dat100;

	import java.util.Scanner;

	public class OppgaveB5 {

	    public static String getGrade(int score) {
	        if (score < 0 || score > 100) {
	            return "Feilmelding: Ugyldig poengsum.";
	        } else if (score >= 90) {
	            return "Karakter: A";
	        } else if (score >= 80) {
	            return "Karakter: B";
	        } else if (score >= 60) {
	            return "Karakter: C";
	        } else if (score >= 50) {
	            return "Karakter: D";
	        } else if (score >= 40) {
	            return "Karakter: E";
	        } else {
	            return "Karakter: F";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Skriv inn poengsum: ");

	        // Check for valid integer input
	        if (scanner.hasNextInt()) {
	            int score = scanner.nextInt();
	            // Output the corresponding grade
	            System.out.println(getGrade(score));
	        } else {
	            System.out.println("Feilmelding: Ugyldig input, vennligst skriv inn et heltall.");
	        }

	        scanner.close();
	    }
	}	
