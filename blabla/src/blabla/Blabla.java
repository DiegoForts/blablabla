
package blabla;

public class Blabla {
    
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
        Blabla ex = new Blabla ();
        
        System.out.print(ex.adicao(10, 1));
        System.out.print(ex.subtracao(10, 5));
        System.out.print(ex.multiplicacao(6, 4));
        System.out.print(ex.divisao(8, 2));
    }
}
