import java.util.Scanner;


public class Drob{
    private int Chisl;
    private int Znam;

    public Drob(int znam, int chisl) {
        Znam = znam;
        Chisl = chisl;
    }

    public void setZnam(int znam) {
        Znam = znam;
    }

    public void setChisl(int chisl) {
        Chisl = chisl;
    }

    public void printDrob(){
        IO.println(String.format("Ответ:  %d/%d", Chisl, Znam));
    }

    public int getChisl() {
        return Chisl;
    }

    public int getZnam() {
        return Znam;
    }

    public Drob plus (Drob drob2){
        int znamFinal = this.Znam * drob2.Znam;
        int chicl1 = this.Chisl* drob2.Znam;
        int chicl2 = drob2.Chisl *this.Znam;
        int chislFinal = chicl1 + chicl2;
        IO.println(String.format("Ответ:  %d/%d", chislFinal, znamFinal));


        Drob drob3 = new Drob(
                chislFinal,
                znamFinal
        );
        return drob3;
    }


    public Drob minus (Drob drob2){
        int znamFinal = this.Znam * drob2.Znam;
        int chicl1 = this.Chisl* drob2.Znam;
        int chicl2 = drob2.Chisl *this.Znam;
        int chislFinal = chicl1 - chicl2;
        IO.println(String.format("Ответ:  %d/%d", chislFinal, znamFinal));


        Drob drob3 = new Drob(
                chislFinal,
                znamFinal
        );
        return drob3;
    }

    public Drob multiplication(Drob drob2){
        int znamFinal = this.Znam * drob2.Znam;
        int chislFinal = this.Chisl * drob2.Chisl;
        IO.println(String.format("Ответ:  %d/%d", chislFinal, znamFinal));


        Drob drob3 = new Drob(
                chislFinal,
                znamFinal
        );
        return drob3;
    }

    public Drob division(Drob drob2){
        int znamFinal = this.Znam * drob2.Chisl;
        int chislFinal = this.Chisl * drob2.Znam;
        IO.println(String.format("Ответ:  %d/%d", chislFinal, znamFinal));


        Drob drob3 = new Drob(
                chislFinal,
                znamFinal
        );
        return drob3;
    }
}





void main() {
    Scanner scanner = new Scanner(System.in);

    Drob drob1 = new Drob(
            2,
            5
    );

    Drob drob2 = new Drob(
            3,
            10
    );


    drob1.printDrob();

    Drob pluss = drob1.plus(drob2);
    Drob minuss = drob1.minus(drob2);
    Drob multiplicationn = drob1.multiplication(drob2);
    Drob divisionn = drob1.division(drob2);


}