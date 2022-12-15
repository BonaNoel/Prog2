public class Main {
    public static void main(String[] args) {

        // Animal dog = new Dog();
        // dog.speak();

        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal curr : animals) {
            curr.speak();
        }

        System.out.println("----------------------------");



        Dog dog = new Dog();
        process(dog);
        process(new Cat());
        process(new Cow());


    }

    private static void process(Animal animal) {
        animal.speak();
    }
}

// Interface is referencia tioust(mint osztály), hasonlit egy olyan absztrakt
// osztályhoz amiben csak publikus absztrakt metódusok vannak


// Minden olyan helyen ahol interfész szerepel tipus ként az inteface implementáló bármilyen osztály példánya szerepelhet