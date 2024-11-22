public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "niezrealizowane";
    }

    void ustawStatusZamownienia(String status) {
        this.statusZamowienia = status;
    }

    void wyswietlZamowienie() {
        System.out.println("---------------------");
        System.out.println(this.statusZamowienia);
        this.koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("---------------------");
    }
}
