import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        Produkt a = new Produkt("lampa",15.99,10);
        Produkt b = new Produkt("lodowka",199.99,2);
        a.wyswietlInformacje();
        a.dodajDoMagazynu(1);
        a.wyswietlInformacje();

        b.wyswietlInformacje();
        b.usunZMagazynu(4);
        b.wyswietlInformacje();

        System.out.println("Zadanie 2:");
        Produkt c = new Produkt("piekarnik",299.99,4);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(a);
        a.wyswietlInformacje();
        koszyk.dodajProdukt(b);
        b.wyswietlInformacje();
        koszyk.dodajProdukt(c);
        koszyk.dodajProdukt(c);
        c.wyswietlInformacje();

        koszyk.wyswietlZawartoscKoszyka();
        double wartosc = koszyk.obliczCalkowitaWartosc();
        System.out.println(wartosc);

        System.out.println("Zadanie 3:");
        Zamowienie zam1 = new Zamowienie(koszyk);
        zam1.wyswietlZamowienie();
        zam1.ustawStatusZamownienia("zrealizowane");
        zam1.wyswietlZamowienie();

        System.out.println("Zadanie 4:");
        List<Zamowienie> lista = new ArrayList<>();
        lista.add(zam1);
        KoszykZakupowy koszyk2 = new KoszykZakupowy();
        b.dodajDoMagazynu(4);
        koszyk2.dodajProdukt(b);
        koszyk2.dodajProdukt(a);
        Zamowienie zam2 = new Zamowienie(koszyk2);
        Klient k1 = new Klient("Andrzej","Nowak",lista);
        k1.dodajZamowienie(zam2);
        k1.wyswietlHistorieZamowien();
        wartosc = k1.obliczLacznyKosztZamowien();
        System.out.println(wartosc);

        
    }
}