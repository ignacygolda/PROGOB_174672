public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        if(!imie.isEmpty()) this.imie = imie;
        else throw new IllegalArgumentException("Imie nie może być puste.");
        if(predkosc>0) this.predkosc = predkosc;
        else throw new IllegalArgumentException("Prędkość nie może być ujemna");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(!imie.isEmpty()) this.imie = imie;
        else throw new IllegalArgumentException("Imie nie może być puste.");
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc>0) this.predkosc = predkosc;
        else throw new IllegalArgumentException("Prędkość nie może być ujemna");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Renifer renifer = (Renifer) o;
        return getPredkosc() == renifer.getPredkosc() && getImie().equals(renifer.getImie());
    }

    @Override
    public int hashCode() {
        int result = getImie().hashCode();
        result = 31 * result + getPredkosc();
        return result;
    }

    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    public void nakarmRenifera() {
        this.predkosc+=5;
    }
}
