package ES3;

public class Cliente {
    private int codice_cliente;
    private String nome_cognome;
    private String email;
    private String data_iscrizione;

    public Cliente(int codice_cliente, String nome_cognome, String email, String data_iscrizione) {
        this.codice_cliente= codice_cliente;
        this.nome_cognome= nome_cognome;
        this.email = email;
        this.data_iscrizione=data_iscrizione;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codice_cliente=" + codice_cliente +
                ", nome_cognome='" + nome_cognome + '\'' +
                ", email='" + email + '\'' +
                ", data_iscrizione='" + data_iscrizione + '\'' +
                '}';
    }
}


