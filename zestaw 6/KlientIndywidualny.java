import java.util.List;

public class KlientIndywidualny extends Klient {
    final int PESEL;

    public KlientIndywidualny(String imie, String nazwisko, Adres adres, List<Zamowienie> listaZamowien, int PESEL) {
        super(imie, nazwisko, adres, listaZamowien);
        this.PESEL=PESEL;
    }
}
