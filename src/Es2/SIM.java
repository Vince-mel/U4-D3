package Es2;



public class SIM {
    //ATTRIBUTI
    private  int numero_di_telefono;
   private  int credito_disponibile;


   public SIM (int numero_di_telefono){
       this.numero_di_telefono=numero_di_telefono;
       this.credito_disponibile= 0;

   }

    public int getNumero_di_telefono() {
        return numero_di_telefono;
    }

    public void setNumero_di_telefono(int numero_di_telefono) {
        this.numero_di_telefono = numero_di_telefono;
    }

    public int getCredito_disponibile() {
        return credito_disponibile;
    }

    public void setCredito_disponibile(int credito_disponibile) {
        this.credito_disponibile = credito_disponibile;
    }

    public void StampaDatiSim(){
       System.out.println("numero di telefono : "+numero_di_telefono+ " Credito residuo : "+credito_disponibile);

   }



}
