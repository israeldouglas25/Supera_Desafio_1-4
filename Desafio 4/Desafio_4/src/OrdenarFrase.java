import java.util.Scanner;

public class OrdenarFrase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            System.out.println("Digite a " + (i+1) + "° frase:");
            String frase = readLine(sc);

            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
        }
    }

    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }
}
