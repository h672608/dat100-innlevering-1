package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et heltall n > 0: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Feil: n må være større enn 0.");
        } else {
            long fakultet = beregnFakultet(n);

            System.out.println("n! = " + fakultet);
        }

        scanner.close();
    }

    public static long beregnFakultet(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
