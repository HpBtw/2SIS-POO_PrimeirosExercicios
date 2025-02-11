import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int x = kb.nextInt();

        if (x == 1) {
            System.out.println("O valor não pode ser 1");
        } else {
            System.out.print("\n" + x);

            while (x != 1) {
                if (x % 2 != 0) {
                    x = 3 * x + 1;
                } else {
                    x = x / 2;
                }
                System.out.print(" " + x);
            }
        }
        kb.close();
    }
}
