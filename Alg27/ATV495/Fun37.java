import javax.swing.JOptionPane;

public class Fun37 {

    public static void main(String[] args) {
        int L, c, t, tl;
        String[] nome = new String[5];

        for (L = 0; L < 5; L++) {
            nome[L] = JOptionPane.showInputDialog(null, "Digite nome :" + (L + 1));
        }

        ordena(nome, 5);

        JOptionPane.showMessageDialog(null, "NOMES ORDENADOS");

        for (L = 0; L < 5; L++) {
            JOptionPane.showMessageDialog(null, "\n" + (L + 1) + " - " + nome[L]);
        }
    }

    static void ordena(String[] vet, int tam) {
        int Li, ci;
        String aux;
        for (Li = 0; Li < tam - 1; Li++) {
            for (ci = Li + 1; ci < tam; ci++) {
                if (vet[Li].compareTo(vet[ci]) > 0) {
                    aux = vet[Li];
                    vet[Li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }
}
