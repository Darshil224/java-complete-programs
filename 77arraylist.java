import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Demo{
    public static void main(String[] args) {
        //Collection interface belongs to java.util(hence need to import it)[most other classes belongs to java.lang package, which need not to be imported]
        Collection<Integer> nums = new ArrayList<Integer>(); 
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        //advantage of arraylist over array is that we can print whole arraylist at once, but in array we have to use loop to print each element.
        //here we can directly print the whole collection.
        System.out.println(nums);

        
        // List<Integer> nums = new ArrayList<Integer>(); 
        // nums.add(2);
        // nums.add(4);
        // nums.add(6);
        // nums.add(8);
        // //advantage of arraylist over array is that we can print whole arraylist at once, but in array we have to use loop to print each element.
        // //here we can directly print the whole collection.
        // System.out.println(nums);

        for(int n : nums){  //enhanced for loop, using to print all values one by one.
            System.out.println(n);
        }


        
    }
 }

 /**Code:-
  * import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums= new ArrayList<Integer>();
//  	Collection nums=new ArrayList();
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");
    	
    	System.out.println(nums.get(2));
    	
    	System.out.println(nums.indexOf(2));
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(nums);	
//    	}
    	for(Object n:nums)
    	{
    		int num=(Integer)n  ;
    		System.out.println(nums);	
    	}
    }
}

  */


  /**Theory:
   * In this lecture we will learn:
- Set interface in the collection
- Syntax of set interface
- HashSet and TreeSet in a set collection
- Iterable interface in Collection
- How to use an iterator for iterating values


#1
The collection interface is also extended by the set interface.
- List in the collection supports repeated values. The set is an interface in Collection that supports only unique values.
- Package set in the collection is java.util.Set;
- Set extends collection but the class which implements set is different and the class name is HashSet.
- We can define its datatype through generics as well such as greater then bracket  Integer less then bracket

#2
- Set also uses the add() method to insert the values in a set.
- Set does not print the repeated values. It prints the same value only one time.
- Set does not maintain the sequence, it gives values in any random order. The set does not sort the values
- Set also does not support an index for values.

#3
- Instead of using the class HashSet, if we will use the TreeSet, it will give values in sorted order.
 
- All the elements in a TreeSet are sorted as it extends AbstractSet and implements NavigableSet and further NavigableSet extends Sorted Set.


#4
- Collection interface extends an Iterable interface through which we can iterate between the elements by using enhanced for loop, etc.
- Iterable interface contains a method called iterator().
- Iterator returns an iterator object that got all the values from a set. It can be in place of loops.

- It has also a method called next() that gives the values of the next element.
-  It has a method hasNext() that helps the loop to know that the set contains a value of the next element.
 while(values.hasNext())
  System.out.println(values.next());
   */