
package nvirt;

public class Negozio {
    private Prodotto[] scaffale=new Prodotto[50];
    private int dimensione=0;

    public Negozio(){  
    }
    public void aggiungiProdotto(Prodotto p){
        if(dimensione<scaffale.length){
            scaffale[dimensione]=p;
            dimensione++;
        }else{
            System.out.println("Scaffale pieno, impossibile aggiungere il prodotto.");
        }
    }
    public double ValoreInventario(){
        double valore=0;
        for(int i=0;i<dimensione;i++){
            valore+=scaffale[i].calcolaValoreTotale();
        }
        return valore;
    }
    public void stampaInventario(){
        for(int i=0;i<dimensione;i++){
            if(scaffale[i] instanceof Palimentare){
                System.out.println(scaffale[i].toString());
        }
    }
}
}
