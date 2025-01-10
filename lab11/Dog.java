public class Dog extends Animal{
    int age;
    public Dog(int wiek) {
        super(wiek);
    }

    public Dog(int wiek, int age) {
        super(wiek);
        this.age = age;
    }

    @Override
    public String toString() {
        if(age>0) {
            return "Dog{" +
                    "age=" + age +
                    '}';
        }
        else {
            return "Dog{" +
                    "wiek=" + wiek +
                    '}';
        }

    }
}
