public class Main {
    public static void main(String[] args) {


        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Mammifère", "Dumbo", 10, true);
        Animal snake = new Animal("Reptile", "Kaa", 3, false);


        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 20);


        myZoo.displayZoo();


        System.out.println(myZoo);

        System.out.println(myZoo.toString());


        System.out.println(lion);
    }
}