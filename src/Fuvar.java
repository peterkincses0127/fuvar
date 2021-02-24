import java.sql.Timestamp;

public class Fuvar {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndulas() {
        return indulas;
    }

    public void setIndulas(String indulas) {
        this.indulas = indulas;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public void setIdotartam(int idotartam) {
        this.idotartam = idotartam;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(double tavolsag) {
        this.tavolsag = tavolsag;
    }

    public double getViteldij() {
        return viteldij;
    }

    public void setViteldij(double viteldij) {
        this.viteldij = viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public void setBorravalo(double borravalo) {
        this.borravalo = borravalo;
    }

    public String getFizetesMod() {
        return fizetesMod;
    }

    public void setFizetesMod(String fizetesMod) {
        this.fizetesMod = fizetesMod;
    }

    public Fuvar(int id, String indulas, int idotartam, double tavolsag, double viteldij, double borravalo, String fizetesMod) {
        this.id = id;
        this.indulas = indulas;
        this.idotartam = idotartam;
        this.tavolsag = tavolsag;
        this.viteldij = viteldij;
        this.borravalo = borravalo;
        this.fizetesMod = fizetesMod;
    }

    private int id ;
    private String indulas;
    private int idotartam;
    private double tavolsag;
    private double viteldij;
    private double borravalo;
    private String fizetesMod;


}
