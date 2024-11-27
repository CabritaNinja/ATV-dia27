import javax.swing.JOptionPane;

public class Fun42 {

    public static void main(String[] args) {
        int[] num = new int[5];
        int[] numl = new int[5];
        int L, op;
        int flag = 0, flagl = 0;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
            numl[L] = 0;
        }

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n\n\n" +
                    "\n VETORES " +
                    "\n1. Dados do VETOR A" +
                    "\n2. Dados do VETOR B" +
                    "\n3. Imprime VETORES" +
                    "\n4. Soma VETORES" +
                    "\n5. Subtrai VETORES" +
                    "\n6. Sai do programa" +
                    "\nOPCAO:"));

            switch (op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    entrada(numl, 5, "B");
                    flagl = 1;
                    break;
                case 3:
                    if (flag != 0 && flagl != 0) {
                        imprime(num, 5, "A");
                        imprime(numl, 5, "B");
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro opções 1 e 2");
                    }
                    break;
                case 4:
                    if (flag != 0 && flagl != 0) {
                        soma(num, numl, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro opções 1 e 2");
                    }
                    break;
                case 5:
                    if (flag != 0 && flagl != 0) {
                        subtrai(num, numl, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro opções 1 e 2");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "\nSaindo do Algoritmo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\nOpção inválida");
            }
        } while (op != 6);
    }

    static void entrada(int[] vet, int t, String c) {
        for (int L = 0; L < t; L++) {
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (L + 1) + " para o VETOR " + c + ":"));
        }
    }

    static void imprime(int[] vet, int t, String c) {
        StringBuilder sb = new StringBuilder("\nVETOR " + c + "\n");
        for (int L = 0; L < t; L++) {
            sb.append("\n").append(L + 1).append(" - ").append(vet[L]);
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void soma(int[] vet, int[] vetl, int t) {
        StringBuilder sb = new StringBuilder("\nSOMA\n");
        for (int L = 0; L < t; L++) {
            sb.append("\n").append(vet[L] + vetl[L]);
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void subtrai(int[] vet, int[] vetl, int t) {
        StringBuilder sb = new StringBuilder("\nDIFERENCA\n");
        for (int L = 0; L < t; L++) {
            sb.append("\n").append(vet[L] - vetl[L]);
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
