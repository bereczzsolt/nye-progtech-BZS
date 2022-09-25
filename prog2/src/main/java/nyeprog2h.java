import java.sql.SQLOutput;
import java.util.Scanner;

public class nyeprog2h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hogy hívnak?  ");
        String nev = in.nextLine();
        System.out.println("Milyen nyelvet szeretnél használni? ");
        String nyelv = in.nextLine();


        if (nyelv.equals("hun"))
            System.out.println("Szia, " + nev);
        else if (nyelv.equals("eng"))
            System.out.println("Hello "  + nev);
        else if (nyelv.equals("haw")) {
            System.out.println("Aloha " + nev);
        } else
            System.out.println("Hiba.");

    }
}
