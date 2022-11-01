package class24;

public class Horse {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private double size;

    public Horse(String name, String breed, int age, double weight, double size) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name can't be empty Please try again");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("Breed can't be empty Please try again");
        } else {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age can't be negative");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Negative weight is not allowed, please try again");
        } else {
            this.weight = weight;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 50) {
            System.out.println("Please put the correct size");
        } else {
            this.size = size;
        }
    }
}