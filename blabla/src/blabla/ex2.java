package blabla;
import javax.swing.JOptionPane
public class ex2 {
     public double adicao(double n, double n1) {
            return n + n1;
        }
       public double subtracao(double n, double n1) {
            return n - n1;
        }
        public double multiplicacao(double n, double n1) {
            return n * n1;
        }
         public double divisao(double n, double n1) {
            return n / n1;
        }
         public static void main(String[] args) {
        ex2 ex = new ex2 ();
        
        double n =Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        double n1 =Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 adição, 2 subtração, 3 multiplicação, 4 divisão"));
        
        switch(op) {
            case 1:
               
        {
         
            JOptionPane.showMessageDialog("O r" + adicao);
        }
                break;
            case 2:
             JOptionPane.showMessageDialog("O r" + subtracao);
                break;
            case 3:
                 JOptionPane.showMessageDialog("O r" + multiplicacao);
                break;
            case 4:
                  JOptionPane.showMessageDialog("O r" + divisao);
                break;
        }
         }            
}
