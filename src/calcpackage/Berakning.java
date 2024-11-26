package calcpackage;

public class Berakning {

    private Addition addera = new Addition();
    private Division division = new Division();

    public int switchyCase(int caseChoice, int tal1, int tal2) {

        switch (caseChoice) {
            case 1:
                return addera.add(tal1, tal2);

            case 2:
                break;

            case 3:
                break;

            case 4:
                return division.div(tal1, tal2);

            default:
                System.out.println("Du skrev inte in rätt lul");
                return 0;
        }
                 return 0; // kan tas bort när switch-casen är klar?

    }
}
