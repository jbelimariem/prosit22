import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <con src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooManagement {
        int  nbrCages  =20;
        String zooName = "my zoo";
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        System.out.println("Zoo : " + zoo.zooName);
        System.out.println("Nombre de cages : " + zoo.nbrCages);
        System.out.println("siasir le nom de zoo");
        String name =scanner.nextLine();
        System.out.println("nb de cage");
        int nb=scanner.nextInt();
        if (name.isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }

        if (nb<= 0) {
            System.out.println("Le nombre de cages doit être positif.");
        }
        System.out.println(" nom de zoo "+name+" nbdecage "+nb);
        if (!name.isEmpty() && nb > 0) {
            System.out.println("Zoo : " + name);
            System.out.println("Nombre de cages : " + nb);
        }


    }
}
