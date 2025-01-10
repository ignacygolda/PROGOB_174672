import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static <T extends Animal> T findMax(T element1, T element2) {
        if(element1.wiek>element2.wiek) return element1;
        else return element2;
    }

    public static void findMinMaxAge(ArrayList<Dog> tab, Pair<?super Dog> result) {
        Dog min = tab.getFirst();
        Dog max = tab.getFirst();
        for(Dog d : tab) {
            if(d.age>max.age) {
                max = d;
            }
            if(d.age<min.age) {
                min = d;
            }
        }
        result.object1 = min;
        result.object2 = max;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal(4);
        Dog d1 = new Dog(6);
        System.out.println(findMax(a1,d1).toString());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(2,3));
        dogs.add(new Dog(2,4));
        dogs.add(new Dog(2,1));
        dogs.add(new Dog(2,8));
        Pair<Dog> p = new Pair<>();
        findMinMaxAge(dogs, p);
        System.out.println(p.object1.toString()+", "+p.object2.toString());

    }
}