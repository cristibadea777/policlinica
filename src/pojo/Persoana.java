package pojo;

import validare.ValidarePersoana;

public class Persoana {
    private String nume;
    private String prenume;
    private long varsta;
    private String nrtelefon;
    private String cnp;
    private String email;
    private String img;

    private ValidarePersoana validarePersoana = new ValidarePersoana();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        if(validarePersoana.esteValidNume(nume))
            this.nume = nume;
        else
            throw new IllegalArgumentException("Introdu un nume valid");
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        if(validarePersoana.esteValidNume(nume))
            this.prenume = prenume;
        else
            throw new IllegalArgumentException("Introdu un prenume valid");
    }

    public long getVarsta() {
        return varsta;
    }

    public void setVarsta(long varsta) {
        if(validarePersoana.esteValidVarsta(String.valueOf(varsta)))
            this.varsta = varsta;
        else
            throw new IllegalArgumentException("Introdu o varsta valida");
    }

    public String getNrtelefon() {
        return nrtelefon;
    }

    public void setNrtelefon(String nrtelefon) {
        if(validarePersoana.esteValidTelefon(nrtelefon))
            this.nrtelefon = nrtelefon;
        else
            throw new IllegalArgumentException("Introdu un numar de telefon valid");
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        if(validarePersoana.esteValidCNP(cnp))
            this.cnp = cnp;
        else
            throw new IllegalArgumentException("Introdu un CNP valid");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(validarePersoana.esteValidEmail(email))
            this.email = email;
        else
            throw new IllegalArgumentException("Introdu un email valid");
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Persoana(String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrtelefon = nrtelefon;
        this.cnp = cnp;
        this.email = email;
        this.img = img;
    }

    public Persoana() {
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", nrtelefon='" + nrtelefon + '\'' +
                ", cnp='" + cnp + '\'' +
                ", email='" + email + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
