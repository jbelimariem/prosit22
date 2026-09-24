import java.util.Scanner;

public class zg {
    String name="zoo";
    int nb=20;
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        zg zoo=new zg();
        System.out.println("nom de zoo "+zoo.name+"nb "+zoo.nb);
        System.out.println("saisir le nom de zoo");
        String non =scanner.nextLine();
        System.out.println("saisire le nb");
        int nb =scanner.nextInt();
        if(nb<=0){
            System.out.println("saisir un nb ");

        }
        if(non.isEmpty()){
            System.out.println("il est vide");
        }
        if (!non.isEmpty() && nb > 0) {
            System.out.println("Zoo : " + non);
            System.out.println("Nombre de cages : " + nb);
        }





    }
}
