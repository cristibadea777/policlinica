package pojo;

public class Specializare {
    private long specializareId;
    private String numeSpecializare;

    public long getSpecializareId() {
        return specializareId;
    }

    public void setSpecializareId(long specializareId) {
        this.specializareId = specializareId;
    }

    public String getNumeSpecializare() {
        return numeSpecializare;
    }

    public void setNumeSpecializare(String numeSpecializare) {
        this.numeSpecializare = numeSpecializare;
    }

    public Specializare(long specializareId, String numeSpecializare) {
        this.specializareId = specializareId;
        this.numeSpecializare = numeSpecializare;
    }

    public Specializare(String numeSpecializare) {
        this.numeSpecializare = numeSpecializare;
    }

    public Specializare() {
    }

    @Override
    public String toString() {
        return "Specializare{" +
                "specializareId=" + specializareId +
                ", numeSpecializare='" + numeSpecializare + '\'' +
                '}';
    }
}
