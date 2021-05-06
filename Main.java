import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("adam", Kind.INSECT, 35, 0.1, 0.1);
        Animal animal2 = new Animal("berta", Kind.MAMMAL, 10, 100, 180);
        Animal animal3 = new Animal("charly", Kind.FISH, 15, 20, 35);
        Animal animal4 = new Animal("david", Kind.BIRD, 50, 10, 25);
        Animal animal5 = new Animal("eva", Kind.REPTILE, 40, 2, 5);

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5, animal1, animal2, animal3, animal4, animal5};
        System.out.println("original:");
        System.out.println(Arrays.toString(animals));

        //in class by name via comparable interface and overwriting compareTo

        System.out.println("\nsorted by name via comparable interface and overwriting compareTo in class Animal");
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));

        // HeightComparator: als eigene Klasse (in eigenem File), die Comparator<Animal> implementiert

        HeightComparator heightComparator = new HeightComparator();
        System.out.println("\nsorted by height via comparator in class HeightComparator");
        Arrays.sort(animals, heightComparator);
        System.out.println(Arrays.toString(animals));

        //WeightComparator: als anonyme Klasse

        System.out.println("\nsorted by weight via anonymous class");
        Arrays.sort(animals, new Comparator<>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });
        System.out.println(Arrays.toString(animals));

        //MaxSpeed, LambdaFunction
        System.out.println("\nsorted by MaxSpeed via LambdaFunction");
        Arrays.sort(animals, (a, b) -> Integer.compare(a.getMaxSpeed(), b.getMaxSpeed()));
        System.out.println(Arrays.toString(animals));

        //or even like that
        Arrays.sort(animals, Comparator.comparingInt(Animal::getMaxSpeed));
    }
}
