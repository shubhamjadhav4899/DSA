package fileHandling.questionFour;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) throws Exception {
        DataTransfer data = new DataTransfer();
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, "John", 2222.00));
        persons.add(new Person(2, "Smith", 4343.00));
        persons.add(new Person(3, "Vjoy", 4445.00));

        try (FileOutputStream fos = new FileOutputStream("o.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(persons);
        }

        try (FileInputStream fis = new FileInputStream("o.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            List<Person> readPersons = (List<Person>) ois.readObject();

            for (Person p : readPersons) {
                System.out.println(p);
            }

            // Optionally, you can use DataTransfer to copy the list to another file
            data.doTransfer("o.txt", "x.txt");
        }
    }
}
