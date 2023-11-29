package ES3;

public class Carrello {
     String cliente_associato;
      int elenco_articoli;
      int costo_articoli;

    public Carrello(String cliente_associato, int elenco_articoli, int costo_articoli){
        this.cliente_associato = cliente_associato;
        this.elenco_articoli = elenco_articoli;
        this.costo_articoli = costo_articoli;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente_associato='" + cliente_associato + '\'' +
                ", elenco_articoli=" + elenco_articoli +
                ", costo_articoli=" + costo_articoli +
                '}';
    }
}
