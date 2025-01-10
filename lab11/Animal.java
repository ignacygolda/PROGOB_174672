public class Animal {
    int wiek;

    public Animal(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "wiek=" + wiek +
                '}';
    }
}
