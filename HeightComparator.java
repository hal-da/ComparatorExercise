import java.util.Comparator;

public class HeightComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
