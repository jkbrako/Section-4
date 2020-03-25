
package tip03;

public class Calculator {
    public double tax = .05;
    public double tip = .15;
    
    public void findTotal(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);

    }

    void findTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
