public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("zadanie 1:");
        String imie = "Ignacy Golda";
        System.out.println(imie);
        //2
        System.out.println("zadanie 2:");
        System.out.println(imie.length());
        //3
        System.out.println("zadanie 3:");
        System.out.println("Ala" + " " + "ma" + " " + "kota");
        //4
        System.out.println("zadanie 4:");
        System.out.println(
                "                    *\n" +
                "                    * *\n" +
                "                    * * *\n" +
                "* * * * * * * * * * * * * *\n" +
                "* * * * * * * * * * * * * * *\n" +
                "* * * * * * * * * * * * * *\n" +
                "                    * * *\n" +
                "                    * *\n" +
                "                    *"
        );
        System.out.println(
                "     *\n" +
                "    * *\n" +
                "   * * *\n" +
                "  * * * *\n" +
                " * * * * *\n" +
                "* * * * * *\n" +
                " * * * * *\n" +
                "  * * * *\n" +
                "   * * *\n" +
                "    * *\n" +
                "     *"
        );
        //5
        System.out.println("zadanie 5:");
        String line = "Ala ma kota";
        System.out.println(line.replace('a','e').replace('A','E'));
        System.out.println(line.substring(0,1).toLowerCase() + line.substring(1).toUpperCase());
        //6
        System.out.println("zadanie 6:");
        System.out.println((int) 'A');
        System.out.println((int) '!');
        System.out.println((int) '@');
        System.out.println((int) '>');
        System.out.println((int) '~');
        System.out.println((int) '\n');
        System.out.println((int) '\b');
        //7
        System.out.println("zadanie 7:");
        System.out.print("male litery: ");
        System.out.print((int) 'a');
        System.out.print(" - ");
        System.out.print((int) 'z');
        System.out.print("\n");
        System.out.print("duze litery: ");
        System.out.print((int) 'A');
        System.out.print(" - ");
        System.out.print((int) 'Z');
        System.out.print("\n");
        System.out.print("cyfry: ");
        System.out.print((int) '0');
        System.out.print(" - ");
        System.out.print((int) '9');
        System.out.print("\n");
        //8
        System.out.println("zadanie 8:");
        System.out.println("Grzesiek nie wiedział dlaczego słoń jest tak drapieżnym słoniem mimo, że " +
                "jego trąba na to nie wskazuje");
        //9
        System.out.println("zadanie 9:");
        System.out.println("aaaa to najlepsza książka napisana przez bbbb");
        //10
        System.out.println("zadanie 10:");
        System.out.println("wodrze".repeat(5));
        //11
        System.out.println("zadanie 11:");
        System.out.println("Dzisiaj jest: " + java.time.LocalDate.now() + " godzina " + java.time.LocalTime.now());
        //12
        System.out.println("zadanie 12:");
        System.out.print((char) 54);
        System.out.print("\n");
        System.out.print((char) 103);
        System.out.print("\n");
        System.out.print((char) 241);
        System.out.print("\n");
        System.out.print((char) 67);
        System.out.print("\n");
        System.out.print((char) 9999);
        System.out.print("\n");
        System.out.print((char) imie.length());
        System.out.print("\n");
        System.out.print((char) 174672);
        System.out.print("\n");
    }
}