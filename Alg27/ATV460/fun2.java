import javax.swing.JOptionPane;

public class fun2 {

    public static void main(String[] args) {
        int a, c;

        for (c = 1; c < 3; c++) {
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite numero:"));
            JOptionPane.showMessageDialog(null, "Dobro: " + dob(a));
        }
    }

    static int dob(int x) {
        return x * 2;
    }
}
    
