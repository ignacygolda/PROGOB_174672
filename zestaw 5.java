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

    public static void wyswietl2(ArrayList<String> tab) {
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

    public static ArrayList<String> toArrayList(String napis) {
        ArrayList<String> tab = new ArrayList<String>();
        for(int i=0;i<napis.length();i++) {
            tab.add(napis.substring(i,i+1));
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

    public static boolean checkChar(ArrayList<String> tab, char znak) {
        String a ="";
        a+=znak;
        for(int i=0;i<tab.size();i++) {
            if(tab.get(i).equals(a)) {
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

    public static int countChar(ArrayList<String> tab, char znak) {
        int ile=0;
        String a ="";
        a+=znak;
        for(int i=0;i<tab.size();i++) {
            if(tab.get(i).equals(a)) {
                ile++;
            }
        }
        return ile;
    }

    public static int countDigit(ArrayList<Integer> tab,int cyfra) {
        int ile=0;
        for(int i=0;i<tab.size();i++) {
            if(tab.get(i).equals(cyfra)) {
                ile++;
            }
        }
        return ile;
    }

    public static ArrayList<ArrayList<Object>> uniqueArrayList(ArrayList<String> tab) {
        ArrayList<ArrayList<Object>> out = new ArrayList<ArrayList<Object>>();
        for(int i=0;i<tab.size();i++) {
            boolean czy_istnieje = false;
            ArrayList<Object> temp = new ArrayList<Object>();
            for(int j=0;j<out.size();j++) {
                var a = tab.get(i);
                var b = out.get(j).get(0);
                if(a.equals(b)) {
                    czy_istnieje = true;
                }
            }
            if(!czy_istnieje) {
                temp.add(tab.get(i));
                temp.add(0);
                out.add(temp);

            }
        }
        return out;
    }

    public static ArrayList<ArrayList<Integer>> uniqueArrayList2(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<tab.size();i++) {
            boolean czy_istnieje = false;
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<out.size();j++) {
                if(out.get(j).get(0).equals(tab.get(i))) {
                    czy_istnieje = true;
                }
            }
            if(!czy_istnieje) {
                temp.add(tab.get(i));
                temp.add(0);
                out.add(temp);
            }
        }
        return out;
    }

    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> counts = uniqueArrayList2(tab);
        for(int i=0;i<tab.size();i++) {
            for(int j=0;j<counts.size();j++) {
                if(tab.get(i).equals(counts.get(j).get(0))) {
                    int temp=counts.get(j).get(1);
                    temp++;
                    counts.get(j).set(1,temp);
                }
            }
        }
        return counts;
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
        ArrayList<String> arr1 = toArrayList("lubie marchew");
        wyswietl2(arr1);
        ArrayList<Integer> arr2 = toArrayList(18697854);
        wyswietl(arr2);

        System.out.println("Zadanie 5:");
        System.out.print(checkChar(arr1,'a')+"\n");
        System.out.print(checkDigit(arr2,5)+"\n");

        System.out.println("Zadanie 6:");
        System.out.print(countChar(arr1,'a')+"\n");
        System.out.print(countDigit(arr2,8)+"\n");

        System.out.println("Zadanie 7:");
        System.out.print(uniqueArrayList(arr1)+"\n");
        System.out.print(uniqueArrayList2(arr2)+"\n");

        System.out.println("Zadanie 8:");
        System.out.print(countArrayList(arr2)+"\n");
    }
}