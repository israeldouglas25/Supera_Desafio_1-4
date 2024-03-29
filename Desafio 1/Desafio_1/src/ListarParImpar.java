import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListarParImpar {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numero = 0;

        System.out.println("Quantos numeros vai incluir na lista?");
        int linhas = s.nextInt();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= linhas; i++) {
            System.out.println("Digite o " + i + "° numero positivo:");
            numero = s.nextInt();
            numeros.add(numero);
        }

        System.out.println("-------------------");
        numeros.stream().filter(e -> e % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
        numeros.stream().filter(e -> e % 2 != 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-------------------");

    }
}
