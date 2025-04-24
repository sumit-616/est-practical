import java.io.*;

class Student implements Serializable {
    String name;
    int age;
    transient double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 92.5);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(s1);
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) in.readObject();
            System.out.println("Object has been deserialized.");
            System.out.println("Name: " + s2.name);
            System.out.println("Age: " + s2.age);
            System.out.println("Marks (transient): " + s2.marks);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}