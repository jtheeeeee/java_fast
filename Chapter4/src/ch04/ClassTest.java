package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            ClassNotFoundException, NoSuchMethodException, SecurityException
    {
        Class cl = Class.forName("ch04.Person");

        Person person = (Person)cl.newInstance();
        person.setName("lee");
        System.out.println(person);

        Class c2 = person.getClass(); //Object의 함수, getClass는 인스턴스가 이미 만들어져 있어야한다.
        Person p = (Person)c2.newInstance();
        System.out.println(p);

        Class [] parameterTypes= {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object [] initargs ={"KIM"};
        Person kim = (Person)cons.newInstance(initargs);
        System.out.println(kim);

        Person kim2 = new Person("KKim",11);

    }
}
