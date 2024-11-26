package calcpackage;
import java.util.Scanner;

public class Applikation {
    Scanner scan = new Scanner(System.in);

    int tal1;
    int tal2;
    int summa;

    int caseChoice;


    public Applikation() {
        new Addition();

        prompt();
        switchyCase(caseChoice);

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

    }

    public int switchyCase (int caseChoice){

        switch(caseChoice){
            case 1: Addition
                break;
                case 2:
                    break;
                    case 3:
                        break;
                        case 4:
                            break;
        }

        return caseChoice;

    }



}
