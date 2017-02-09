
package arraylist1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JW33
 */
public class ArrayList1 {

    public static void main(String[] args) {
        
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        Double value;
        
        do
        {
         System.out.println("Enter a number.");
         value = in.nextDouble();
         if (value > 0 )
            {
             numbers.add(0, value);
            }
        }while(value > 0);
        
        System.out.println("What number do you want to search for? ");
        Double key = in.nextDouble();
        
        
        System.out.println("List of numbers: " + numbers);
        System.out.println("The key value " + key + " is at position: " + numbers.indexOf(key));
    }
}
