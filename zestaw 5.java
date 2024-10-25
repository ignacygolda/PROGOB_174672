import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void wyswietl(ArrayList<Integer> tab) {
        for(int i=0;i<tab.size();i++) {
            System.out.print(tab.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void wyswietl2(ArrayList<Character> tab) {
        for(int i=0;i<tab.size();i++) {
            System.out.print(tab.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        for(int i=0;i<tab1.size();i++) {
            tab3.add(tab1.get(i));
        }
        for(int i=0;i<tab2.size();i++) {
            tab3.add(tab2.get(i));
        }
        return tab3;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        if(tab1.size()>tab2.size()) {
            for(int i=0;i<tab2.size();i++) {
                tab3.add(tab1.get(i));
                tab3.add(tab2.get(i));
            }
            for(int j=tab2.size();j<tab1.size();j++) {
                tab3.add(tab1.get(j));
            }
        }
        else {
            for(int i=0;i<tab1.size();i++) {
                tab3.add(tab1.get(i));
                tab3.add(tab2.get(i));
            }
            for(int j=tab1.size();j<tab2.size();j++) {
                tab3.add(tab2.get(j));
            }
        }
        return tab3;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        Collections.sort(tab2);
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        for(int i=0;i<tab1.size();i++) {
            tab3.add(tab1.get(i));
        }
        for(int i=0;i<tab2.size();i++) {
            tab3.add(tab2.get(i));
        }
        return tab3;
    }

    public static ArrayList<Character> toArrayList(String napis) {
        ArrayList<Character> tab = new ArrayList<Character>();
        for(int i=0;i<napis.length();i++) {
            tab.add(napis.charAt(i));
        }
        Collections.sort(tab);
        return tab;
    }

    public static ArrayList<Integer> toArrayList(int liczba) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        while(liczba>0) {
            tab.add(liczba%10);
            liczba=liczba/10;
        }
        Collections.sort(tab);
        return tab;
    }

    public static boolean checkChar(ArrayList<Character> tab, char znak) {
        for(int i=0;i<tab.size();i++) {
            if(tab.get(i)==znak) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDigit(ArrayList<Integer> tab, int cyfra) {
        for(int i=0;i<tab.size();i++) {
            if(tab.get(i)==cyfra) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(3);
        a.add(5);
        a.add(1);
        a.add(8);
        a.add(9);
        a.add(3);
        b.add(4);
        b.add(11);
        b.add(2);
        b.add(1);

        System.out.println("Zadanie 1:");
        wyswietl(append(a,b));

        System.out.println("Zadanie 2:");
        wyswietl(merge(a,b));

        System.out.println("Zadanie 3:");
        wyswietl(mergeSorted(a,b));

        System.out.println("Zadanie 4:");
        ArrayList<Character> arr1 = toArrayList("lubie marchew");
        wyswietl2(arr1);
        ArrayList<Integer> arr2 = toArrayList(18697854);
        wyswietl(arr2);

        System.out.println("Zadanie 5:");
        System.out.print(checkChar(arr1,'a')+"\n");
        System.out.print(checkDigit(arr2,5)+"\n");
    }
}