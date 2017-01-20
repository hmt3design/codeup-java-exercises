import Validator.Validator;

import java.util.*;

/**
 * Created by Harry on 1/16/17.
 */
public class ListDemoInst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        Students harry = new Students("Harry", "Thomas", 52);
        Students jane = new Students("Jane", "Doe", 32);
        Students pat = new Students("Pat", "Patterson", 44);

        // array list of students
        List<Students> students = new ArrayList<Students>();
        students.add(harry);
        students.add(jane);
        students.add(pat);

        //iterating across an ArrayList with a for loop
        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFullName());
            total += students.get(i).getAge();
        }

        System.out.println("Average is " + (total / students.size()));

        // example of using iterator syntax to iterate across an ArrayList
        Iterator studentIterator = students.iterator();
        while ( studentIterator.hasNext() ) {
            System.out.println(studentIterator.next());
        }

        // create a new map, storing the arrayList to the "students" key on the map
        Map codeupPeople = new HashMap();
        codeupPeople.put("students", students);

        //Iterating across a Map using the iterator object
        // iterator object iterates any collection
        Iterator entries = codeupPeople.entrySet().iterator();
        while ( entries.hasNext() ) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String) entry.getKey();
            List value = (List) entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
