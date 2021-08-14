package ch17a;


import java.io.*;

class Person implements Externalizable{
    String name;
    String job;

    public Person(){}

    public Person(String name, String job){
        this.name = name;
        this.job=job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {
        obj.writeUTF(name);
        //obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
        name =obj.readUTF();
        //job = obj.readUTF();
    }
}

public class ExternalizableTest {
    public static void main(String[] args) {

        Person personLee = new Person("Lee","Boss");
        Person personKim = new Person("Kim", "Head hunter");

        try(FileOutputStream fos = new FileOutputStream("serial.txt"); ObjectOutputStream ods = new ObjectOutputStream(fos)){
            ods.writeObject(personLee);
            ods.writeObject(personKim);
        }catch (IOException e){

        }

        try(FileInputStream fos = new FileInputStream("serial.txt"); ObjectInputStream ois = new ObjectInputStream(fos)){
            Person pLee = (Person)ois.readObject();
            Person pKim =(Person)ois.readObject();
            System.out.println(pLee);
            System.out.println(pKim);
        }catch (IOException e){
            System.out.println(e);
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
