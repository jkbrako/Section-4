
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double tax = 1.05;
        double tip = 1.15;
        
        int person1 = 10;
        System.out.println((int)person1 * tax * tip );
        int person2;
        int person3;
        int person4;
        int person5;
        int person6;
        int person7;
        int person8;
    }    
}
