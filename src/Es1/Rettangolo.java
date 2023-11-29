package Es1;

public class Rettangolo {
// Attributi:
    private int altezza;
    private int larghezza;
// Costruttori

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
// GETTER and SETTER


    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
 // METODI NON STATICI
    public int calcolaPerimetro() {
     return 2 * (altezza + larghezza);
    }

    public int calcolaArea() {
        return altezza * larghezza;
    }




}
