package nvirt;

import java.time.LocalDate;

public class Palimentare extends Prodotto{
    private LocalDate dataScadenza;

    public Palimentare(String nome, double prezzo, int quantita, LocalDate dataScadenza) {
        super(nome, prezzo, quantita);
        this.dataScadenza = dataScadenza;
    }
    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
    public void setDataScadenza(LocalDate Scadenza) {
        this.dataScadenza = Scadenza;
    }
    public boolean Scaduto(){
        LocalDate oggi = LocalDate.now();
        return oggi.isAfter(this.dataScadenza);
    }
    @Override
    public String toString() {
        if(Scaduto()){
            return "Prodotto alimentare [Scadenza=" + dataScadenza + ", nome=" + getNome() + ", prezzo=" + getPrezzo() + ", quantita=" + getQuantita() + "]";
        }else{
            return "Prodotto alimentare Scaduto [Scadenza=" + dataScadenza + ", nome=" + getNome() + ", prezzo=" + getPrezzo() + ", quantita=" + getQuantita() + "]";
        }
    }
}
