package nvirt;

import java.time.LocalDate;

public class Palimentare extends Prodotto {
    private LocalDate dataScadenza;

    public Palimentare(String nome, double prezzo, int quantita, LocalDate dataScadenza) {
        super(nome, prezzo, quantita);
        this.dataScadenza = dataScadenza;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public boolean èScaduto() {
        LocalDate oggi = LocalDate.now();
        return oggi.isAfter(dataScadenza);
    }

    @Override
    public String toString() {
        return super.toString() + ", Scadenza: " + dataScadenza + (èScaduto() ? " (SCADUTO)" : " (ancora valido)");
    }
}
