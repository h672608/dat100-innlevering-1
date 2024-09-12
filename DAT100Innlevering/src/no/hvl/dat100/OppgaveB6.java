package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveB6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekten din: ");
        double bruttoInntekt = scanner.nextDouble();
  
        scanner.close();
       
        double trinnskatt = beregnTrinnskatt(bruttoInntekt);

        System.out.printf("Du skal betale %.2f kr i trinnskatt.%n", trinnskatt);
    }

    public static double beregnTrinnskatt(double inntekt) {
        double trinnskatt = 0.0;
        
        if (inntekt > 1_350_000) {
            trinnskatt += (inntekt - 1_350_000) * 0.176;
            inntekt = 1_350_000;
        }

        if (inntekt > 937_900) {
            trinnskatt += (inntekt - 937_900) * 0.166;
            inntekt = 937_900;
        }

        if (inntekt > 670_000) {
            trinnskatt += (inntekt - 670_000) * 0.136;
            inntekt = 670_000;
        }

        if (inntekt > 292_850) {
            trinnskatt += (inntekt - 292_850) * 0.04;
            inntekt = 292_850;
        }

        if (inntekt > 208_050) {
            trinnskatt += (inntekt - 208_050) * 0.017;
        }

        return trinnskatt;
    }
}