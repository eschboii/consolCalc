package calcpackage;
import java.util.Scanner;

public class Applikation {
    Scanner scan = new Scanner(System.in);

    double tal1;
    double tal2;
    int caseChoice;

    private Berakning berakning = new Berakning();

    public Applikation() {
        prompt();
    }

    public void prompt() {
        while (true) {
            System.out.println("Välj beräkningssätt eller avsluta");
            System.out.println("1. Addition");
            System.out.println("2. Substraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Quit");
            caseChoice = scan.nextInt();

            if (caseChoice == 5) {
                System.out.println("Avslutar programmet.");
                break;
            }

            System.out.print("Första talet: ");
            tal1 = scan.nextDouble();

            System.out.println("Skriv in nästa tal");
            tal2 = scan.nextDouble();

            double summa = berakning.switchyCase(caseChoice, tal1, tal2);

            System.out.print("Din summa är: " + summa);
            System.out.println();
            System.out.println();
        }
    }




}
