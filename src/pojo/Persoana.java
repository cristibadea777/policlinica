package pojo;

public class Persoana {
    private String nume;
    private String prenume;
    private long varsta;
    private String nrtelefon;
    private String cnp;
    private String email;
    private String img;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public long getVarsta() {
        return varsta;
    }

    public void setVarsta(long varsta) {
        this.varsta = varsta;
    }

    public String getNrtelefon() {
        return nrtelefon;
    }

    public void setNrtelefon(String nrtelefon) {
        this.nrtelefon = nrtelefon;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
