import javax.swing.JOptionPane;

public class Fun41{

    public static void main(String[] args) {
        int[] num = new int[5];
        int L, flag = 0, op;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
        }

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n\n\n" +
                    "\n MENU VETOR - FUNCAO " +
                    "\n1. Dados do VETOR" +
                    "\n2. Ordena VETOR" +
                    "\n3. Imprime VETOR" +
                    "\n4. Sai do programa" +
                    "\nOPCAO:"));

            switch (op) {
                case 1:
                    entrada(num, 5);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        ordena(num, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro opção 1");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        imprime(num, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro opção 1");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "\nSaindo do Algoritmo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\nOpção inválida");
            }

        } while (op != 4);
    }

    static void entrada(int[] vet, int t) {
        int L;
        for (L = 0; L < t; L++) {
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (L + 1) + ":"));
        }
    }

    static void imprime(int[] vet, int t) {
        StringBuilder sb = new StringBuilder("\nVETOR\n");
        for (int L = 0; L < t; L++) {
            sb.append("\n").append(L + 1).append(" - ").append(vet[L]);
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void ordena(int[] vet, int tam) {
        int L1, cl, aux;
        for (L1 = 0; L1 < tam - 1; L1++) {
            for (cl = L1 + 1; cl < tam; cl++) {
                if (vet[L1] > vet[cl]) {
                    aux = vet[L1];
                    vet[L1] = vet[cl];
                    vet[cl] = aux;
                }
            }
        }
    }
}
