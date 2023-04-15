import javax.swing.JOptionPane;

//ler um número, calcular e mostrar a sua raiz quadrada e seu cubo


public class CalculadoraCientifica{
    public static void main (String args[]) {
        String auxiliar;
        double numero;

        auxiliar = JOptionPane.showInputDialog("digite um numero qualquer positivo");
        numero = Double.parseDouble(auxiliar);
        
        //processamento
        //raiz quadrada = método sqrt() da classe Math
        double raiz = Math.sqrt(numero);

        //saída = montar a string, utilizando a concatenação + 
        JOptionPane.showMessageDialog(null, "a raiz de " + numero + " = " + raiz); 
    }
}