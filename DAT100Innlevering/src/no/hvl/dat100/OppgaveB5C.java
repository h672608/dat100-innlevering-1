package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveB5C {

    public static String getGrade(int score) {
        if (score >= 90) {
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

        
        for (int i = 1; i <= 10; i++) {
            int score = -1; 
            boolean validInput = false; 

            
            while (!validInput) {
                System.out.print("Skriv inn poengsum for student " + i + ": ");

                if (scanner.hasNextInt()) {
                    score = scanner.nextInt();
                    
                    if (score >= 0 && score <= 100) {
                        validInput = true; 
                    } else {
                        System.out.println("Feilmelding: Ugyldig poengsum. Poeng må være mellom 0 og 100.");
                    }
                } else {
                    
                    System.out.println("Feilmelding: Ugyldig input, vennligst skriv inn et heltall.");
                    scanner.next(); 
                }
            }

            System.out.println(getGrade(score));
        }

        scanner.close();
    }
}
