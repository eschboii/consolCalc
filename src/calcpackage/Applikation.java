package calcpackage;
import java.util.Scanner;

public class Applikation {
    Scanner scan = new Scanner(System.in);

    int tal1;
    int tal2;
    int caseChoice;

    private Berakning berakning = new Berakning();

    public Applikation() {
        prompt();
    }

    public void prompt(){
        System.out.println("Hej, skriv in ett tal och välj beräkningssystem och sedan andra talet!");
        System.out.print("Första talet: ");
        tal1 = scan.nextInt();

        System.out.println("Välj beräkningssätt!");
        System.out.println("1. Addition");
        System.out.println("2. Substraktion");
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
        caseChoice = scan.nextInt();

        System.out.println("Skriv in nästa tal");
        tal2 = scan.nextInt();

        int summa = berakning.switchyCase(caseChoice, tal1, tal2);

        System.out.print("Din summa är: " + summa);


    }




}
