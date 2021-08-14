package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptiion {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }


    public static void main(String[] args) {

        ThrowsExceptiion test = new ThrowsExceptiion();

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
