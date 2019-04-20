/*
 * ReflectionMethod
 * @author howechen
 * @date 2019/4/20
 */

/*
 * ReflectionMethod
 * @author howechen
 * @date 2019/4/20
 */

package book.corejava.code.reflection;

import java.util.*;
import java.lang.reflect.*;


public class ReflectionMethod {


    public ReflectionMethod(String... names) {

    }


    static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c :
                constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            printNameLoop(paramTypes);
        }
    }

    static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m :
                methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            printNameLoop(paramTypes);
        }

    }

    static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f :
                fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    private static void printNameLoop(Class[] aParamTypes){

        for (int j = 0; j < aParamTypes.length; j++) {
            if (j > 0) System.out.print(", ");
            System.out.print(aParamTypes[j].getName());
        }
        System.out.println(");");
    }
}
