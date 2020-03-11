
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
        int person1 = 10;        
        double tax = 1.05;
        double tip = 1.15;
        double total;
        total = tax * tip;
        
        System.out.println("$" + Math.floor(person1 * total));
        int person2 = 12;
        
        System.out.println("$" + person2 * total);
        int person3 = 9;
        System.out.println("$" + (double)(person3 * total));
        int person4 = 8;
        System.out.println("$" + (person4 * total));
        int person5 = 7;
        System.out.println("$" + person5 * total);
        int person6 = 15;
        System.out.println("$" + person6 * total);
        int person7 = 11;
        System.out.println("$" + person7 * total);
        int person8 = 30;
        System.out.println("$" + person8 * total);
    }    
}
