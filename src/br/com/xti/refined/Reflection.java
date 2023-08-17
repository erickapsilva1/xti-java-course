package br.com.xti.refined;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        String name = "br.com.xti.oop.Account";
        Class myClass = Class.forName(name);
        System.out.println(myClass.getSimpleName()); // class name

        Field[] fields = myClass.getFields();  // public attributes
        for (Field f : fields){
            System.out.println(f);
        }

        Method[] methods = myClass.getDeclaredMethods(); // all methods
        for (Method method : methods){
            System.out.println(method.getName());
        }

        Constructor[] constructors = myClass.getConstructors(); // all constructors
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }

        Object object = myClass.newInstance();
        Method md = myClass.getMethod("deposit", int.class);
        Method me = myClass.getMethod("showBalance");
        md.invoke(object, 120);
        me.invoke(object);

        Constructor constructor = myClass.getConstructor(String.class, double.class);
        Object object1 = constructor.newInstance("Nebie", 1254_14);
        me.invoke(object1);

    }
}
