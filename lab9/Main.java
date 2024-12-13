import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookDTO a = new BookDTO("a",13.99,"2003-11-05");
        BookDTO b = new BookDTO("b",17.99,"2015-12-08");
        BookDTO c = new BookDTO("c",19.99,"2009-03-27");

        Adress adr1 = new Adress("aa",5,"99-999","bbb");
        Adress adr2 = new Adress("abc",9,"99-995","sgfg");

        Person p1 = new Person("andrzej", "bb",adr1);
        Person p2 = new Person("jacek","jj",adr2);

        ArrayList<Double> reviews = new ArrayList<>();
        reviews.add(4.5);
        reviews.add(8.4);
        reviews.add(7.8);
        Book k1 = new Book("a","jan",reviews);
        System.out.println(k1.toString());
        k1.addReview(5.7);
        k1.removeReview(4.5);
        k1.removeReview(2.2);
        System.out.println(k1.toString());
        ArrayList<Double> reviews2 = new ArrayList<>();
        reviews2.add(6.6);
        reviews2.add(7.9);
        reviews2.add(2.3);
        Book k2 = new Book("b","andrzej",reviews2);
        System.out.println(k2.equals(k1));

        Book k3 = new Book("b","andrzej",reviews2);
        System.out.println(k2.equals(k3));

        ArrayList<Double> reviews3 = new ArrayList<>();
        reviews3.add(1.2);
        reviews3.add(9.8);
        FantasyBook f1 = new FantasyBook("c","jan",reviews3,"h");
        System.out.println(f1.toString());
        System.out.println(f1.hashCode());
        FantasyBook f2 = new FantasyBook("c","jan",reviews3,"g");
        System.out.println(f2.equals(f1));
    }
}