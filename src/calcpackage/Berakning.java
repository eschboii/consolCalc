package calcpackage;

public class Berakning {

    private Addition addera = new Addition();
    private Division division = new Division();
    private Multiplikation multiplicera = new Multiplikation();
    private Subtraktion subtrahera = new Subtraktion();

    public double switchyCase(int caseChoice, double tal1, double tal2) {

        switch (caseChoice) {
            case 1:
                return addera.add(tal1, tal2);

            case 2:
                return subtrahera.sub(tal1, tal2);

            case 3:
                return multiplicera.multi(tal1, tal2);


            case 4:
                return division.div(tal1, tal2);

            default:
                System.out.println("Du skrev inte in rätt lul");
                return 0;
        }


    }
}
