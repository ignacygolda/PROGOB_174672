import java.util.List;

public interface Klient_interface {
    String getImie();
    void setImie(String imie);
    String getNazwisko();
    void setNazwisko(String nazwisko);
    Adres getAdres();
    void setAdres(Adres adres);
    List<Zamowienie> getListaZamowien();
    void setListaZamowien(List<Zamowienie> listaZamowien);
    void dodajZamowienie(Zamowienie zamowienie);
    void wyswietlHistorieZamowien();
    double obliczLacznyKosztZamowien();
}
