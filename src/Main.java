class Dog {
    void bark (int numBark) {
        while (numBark > 0) {
            System.out.println("Ruff!");
            numBark -= 1;
        }
    }
}

class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(3);
    }
}