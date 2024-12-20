public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("andrzej",22,"a");
        elf1.przedstawSie();
        Elf elf2 = new Elf("jan",25,"b");
        Elf elf2b = new Elf("jan",22,"b");
        System.out.println("hashcode elf2, elf2b: "+elf2.hashCode()+" "+elf2b.hashCode());
        System.out.println("elf1 equals elf2: "+elf1.equals(elf2));
        System.out.println("elf2 equals elf2b: "+elf2.equals(elf2b));

        Fabryka f1 = new Fabryka(-20,5);
        f1.dodajPracownika(elf1);
        f1.dodajPracownika(elf2);
        System.out.println(f1.najstarszyPracownik());

        f1.usunPracownika(elf2);
        f1.usunPracownika(elf2b);

        Renifer r1 = new Renifer("grzes",5);
        r1.nakarmRenifera();
        System.out.println(r1.getPredkosc());
        Renifer r2 = new Renifer("kuba",6);

        Sanie s1 = new Sanie();
        s1.dodajRenifera(r1);
        s1.dodajRenifera(r2);
        System.out.println(s1.sumaPredkosci());

    }
}