import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String x = JOptionPane.showInputDialog("Ingresa el primer número:");
        String y = JOptionPane.showInputDialog("Ingresa el segundo numero:");
        String z = JOptionPane.showInputDialog("Ingresa el tercer numero:");
        System.out.println("Resultado: "+((Double.parseDouble(x)+Double.parseDouble(y)+Double.parseDouble(z)))/3);
        System.out.println("Hi ");
        System.out.println("Resultado: "+((Double.parseDouble(x)+Double.parseDouble(y)+Double.parseDouble(z))/3));

    }
}