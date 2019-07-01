class Dog {
    int size = 10;
    String breed = "cockapoo";
    String name;

    {
        name = "Molly";
    }

    void bark() {
        System.out.println("Ruff, Ruff!");
    }
}

class DogTestDrive {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
