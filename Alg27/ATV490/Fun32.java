import javax.swing.JOptionPane;

public class Fun32 {

    public static void main(String[] args) {
        String[] nome = new String[10];
        int L;

        for (L = 0; L < 10; L++) {
            JOptionPane.showMessageDialog(null, "Digite palavra em letras minúsculas " + (L + 1) + ":");
            
            nome[L] = JOptionPane.showInputDialog("");

            restantes(nome[L], nome[L].length(), 'c');
        }

        for (L = 0; L < 10; L++) {
            JOptionPane.showMessageDialog(null, "\n" + (L + 1) + " - " + nome[L]);
        }
    }

    static int restantes(String vet, int tam, char x) {
        int i, cont = 0;
        cont = 0;
        for (i = 0; i < tam; i++) {
            if (vet.charAt(i) == x) {
                vet = vet.substring(0, i) + 'u' + vet.substring(i + 1);
                cont++;
            }
        }
        return cont;
    }
}

