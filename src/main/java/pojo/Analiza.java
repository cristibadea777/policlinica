package main.java.pojo;

import main.java.validare.ValidareAnaliza;

public class Analiza {
    private long analizaId;
    private String numeAnaliza;
    private long pret;

    private ValidareAnaliza validareAnaliza;

    public long getAnalizaId() {
        return analizaId;
    }

    public String getNumeAnaliza() {
        return numeAnaliza;
    }

    public long getPret() {
        return pret;
    }

    public void setAnalizaId(long analizaId) {
        this.analizaId = analizaId;
    }

    public void setNumeAnaliza(String numeAnaliza) {
        //validare nume analiza
        if(validareAnaliza.esteNumeAnalizaValid(numeAnaliza))
            this.numeAnaliza = numeAnaliza;
        else
            throw new IllegalArgumentException("Introdu un nume valid pentru analiza");
    }

    public void setPret(long pret) {
        if(validareAnaliza.estePretValid(String.valueOf(pret)))
            this.pret = pret;
        else
            throw new IllegalArgumentException("Introdu un pret valid pentru analiza");
    }

    public Analiza(long analizaId, String numeAnaliza, long pret) {
        this.analizaId = analizaId;
        this.numeAnaliza = numeAnaliza;
        this.pret = pret;
    }

    public Analiza() {
    }

    public Analiza(String numeAnaliza, long pret) {
        this.numeAnaliza = numeAnaliza;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Analiza{" +
                "analizaId=" + analizaId +
                ", numeAnaliza='" + numeAnaliza + '\'' +
                ", pret=" + pret +
                '}';
    }
}
