import java.util.*;

public class ExampleCollection {
    public static void main(String args[]){
        System.out.println("Set Program - HashSet, TreeSet, LinkedSet");

        //declaration of set
        Set<Integer> RollNo = new HashSet<>();
        RollNo.add(1);
        RollNo.add(2);
        RollNo.add(3);
        System.out.println("This is for Set");
        System.out.println("Printed Set Roll Numbers : " + RollNo);

        System.out.println("========HashSet=======");
        //declaration
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(101);   
        numbers.add(102);
        numbers.add(103);
        numbers.add(103); // Duplicate
        numbers.add(104);
        System.out.println("HashSetis for maintaining ordered list ");
        System.err.println("Find the number : " + numbers.contains(102));

        //Remove Number
        System.out.println("Remove the Numbers : " + numbers.remove(102));

        //Print elements of Hash Set
        System.out.println("HashSet elements : " + numbers);

        LinkedHashSet<Integer> num = new LinkedHashSet<>();
        for(Integer i : numbers){
            num.add(i);
        }

        System.out.println("Size of the Student Numbers : " + num.size());
        System.out.println("To check it is empty : " + num.isEmpty());
        System.out.println("Check for contains : " + num.contains(102));

        Set<Integer> treeSet = new TreeSet<>();
        for(Integer roll : numbers){
            treeSet.add(roll);
        }

        System.out.println("Size of the Student Numbers : " + num.size());
    }
}
