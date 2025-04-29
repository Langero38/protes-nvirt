package nvirt;
import java.time.LocalDate;
public class nvirt {
	
	private nvirt(){
	}

	/**
	 * 
	 * @param args Command line arguments
	 * @author 
	 * @version 
	 */
    public static void main(String[] args){
       Negozio negozio = new Negozio();
	   char scelta='0';
	   do{
		   System.out.print("\033[H\033[2J");
		   System.out.flush();
		   System.out.println("1.aggiungi prodotto");
		   System.out.println("2.stampa inventario");
		   System.out.println("3.valore inventario");
		   System.out.println("4.esci");
		   System.out.print("scegli un opzione: ");
		   scelta=System.console().readLine().charAt(0);
		   switch(scelta){
			   case '1':
			       Prodotto p=null;
				   System.out.println("inserisci nome prodotto: ");
				   String nome=System.console().readLine();
				   System.out.println("inserisci prezzo prodotto: ");
				   double prezzo=Double.parseDouble(System.console().readLine());
				   System.out.println("inserisci quantita prodotto: ");
				   int quantita=Integer.parseInt(System.console().readLine());
				   System.out.println("è un prodotto alimentare? (s/n)");
				   if(System.console().readLine().charAt(0)=='s'){
					   System.out.println("inserisci l'anno di scadenza: ");
					   int anno=Integer.parseInt(System.console().readLine());
					   System.out.println("inserisci il mese di scadenza: ");
					   int mese=Integer.parseInt(System.console().readLine());
					   System.out.println("inserisci il giorno di scadenza: ");
					   int giorno=Integer.parseInt(System.console().readLine());
					   LocalDate dataScad=LocalDate.of(anno, mese, giorno);
					   if(nome.length()>0 && prezzo>0 && quantita>0){
					   p=new Palimentare(nome, prezzo, quantita, dataScad);
					   }
					   else{
						   System.out.println("dati non validi, prodotto non aggiunto");
					   }
				   }
				   else{
					   if(nome.length()>0 && prezzo>0 && quantita>0){
					   p=new Prodotto(nome, prezzo, quantita);
					   }
					   else{
						   System.out.println("dati non validi, prodotto non aggiunto");
					   }
				   }
				   negozio.aggiungiProdotto(p);
				   break;
			   case '2':
				   negozio.stampaInventario();
				   break;
			   case '3':
				   System.out.println("valore inventario: "+negozio.ValoreInventario());
				   break;
			   case '4':
				   System.out.println("uscita dal programma...");
				   break;
			   default:
				   System.out.println("opzione non valida");
				   break;
		   }
		   System.out.println("premi invio per continuare...");
		   System.console().readLine();
		   
	   }while(scelta!='4');
    }

}