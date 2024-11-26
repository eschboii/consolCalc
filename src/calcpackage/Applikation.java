package calcpackage;
import java.util.Scanner;

public class Applikation {
    Scanner scan = new Scanner(System.in);

    int tal1;
    int tal2;
    int summa;

    int caseChoice;
    private Addition addera = new Addition();


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
        switchyCase(caseChoice);

        System.out.print("Din summa är: " + summa);

    }

    public int switchyCase (int caseChoice){

        switch(caseChoice){
            case 1: summa = addera.add(tal1, tal2);
                break;
                case 2:
                    break; summa = 
                    case 3:
                        break;
                        case 4:
                            break;
        }

        return summa;

    }



}
