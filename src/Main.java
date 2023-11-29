import ES3.Articolo;
import ES3.Epizon;
import Es1.Rettangolo;
import Es2.SIM;


public class Main {

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        stampaRettangolo(r1);
        stampaRettangolo(r2);
        System.out.println("Somma delle aree: " + (r1.calcolaArea() + r2.calcolaArea()));
        System.out.println("Somma dei perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
    }

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 6);
        stampaDueRettangoli(r1, r2);
        SIM sim1 = new SIM(3938883,"8 minuti","324423342");
        System.out.println(sim1);
        Epizon data1 = new Epizon(234234,"cover cellulare",23,10,234234,"Bastiano Urpi","bastianu@urpi.it","Iscritto il 10/02/2010","Bastianu Urpi",4,1000);
        System.out.println(data1);

    }
}

