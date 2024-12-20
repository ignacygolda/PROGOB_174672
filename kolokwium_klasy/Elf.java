public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        if(!imie.isEmpty()) this.imie = imie;
        else throw new IllegalArgumentException("Imie nie może być puste.");
        if(wiek>0) this.wiek = wiek;
        else throw new IllegalArgumentException("Wiek nie może być ujemny.");
        if(!imie.isEmpty()) this.stanowisko = stanowisko;
        else throw new IllegalArgumentException("Stanowisko nie może być puste.");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(!imie.isEmpty()) this.imie = imie;
        else throw new IllegalArgumentException("Imie nie może być puste.");
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek>0) this.wiek = wiek;
        else throw new IllegalArgumentException("Wiek nie może być ujemny.");
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(!imie.isEmpty()) this.stanowisko = stanowisko;
        else throw new IllegalArgumentException("Stanowisko nie może być puste.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elf elf = (Elf) o;
        return getWiek() == elf.getWiek() && getImie().equals(elf.getImie()) && getStanowisko().equals(elf.getStanowisko());
    }

    @Override
    public int hashCode() {
        int result = getImie().hashCode();
        result = 31 * result + getWiek();
        result = 31 * result + getStanowisko().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }

    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + this.imie + ", mam " + this.wiek + " lat, a moje stanowisko pracy to " + this.stanowisko + ".");
    }
}
