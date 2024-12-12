import java.util.Objects;

public class Platnosc implements Platnosc_interface {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if(kwota>=0) this.kwota = kwota;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci!=null) this.statusPlatnosci = statusPlatnosci;
        else throw new IllegalArgumentException("Niepoprawne dane");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Platnosc platnosc = (Platnosc) obj;
        if(this.kwota == platnosc.getKwota() && this.statusPlatnosci.equals(platnosc.getStatusPlatnosci())) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }

    public void zaplac() {
        this.statusPlatnosci = "Opłacone";
    }
}
