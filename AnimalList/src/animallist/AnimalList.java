
package animallist;

import java.util.ArrayList;

/**
 * @author JW33
 */
public class AnimalList {

    public static void main(String[] args) 
    {
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        
        Animal one = new Animal("zebra", 5);
        Animal two = new Animal("hippo", 2);
        Animal three = new Animal("marmoset", 8);
        
        zoo.add(one);
        zoo.add(two);
        zoo.add(three);
     
        System.out.println("Kinds in zoo: " + zoo.size());
        System.out.println(zoo);
    }
}
