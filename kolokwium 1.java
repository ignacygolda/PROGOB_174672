public class Main {

    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r) {
        int[] ciag = new int[n];
        ciag[0]=a1;
        for(int i=m;i>2;i--) {
            int[] r_temp = new int[n];
            r_temp[0] = a1 + r[1] - r[0];
            for (int j = 1; j < r.length+i-m+1; j++) {
                r_temp[j] = r_temp[j - 1] + r[j - 1];
            }
            r = r_temp;
        }
        for(int i=1;i<n;i++) {
            ciag[i]=ciag[i-1]+r[i-1];
        }
        return ciag;
    }

    public static boolean czyCiagArytmetyczny(int[] tab) {
        for(int i=1;i<tab.length-1;i++) {
            if(tab[i]-tab[i-1]!=tab[i+1]-tab[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m) {
        int[] r = new int[tab.length-1];
        for(int i=1;i<m;i++) {
            if(i==1) {
                for(int j=0;j<r.length;j++) {
                    r[j]=tab[j+1]-tab[j];
                }
            }
            else {
                int[] r_temp = new int[tab.length-i];
                for(int j=0;j<r_temp.length;j++) {
                    r_temp[j]=r[j+1]-r[j];
                }
                r=r_temp;
            }
        }
        if(r.length>=3) {
            for(int i=1;i<r.length-1;i++) {
                if(r[i]-r[i-1]!=r[i+1]-r[i]) {
                    return false;
                }
            }
        }
        else {

        }

        return true;
    }

    public static void printTable(int[] tab) {
        for(int i=0;i<tab.length;i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }


    public static int podciag(int[] tab) {
        int dlugosc = 1;
        int min=tab[0];
        for(int i=1;i<tab.length;i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        for(int i=0;i<tab.length;i++) {
            if(tab[i] > min) {
                dlugosc++;
                min=tab[i];
            }
        }
        return dlugosc;
    }

    public static int podciag(int[] tab, int r) {
        int dlugosc = 1;
        int min=tab[0];
        for(int i=1;i<tab.length;i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        for(int i=0;i<tab.length;i++) {
            if(tab[i] == min+r) {
                dlugosc++;
                min = tab[i];
            }
        }
        return dlugosc;
    }

    public static void sekwencjaCollatza(int n, int c) {
        for(int i=c;i<c+n;i++) {
            if(i%2==0) {
                System.out.print(i/2 + " ");
            }
            else {
                System.out.print(i*3+1 + " ");
            }
        }
        System.out.println();
    }

    public static void minMaxSekwencjaCollatza(int n, int c) {
        int[] tab = new int[n];
        int e;
        for(int i=c;i<c+n;i++) {
            if(i%2==0) {
                tab[i-c] = i/2;
            }
            else {
                tab[i-c] =i*3+1;
            }
        }
        int min = tab[0];
        int max = tab[0];
        for(int i=0;i<tab.length;i++) {
            if(tab[i]<min) {
                min=tab[i];
            }
            if(tab[i]>max) {
                max=tab[i];
            }
        }
        System.out.print("min="+min+"\n"+"max="+max);
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,6,9,5,8};
        System.out.println("zadanie 1:");
        int[] r = {12,18,24};
        printTable(ciagArytmetycznyRodzajuM(5,3,1,r));
        System.out.println("zadanie 2:");
        int[] b = {1,3,5,7};
        System.out.print(czyCiagArytmetyczny(b)+"\n");
        System.out.println("zadanie 3:");
        int[] c = {1,8,27,64,126};
        System.out.print(czyCiagArytmetycznyRodzajuM(c,3)+"\n");
        System.out.println("zadanie 4:");
        System.out.print(podciag(a)+"\n");
        System.out.println("zadanie 5:");
        System.out.print(podciag(a,2)+"\n");
        System.out.println("zadanie 6:");
        sekwencjaCollatza(10,5);
        System.out.println("zadanie 7:");
        minMaxSekwencjaCollatza(10,5);
    }
}