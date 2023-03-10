package pojo;

public class Analiza {
    private long analizaId;
    private String numeAnaliza;
    private long pret;

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
        this.numeAnaliza = numeAnaliza;
    }

    public void setPret(long pret) {
        this.pret = pret;
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
