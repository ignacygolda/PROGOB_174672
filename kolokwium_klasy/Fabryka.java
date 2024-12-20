import java.util.ArrayList;

public class Fabryka {
    private ArrayList<Elf> listaElfow;
    private double dlGeo;
    private double szGeo;

    public Fabryka(double dlGeo, double szGeo) {
        this.listaElfow = new ArrayList<>();
        if(dlGeo>=-180 && dlGeo<=180) this.dlGeo = dlGeo;
        else throw new IllegalArgumentException("dlGeo musi być w przedziale od -180 do 180.");
        if(szGeo>=-90 && szGeo<=90) this.szGeo = szGeo;
        else throw new IllegalArgumentException("dlGeo musi być w przedziale od -90 do 90.");
    }

    public ArrayList<Elf> getListaElfow() {
        return listaElfow;
    }

    public void setListaElfow(ArrayList<Elf> listaElfow) {
        if(listaElfow!=null && !listaElfow.isEmpty()) this.listaElfow = listaElfow;
        else throw new IllegalArgumentException("Lista elfów nie może być nullem, ani nie może być pusta.");
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo>=-180 && dlGeo<=180) this.dlGeo = dlGeo;
        else throw new IllegalArgumentException("dlGeo musi być w przedziale od -180 do 180.");
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(double szGeo) {
        if(szGeo>=-90 && szGeo<=90) this.szGeo = szGeo;
        else throw new IllegalArgumentException("dlGeo musi być w przedziale od -90 do 90.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fabryka fabryka = (Fabryka) o;
        return Double.compare(getDlGeo(), fabryka.getDlGeo()) == 0 && Double.compare(getSzGeo(), fabryka.getSzGeo()) == 0 && getListaElfow().equals(fabryka.getListaElfow());
    }

    @Override
    public int hashCode() {
        int result = getListaElfow().hashCode();
        result = 31 * result + Double.hashCode(getDlGeo());
        result = 31 * result + Double.hashCode(getSzGeo());
        return result;
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "listaElfow=" + listaElfow +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }

    public void dodajPracownika(Elf elf) {
        this.listaElfow.add(elf);
    }

    public void usunPracownika(Elf elf) {
        this.listaElfow.remove(elf);
    }

    public Elf najstarszyPracownik() {
        if(this.listaElfow!=null && this.listaElfow.size()>0) {
            Elf najstarszy = this.listaElfow.get(0);
            for(Elf e : this.listaElfow) {
                if(e.getWiek()>najstarszy.getWiek()) najstarszy = e;
            }
            return najstarszy;
        }
        else {
            System.out.println("Lista elfów jest pusta.");
            return null;
        }
    }
}
