import javax.swing.JOptionPane;

public class Fun39 {

    public static void main(String[] args) {
        int L, c, num[] = new int[10], n, aux;
        
        for (L = 0; L < 10; L++) {
            num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (L + 1) + ":"));
        }

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de busca:"));

        ordena(num, 10);
        
        c = busca(num, 10, n);
        
        JOptionPane.showMessageDialog(null, "VETOR");
        
        for (L = 0; L < 10; L++) {
            JOptionPane.showMessageDialog(null, "\n" + (L + 1) + " - " + num[L]);
        }
        
        c++;
        
        if (c != 0) {
            JOptionPane.showMessageDialog(null, "\nPosição no vetor: " + c);
        } else {
            JOptionPane.showMessageDialog(null, "\nNão ENCONTRADO");
        }
    }

    static void ordena(int[] vet, int tam) {
        int Li, cl, aux;
        for (Li = 0; Li < tam - 1; Li++) {
            for (cl = Li + 1; cl < tam; cl++) {
                if (vet[Li] > vet[cl]) {
                    aux = vet[Li];
                    vet[Li] = vet[cl];
                    vet[cl] = aux;
                }
            }
        }
    }

    static int busca(int[] vet, int tam, int chave) {
        int i, mi = 0, meio, fim = tam - 1;
        while (mi <= fim) {
            meio = (mi + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else {
                if (chave < vet[meio]) {
                    fim = meio - 1;
                } else {
                    mi = meio + 1;
                }
            }
        }
        return -1;
    }
}
