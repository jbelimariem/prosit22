public class Main {
    public static void main(String[] args) {

        // Création des animaux avec le constructeur
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Mammifère", "Dumbo", 10, true);
        Animal snake = new Animal("Reptile", "Kaa", 3, false);

        // Création du zoo
        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 20);

        // Afficher le zoo avec displayZoo()
        myZoo.displayZoo();

        // Afficher directement le zoo
        System.out.println(myZoo);

        // Afficher avec toString()
        System.out.println(myZoo.toString());

        // Afficher un animal
        System.out.println(lion);
    }
}