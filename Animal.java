import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private String name;
    private Kind kind;
    private int maxSpeed;
    private double weight;
    private double height;

    public Animal(String name,Kind kind, int maxSpeed, double weight, double height) {
        this.name = name;
        this.kind = kind;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nHi, my name is " + name + ", i am a "+ kind + " i am plenty fast: " + maxSpeed + ", that high: " + height + " and my weight is " + weight + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return maxSpeed == animal.maxSpeed && Double.compare(animal.weight, weight) == 0 && Double.compare(animal.height, height) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed, weight, height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Animal animal) {
        return name.compareToIgnoreCase(animal.getName());
    }
}
