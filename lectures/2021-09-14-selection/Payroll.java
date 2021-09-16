/*
 * Payroll Dialog Box with GUI
 */

 import javax.swing.JOptionPane;

 public class Payroll
 {
     public static void main(String[] args)
     {
        // Declaration
        String name;
        int hours;
        double payRate, grossPay;
        

        // Input
        name = JOptionPane.showInputDialog("Enter your name: ");
        hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours: "));
        payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the pay rate: "));

        // Processing
        grossPay = hours * payRate;


        // Output
        JOptionPane.showMessageDialog(null, "Hello! " + name + ", your gross pay is" + grossPay);


     }
 }