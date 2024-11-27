import javax.swing.JOptionPane;

public class Funl2 {

    public static void main(String[] args) {
        int num, pri;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número > 0:"));
        pri = primo(num);

        if (pri == 0) {
            JOptionPane.showMessageDialog(null, " é primo " + num);
        } else {
            JOptionPane.showMessageDialog(null, " não é primo " + num);
        }
    }

    static int primo(int n) {
        int c = 0, p = 2;

        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }

        return c;
    }
}
