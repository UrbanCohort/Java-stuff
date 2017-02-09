
package animallist;

/**
 * @author JW33
 */
public class Animal {
  
    private String type;
    private int numberOf;
    
    public Animal(String input1, int input2)
    {
     type = input1;
     numberOf = input2;
    }
    
    public String toString()
    {
     return numberOf + " " + type;   
    }
}
