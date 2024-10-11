import java.lang.Math;

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

    }
}