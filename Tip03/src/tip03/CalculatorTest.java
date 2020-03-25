
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
      System.out.print("Person 1: ");
      calc.findTotal(10);
      
       System.out.print("Person 2: ");
       calc.findTotal(12.0);
       
       System.out.print("Person 3: ");
       calc.findTotal(9.0);
       
       System.out.print("Person 4: ");
       calc.findTotal(8);
       
       System.out.print("Person 5: ");
       calc.findTotal(7);
       
       System.out.print("Alex: ");
       calc.findTotal(15);
       
       System.out.print("Person 7: ");
       calc.findTotal(11);
       
       System.out.print("Person 8: ");
       calc.findTotal(30);
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
