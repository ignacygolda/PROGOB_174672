import java.util.List;

public class KlientFirmowy extends Klient {
    final int NIP;
    final int REGON;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, List<Zamowienie> listaZamowien,int NIP, int REGON) {
        super(imie, nazwisko, adres, listaZamowien);
        this.NIP=NIP;
        this.REGON=REGON;
    }
}
