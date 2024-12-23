import java.util.Random;

public class Main {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tab = new int[n];
        Random rand = new Random();
        for(int i=0;i<n;i++) {
            tab[i]=rand.nextInt(maxWartosc-minWartosc+1)+minWartosc;
        }
        return tab;
    }

    public static void wypiszTablice(int[]tab, int n, int m) {
        int k=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(k<tab.length) {
                    System.out.print(tab[k]+" ");
                    k++;
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static int ileNieparzystych(int[] tab) {
        int ile=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]%2!=0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileParzystych(int[] tab) {
        int ile=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]%2==0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileDodatnich(int[] tab) {
        int ile=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileUjemnych(int[] tab) {
        int ile=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]<0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileZerowych(int[] tab) {
        int ile=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]==0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileMaxymalnych(int[] tab) {
        int ile=0;
        int max=tab[0];
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>max) {
                max=tab[i];
            }
        }
        for(int i=0;i<tab.length;i++) {
            if(tab[i]==max) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileMinimalnych(int[] tab) {
        int ile = 0;
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == min) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileUnikalnych(int[] tab) {
        int ile=0;
        for(int i=0;i<tab.length;i++) {
            boolean czyUni = true;
            for(int j=i+1;j<tab.length;j++) {
                if(tab[i]==tab[j]) {
                    czyUni=false;
                }
            }
            if(czyUni) {
                ile++;
            }
        }
        return ile;
    }

    public static int sumaDodatnich(int[] tab) {
        int suma=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>0) {
                suma+=tab[i];
            }
        }
        return suma;
    }

    public static int sumaUjemnych(int[] tab) {
        int suma=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]<0) {
                suma+=tab[i];
            }
        }
        return suma;
    }

    public static double sumaOdwrotnosci(int[] tab) {
        double suma=0;
        for(int i=0;i<tab.length;i++) {
            suma+=1.0/tab[i];
        }
        return suma;
    }

    public static double sredniaArytmetyczna(int[] tab) {
        double suma=0;
        for(int i=0;i<tab.length;i++) {
            suma+=tab[i];
        }
        return suma/tab.length;
    }

    public static double sredniaGeometryczna(int[] tab) {
        double iloczyn=1;
        for(int i=0;i<tab.length;i++) {
            iloczyn*=tab[i];
        }
        return Math.pow(iloczyn,1/(double)tab.length);
    }

    public static double sredniaHarmoniczna(int[] tab) {
        double suma=0;
        for(int i=0;i<tab.length;i++) {
            suma+=1.0/(double)tab[i];
        }
        return (double)tab.length/suma;
    }


    public static void wyswietl(int[] tab) {
        for(int i=0;i<tab.length;i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.print("\n");
    }

    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
        for(int i=0;i<tab.length;i++) {
            tab[i]=a*tab[i]+b;
        }
        return tab;
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c) {
        for(int i=0;i<tab.length;i++) {
            tab[i]=a*(int)Math.pow(tab[i],2)+b*tab[i]+c;
        }
        return tab;
    }
    public static int[] funkcjaWykladnicza(int[] tab, int a) {
        for(int i=0;i<tab.length;i++) {
            tab[i]=(int)Math.pow(a,tab[i]);
        }
        return tab;
    }

    public static int[] funkcjaSignum(int[] tab) {
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>0) {
                tab[i]=1;
            }
            else if(tab[i]<0) {
                tab[i]=-1;
            }
            else {
                tab[i]=0;
            }
        }
        return tab;
    }

    public static int najdluzszyCiagDodatnich(int[] tab) {
        int ciag=0;
        int max_ciag=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>0) {
                ciag++;
            }
            else {
                if(ciag>max_ciag) {
                    max_ciag=ciag;
                }
                ciag=0;
            }
        }
        return max_ciag;
    }

    public static int najdluzszyCiagUjemnych(int[] tab) {
        int ciag=0;
        int max_ciag=0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]<0) {
                ciag++;
            }
            else {
                if(ciag>max_ciag) {
                    max_ciag=ciag;
                }
                ciag=0;
            }
        }
        return max_ciag;
    }

    public static int[] odwrocTablice(int[] tab) {
        int[] out = new int[tab.length];
        for(int i=0;i<tab.length;i++) {
            out[i]=tab[tab.length-i-1];
        }
        return out;
    }

    public static int[] odwrocTablice(int[] tab,int indeksStart, int indeksStop) {
        int[] temp = new int[indeksStop-indeksStart+1];
        for(int i=0;i<=indeksStop-indeksStart;i++) {
            temp[i]=tab[indeksStart+i];
        }
        temp=odwrocTablice(temp);
        for(int i=indeksStart;i<=indeksStop;i++) {
            tab[i]=temp[i-indeksStart];
        }
        return tab;
    }

    public static int[] generujZakres(int n, int minWartosc, int maxWartosc) {
        int[] tab = new int[n];
        Random rand = new Random();
        int step = (maxWartosc - minWartosc)/n;
        for(int i=0;i<n;i++) {
            tab[i]=(rand.nextInt((maxWartosc-minWartosc)/step+1)+minWartosc/step)*step;
        }
        return tab;
    }

    public static void main(String[] args) {
        System.out.println("zadanie 1:");
        int[] tab = generujTablice(10,10,50);
        wyswietl(tab);

        System.out.println("zadanie 2:");
        wypiszTablice(tab,3,4);

        System.out.println("zadanie 3:");
        System.out.print("nieparzyste: "+ileNieparzystych(tab)+"\n");
        System.out.print("parzyste: "+ileParzystych(tab)+"\n");
        System.out.print("dodatnie: "+ileDodatnich(tab)+"\n");
        System.out.print("ujemne: "+ileUjemnych(tab)+"\n");
        System.out.print("zerowe: "+ileZerowych(tab)+"\n");
        System.out.print("maksymalne: "+ileMaxymalnych(tab)+"\n");
        System.out.print("minimalne: "+ileMinimalnych(tab)+"\n");
        System.out.print("unikalne: "+ileUnikalnych(tab)+"\n");

        System.out.println("zadanie 4:");
        System.out.print("suma dodatnich: "+sumaDodatnich(tab)+"\n");
        System.out.print("suma ujemnych: "+sumaUjemnych(tab)+"\n");
        System.out.print("suma odwrotnosci: "+sumaOdwrotnosci(tab)+"\n");
        System.out.print("srednia arytmetyczna: "+sredniaArytmetyczna(tab)+"\n");
        System.out.print("srednia geometryczna: "+sredniaGeometryczna(tab)+"\n");
        System.out.print("srednia harmoniczna: "+sredniaHarmoniczna(tab)+"\n");

        System.out.println("zadanie 5:");
        System.out.print("liniowa: ");
        wyswietl(funkcjaLiniowa(tab,2,3));
        System.out.print("kwadratowa: ");
        wyswietl(funkcjaKwadratowa(tab,2,3,4));
        System.out.print("wykladnicza: ");
        wyswietl(funkcjaWykladnicza(tab,2));
        System.out.print("signum: ");
        wyswietl(funkcjaSignum(tab));

        System.out.println("zadanie 6:");
        int[] tab2={1,5,7,4,8,-4,-7,8,11,0};
        System.out.print("najdluzszy ciag dodatnich: "+najdluzszyCiagDodatnich(tab2)+"\n");
        System.out.print("najdluzszy ciag ujemnych: "+najdluzszyCiagUjemnych(tab2)+"\n");
        System.out.print("odwroc tablice:\n");
        wyswietl(odwrocTablice(tab2));
        System.out.print("odwroc tablice od do:\n");
        wyswietl(odwrocTablice(tab2,2,5));
        
        System.out.println("zadanie 7:");
        int[] tab3 = generujZakres(5,1,15);
        wyswietl(tab3);

    }
}