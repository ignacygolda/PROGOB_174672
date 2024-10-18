import java.lang.Math;
import java.util.Scanner;

public class Main {
    static void trojkiPitagorejskie(int n) {
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(Math.pow(i,2)+Math.pow(j,2)==Math.pow(k,2)) {
                        System.out.print(i+" "+j+" "+k+"\n");
                    }
                }
            }
        }
    }

    static void funKwaRozwiazania(int n) {
        for(int a=1;a<n;a++) {
            for(int b=0;b<n;b++) {
                for(int c=0;c<n;c++) {
                    if(Math.pow(b,2)-4*a*c>=0) {
                        System.out.print(a+" "+b+" "+c+"\n");
                    }
                }
            }
        }
    }

    static void funKwaDelta(int n) {
        for(int a=1;a<n;a++) {
            for(int b=0;b<n;b++) {
                for(int c=0;c<n;c++) {
                    int delta=(int) Math.pow(b,2)-4*a*c;
                    if(delta>=0 & Math.sqrt(Math.sqrt(delta))==Math.floor(Math.sqrt(Math.sqrt(delta)))) {
                        System.out.print(a+" "+b+" "+c+"\n");
                    }
                }
            }
        }
    }

    static void liczbyPierwsze(int n) {
        for(int i=2;i<n;i++) {
            boolean czyPierwsza = true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    czyPierwsza = false;
                }
            }
            if(czyPierwsza) {
                System.out.print(i+"\n");
            }
        }
    }

    static void liczbyPodzielne(int m, int n) {
        int p=(int)(Math.pow(10,m)/10);
        int k=(int)(Math.pow(10,m));
        for(int i=p;i<k;i++) {
            if(i%n==0) {
                System.out.print(i+"\n");
            }
        }
    }

    static void piramida(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int silnia(int n) {
        int out=1;
        for(int i=1;i<=n;i++) {
            out=out*i;
        }
        return out;
    }

    static int silniaPodwojna(int n) {
        int out=1;
        for(int i=1;i<=n;i=i+2) {
            out=out*i;
        }
        return out;
    }

    static int silnia(int m, int n) {
        int out=1;
        for(int i=1;i<=n;i=i+m) {
            out=out*i;
        }
        return out;
    }

    static int dwumianNewtona(int n, int k) {
        return(silnia(n)/(silnia(k)*silnia(n-k)));
    }

    static void fibbonacci(int n) {
        int l1=0;
        int l2=1;
        for(int i=0;i<n;i++) {
            System.out.print(l1+" ");
            int l3=l1+l2;
            l1=l2;
            l2=l3;
        }
        System.out.print("\n");
    }

    static int sumaNaturalnych(int n) {
        int suma=0;
        for(int i=1;i<=n;i++) {
            suma=suma+i;
        }
        return suma;
    }

    static int sumaParzystych(int n) {
        int suma=0;
        for(int i=2;i<=n;i=i+2) {
            suma=suma+i;
        }
        return suma;
    }

    static int sumaNieparzystych(int n) {
        int suma=0;
        for(int i=1;i<=n;i=i+2) {
            suma=suma+i;
        }
        return suma;
    }

    static int sumaKwaNaturalnych(int n) {
        int suma=0;
        for(int i=1;i<=n;i=i+2) {
            suma=suma+i*i;
        }
        return suma;
    }

    static int sumaSzeNaturalnych(int n) {
        int suma=0;
        for(int i=1;i<=n;i=i+2) {
            suma=suma+i*i*i;
        }
        return suma;
    }

    static double sumaOdwNaturalnych(int n) {
        double suma=0;
        for(int i=1;i<=n;i=i+2) {
            suma=suma+1.0/i;
        }
        return suma;
    }

    static boolean czyPalindrom(String nap) {
        int n = nap.length();
        boolean czyPal = true;
        for(int i=0;i<n;i++) {
            if(nap.charAt(i)!=nap.charAt(n-i-1)) {
                czyPal = false;
            }
        }
        return czyPal;
    }

    static boolean czyDoskonala(int n) {
        int suma = 0;
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                suma=suma+i;
            }
        }
        if(suma==n) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean czyPierwsza(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    static int nwd(int a,int b) {
        int min;
        if(a>b) {
            min=b;
        }
        else {
            min=a;
        }
        int out=0;
        for(int i=1;i<min;i++) {
            if(a%i==0 && b%i==0) {
                out=i;
            }
        }
        return out;
    }

    static int[] wczytajTablice(int n) {
        int[] out = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj n liczb:\n");
        for(int i=0;i<n;i++) {
            out[i]=sc.nextInt();
        }
        return out;
    }

    static void printSubsets(int[] tab) {
        int l=(int) Math.pow(2,tab.length);
        for(int i=0;i<l;i++) {
            //System.out.print("{");
            for(int j=0;j<tab.length;j++) {
                if((i & (1 << j))!=0) {
                    System.out.print(tab[j]+" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void trojkatPascala(int n) {
        for(int i=0;i<n;i++) {
            System.out.print(" ".repeat(n-i-1));
            for(int j=0;j<=i;j++) {
                System.out.print(" "+silnia(i)/(silnia(i-j)*silnia(j)));
            }
            System.out.print("\n");
        }
    }

    static boolean czyPalindrom(int n) {
        int p,k;
        while(n>=10) {
            int l=0;
            p=n;
            while(p>=10) {
                p=p/10;
                l++;
            }
            k=n%10;
            n=n%(int)Math.pow(10,l);
            n=n/10;
            if(p!=k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("zadanie 1:");
        trojkiPitagorejskie(100);
        System.out.println("zadanie 2:");
        funKwaRozwiazania(10);
        System.out.println("zadanie 3:");
        funKwaDelta(10);
        System.out.println("zadanie 4:");
        liczbyPierwsze(100);
        System.out.println("zadanie 5:");
        liczbyPodzielne(2,3);
        System.out.println("zadanie 6:");
        piramida(5);
        System.out.println("zadanie 7:");
        int a=silnia(6);
        System.out.print(a+"\n");
        System.out.println("zadanie 8:");
        a=silniaPodwojna(6);
        System.out.print(a+"\n");
        System.out.println("zadanie 9:");
        a=silnia(4,8);
        System.out.print(a+"\n");
        System.out.println("zadanie 10:");
        a=dwumianNewtona(6,4);
        System.out.print(a+"\n");
        System.out.println("zadanie 11:");
        fibbonacci(10);
        System.out.println("zadanie 12:");
        a=sumaNaturalnych(10);
        System.out.print("suma naturalnych:"+a+"\n");
        a=sumaParzystych(10);
        System.out.print("suma parzystych:"+a+"\n");
        a=sumaNieparzystych(10);
        System.out.print("suma nieparzystych:"+a+"\n");
        a=sumaKwaNaturalnych(10);
        System.out.print("suma kwadratow liczb naturalnych:"+a+"\n");
        a=sumaSzeNaturalnych(10);
        System.out.print("suma szescianow liczb naturalnych:"+a+"\n");
        double b=sumaOdwNaturalnych(10);
        System.out.print("suma odwrotnoci liczb naturalnych:"+b+"\n");
        System.out.println("zadanie 13:");
        System.out.print(czyPalindrom("kajak")+"\n");
        System.out.println("zadanie 14:");
        trojkatPascala(5);
        System.out.println("zadanie 15:");
        System.out.print(czyPalindrom(123321)+"\n");
        System.out.println("zadanie 16:");
        System.out.print(czyDoskonala(28)+"\n");
        System.out.println("zadanie 17:");
        System.out.print(czyPierwsza(32)+"\n");
        System.out.println("zadanie 18:");
        System.out.print(nwd(32,24)+"\n");
        System.out.println("zadanie 19:");
        int[] tab = wczytajTablice(3);
        for(int i=0;i<tab.length;i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.print("\n");
        System.out.println("zadanie 20:");
        printSubsets(tab);

    }
}