package Es2;


public class Chiamata {
   String durata;
     String numeroChiamato;


    public Chiamata(String durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }
    @Override
    public String toString() {
        return "Chiamata{" +
                "durata='" + durata + '\'' +
                ", numeroChiamato='" + numeroChiamato + '\'' +
                '}';
    }



}
