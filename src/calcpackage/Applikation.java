package calcpackage;
import java.util.Scanner;

public class Applikation {
    Scanner scan = new Scanner(System.in);

    int tal1;
    int tal2;
    int summa;

    int caseChoice;
<<<<<<< HEAD
    private Addition addera = new Addition();


    public Applikation() {
        prompt();
=======


    public Applikation() {
        new Addition();

        prompt();
        switchyCase(caseChoice);

>>>>>>> 4140b4089275b4ee539e800a437ae5040635fbbb
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

<<<<<<< HEAD

        System.out.println("Skriv in nästa tal");
        tal2 = scan.nextInt();
        switchyCase(caseChoice);

        System.out.print("Din summa är: " + summa);
=======
        System.out.println("Skriv in nästa tal");
>>>>>>> 4140b4089275b4ee539e800a437ae5040635fbbb

    }

    public int switchyCase (int caseChoice){

        switch(caseChoice){
<<<<<<< HEAD
            case 1: summa = addera.add(tal1, tal2);
                break;
                case 2:
                    break; summa = 
=======
            case 1: Addition
                break;
                case 2:
                    break;
>>>>>>> 4140b4089275b4ee539e800a437ae5040635fbbb
                    case 3:
                        break;
                        case 4:
                            break;
        }

<<<<<<< HEAD
        return summa;
=======
        return caseChoice;
>>>>>>> 4140b4089275b4ee539e800a437ae5040635fbbb

    }



}
