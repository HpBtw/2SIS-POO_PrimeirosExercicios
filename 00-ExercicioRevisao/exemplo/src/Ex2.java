import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insira o valor i (primeiro numero): ");
        int i = kb.nextInt();

        System.out.print("Insira o valor j (ultimo numero): ");
        int j = kb.nextInt();

        int maiorQuantia = 0;

        for (int cont = i; cont <= j; cont++) {
            int quantia = 1;
            int x = i;
            while (x != 1) {
                if (x % 2 != 0) {
                    x = 3 * x + 1;
                } else {
                    x = x / 2;
                }
                quantia++;
            }
            if (quantia > maiorQuantia) {
                maiorQuantia = quantia;
            }
            i++;
        }
        System.out.print("Quantia máxima: " + maiorQuantia);
        kb.close();
    }
}
