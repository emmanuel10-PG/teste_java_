import org.junit.Test;

public class app {

    @Test
    public static String Methode1(String c) {

        String choix = "";

        switch (c) {

            case "1":
                choix = "vous avez sélectionné la méthode 1";
                break;

            case "2":
                choix = "vous avez sélectionné la méthode 2 ";
                break;

            default:
                choix = "";
                break;
        }
        return choix;

    }

    public static void main(String[] args) {

        System.out.print("le teste");

    }

}