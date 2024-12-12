import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        Produkt a = new Produkt("lampa",15.99);
        Produkt b = new Produkt("lodowka",199.99);
        Magazyn m1 = new Magazyn();
        m1.dodajProdukt(a,10);
        m1.dodajProdukt(b,2);
        System.out.println(m1.toString());
        a.dodajDoMagazynu(m1,1);
        System.out.println(m1.toString());
        b.usunZMagazynu(m1,4);
        System.out.println(m1.toString());

        System.out.println("Zadanie 2:");
        Produkt c = new Produkt("piekarnik",299.99);
        m1.dodajProdukt(c,4);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        System.out.println(m1.toString());
        m1.dodajProdukt(b,10);
        koszyk.dodajProdukt(m1,a,1);
        koszyk.dodajProdukt(m1,b,1);
        koszyk.dodajProdukt(m1,c,1);
        System.out.println(m1.toString());

        System.out.println(koszyk.toString());
        double wartosc = koszyk.obliczCalkowitaWartosc();
        System.out.println(wartosc);

        System.out.println("Zadanie 3:");
        Zamowienie zam1 = new Zamowienie(koszyk);
        System.out.println(zam1.toString());
        zam1.ustawStatusZamownienia("zrealizowane");
        System.out.println(zam1.toString());

        System.out.println("Zadanie 4:");
        List<Zamowienie> lista = new ArrayList<>();
        lista.add(zam1);
        KoszykZakupowy koszyk2 = new KoszykZakupowy();
        b.dodajDoMagazynu(m1,4);
        koszyk2.dodajProdukt(m1,b,1);
        koszyk2.dodajProdukt(m1,a,1);
        Zamowienie zam2 = new Zamowienie(koszyk2);
        Adres ad = new Adres("Zbozowa",5,"Olsztyn","10-001");
        Klient kl1 = new Klient("Andrzej","Nowak",ad,lista);
        Klient kl2 = new Klient("Andrzej","Nowak",ad,lista);
        System.out.println(kl1.equals(kl2));
        kl1.dodajZamowienie(zam2);
        System.out.println(kl1.toString());
        wartosc = kl1.obliczLacznyKosztZamowien();
        System.out.println(wartosc);

        System.out.println("Zadanie 5:");
        Sklep s1 = new Sklep("a","01-01-2011",m1);
        s1.dodajProdukt(a,1);
        s1.dodajProdukt(b,1);
        s1.dodajProdukt(c,1);
        System.out.println(s1.toString());
        Produkt x = s1.wyszukajProduktu("piekarnik");
        System.out.println(x.toString());
        KoszykZakupowy k2 = new KoszykZakupowy();
        s1.zakupy(m1,a,2,k2);
        System.out.println(k2.toString());

        System.out.println("Zadanie 6:");
        KoszykZakupowy k5 = new KoszykZakupowy();
        k5.dodajProdukt(m1,a,2);
        k5.dodajProdukt(m1,a,1);
        k5.dodajProdukt(m1,b,1);
        k5.dodajProdukt(m1,c,1);
        Zamowienie z5 = new Zamowienie(k5);
        System.out.println(z5.toString());
        z5.zwrocProdukt(m1,a,2);
        System.out.println(z5.toString());
        z5.getPlatnosc().zaplac();
        System.out.println(z5.toString());
        Platnosc p1 = new Platnosc(200.00,"Nieopłacone");
        Platnosc p2 = new Platnosc(200.00,"Nieopłacone");
    }
}