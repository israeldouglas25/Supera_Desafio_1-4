import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Alvo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeAlvo = 0;

        System.out.print("Digite o tamanho da lista: ");
        int n = sc.nextInt();

        System.out.print("Digite o alvo: ");
        Integer k = sc.nextInt();

        List<Integer> lista = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "° valor da lista: ");
            int valor = sc.nextInt();
            lista.add(valor);
        }

        Integer atual = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            Integer proximo = lista.get(i);
            if (k.equals(atual - proximo)) quantidadeAlvo++;
            atual = proximo;
        }

        System.out.print("TOTAL: " + quantidadeAlvo);

        sc.close();
    }
}
