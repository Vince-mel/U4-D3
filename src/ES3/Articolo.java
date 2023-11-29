package ES3;

public class Articolo {
    private int codice_articolo;
    private String descrizione_articolo;
    private int prezzo;
    private int pezzi_disponibili;

    public Articolo(int codice_articolo, String descrizione_articolo, int prezzo, int pezzi_disponibili){
        this.codice_articolo=codice_articolo;
        this.descrizione_articolo=descrizione_articolo;
        this.prezzo=prezzo;
        this.pezzi_disponibili=pezzi_disponibili;
    }

    public void add(Articolo articolo) {
    }
}
