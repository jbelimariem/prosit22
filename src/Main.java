public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Mammifère", "Dumbo", 10, true);
        Animal snake = new Animal("Reptile", "Kaa", 3, false);

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis");
        myZoo.displayZoo();
        System.out.println(myZoo);


        System.out.println("\n--- Instruction 10 : ajout ---");
        System.out.println("Ajout lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout éléphant : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout serpent : " + myZoo.addAnimal(snake));


        System.out.println("\n--- Instruction 11 : affichage et recherche ---");
        myZoo.displayAnimals();
        System.out.println("Indice de Simba : " + myZoo.searchAnimal(lion));
        Animal lionCopie = new Animal("Félin", "Simba", 5, true);
        // Objet différent en mémoire, mais même nom : trouvé car la recherche compare les noms
        System.out.println("Indice de la copie de Simba : " + myZoo.searchAnimal(lionCopie));
        Animal inconnu = new Animal("Oiseau", "Zazu", 2, false);
        System.out.println("Indice de Zazu : " + myZoo.searchAnimal(inconnu));

        System.out.println("\n--- Instruction 12 : unicité ---");
        System.out.println("Ajout de la copie de Simba : " + myZoo.addAnimal(lionCopie));

        System.out.println("\n--- Instruction 12 : capacité maximale ---");
        Zoo zooPlein = new Zoo("Zoo Plein", "Sfax");
        for (int i = 1; i <= 27; i++) {
            boolean ok = zooPlein.addAnimal(new Animal("Famille", "Animal" + i, i, true));
            if (!ok) {
                System.out.println("Échec pour Animal" + i);
            }
        }
        System.out.println("Zoo plein ? " + zooPlein.isZooFull());

        System.out.println("\n--- Instruction 13 : suppression ---");
        System.out.println("Suppression de Dumbo : " + myZoo.removeAnimal(elephant));
        System.out.println("Suppression de Zazu (absent) : " + myZoo.removeAnimal(inconnu));
        myZoo.displayAnimals();

        System.out.println("\n--- Instruction 15 : comparaison ---");
        System.out.println("myZoo plein ? " + myZoo.isZooFull());
        Zoo gagnant = Zoo.comparerZoo(myZoo, zooPlein);
        System.out.println("Zoo avec le plus d'animaux : " + gagnant.name
                + " (" + gagnant.animalCount + " animaux)");
    }
}