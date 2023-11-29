package ES3;

public class Epizon {
    Articolo articolo;
    Cliente cliente;
    Carrello carrello;

    public Epizon (int codice_articolo, String descrizione_articolo, int prezzo, int pezzi_disponibili,int codice_cliente, String nome_cognome, String email, String data_iscrizione,String cliente_associato, int elenco_articoli, int costo_articoli) {

        this.articolo= new Articolo(codice_articolo,descrizione_articolo,prezzo,pezzi_disponibili);
        this.cliente = new Cliente(codice_cliente, nome_cognome, email, data_iscrizione);
        this.carrello = new Carrello(cliente_associato,elenco_articoli,costo_articoli);


    }

    @Override
    public String toString() {
        return "Epizon{" +
                "articolo=" + articolo +
                ", cliente=" + cliente +
                ", carrello=" + carrello +
                '}';
    }
}


