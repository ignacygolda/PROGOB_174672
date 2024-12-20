import java.util.ArrayList;
import java.util.List;

public class Sanie {
    private List<Renifer> listaReniferow;

    public Sanie() {
        this.listaReniferow = new ArrayList<>();
    }

    public List<Renifer> getListaReniferow() {
        return listaReniferow;
    }

    public void setListaReniferow(List<Renifer> listaReniferow) {
        if(listaReniferow!=null && !listaReniferow.isEmpty()) this.listaReniferow = listaReniferow;
        else throw new IllegalArgumentException("Lista reniferów nie może być nullem, ani nie może być pusta.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sanie sanie = (Sanie) o;
        return getListaReniferow().equals(sanie.getListaReniferow());
    }

    @Override
    public int hashCode() {
        return getListaReniferow().hashCode();
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "listaReniferow=" + listaReniferow +
                '}';
    }

    public void dodajRenifera(Renifer renifer) {
        this.listaReniferow.add(renifer);
    }
    public int sumaPredkosci() {
        int suma=0;
        for(Renifer e : listaReniferow) {
            suma+=e.getPredkosc();
        }
        return suma;
    }

    public Renifer najwolniejszyRenifer() {
        if(listaReniferow!=null && listaReniferow.size()>0) {
            Renifer najwolniejszy = listaReniferow.get(0);
            for(Renifer e : listaReniferow) {
                if(e.getPredkosc()<najwolniejszy.getPredkosc()) {
                    najwolniejszy = e;
                }
            }
            return najwolniejszy;
        }
        else {
            System.out.println("Lista reniferów jest pusta");
            return null;
        }
    }
}
