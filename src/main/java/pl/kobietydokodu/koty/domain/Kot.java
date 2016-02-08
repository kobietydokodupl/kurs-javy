package pl.kobietydokodu.koty.domain;

import java.util.Date;

/**
 * Klasa reprezentująca kota.
 */
public class Kot {

    /**
     * Imię kota.
     */
    private String imie;
    
    /**
     * Data urodzenia kota.
     */
    private Date dataUrodzenia;
    
    /**
     * Waga kota.
     */
    private Float waga;
    
    /**
     * Imię opiekuna kota.
     */
    private String imieOpiekuna;
	
    /**
     * Metoda, która opisuje kota pełnym zdaniem.
     * @return Opis kota w postaci zdania.
     */
	public String przedstawSie() {
		return "Cześć, jestem "+imie+", urodziłem się "+dataUrodzenia+", ważę "+waga+", a opiekuje się mną " + imieOpiekuna;
	}

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

}
