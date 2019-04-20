/*
 * ReflectionMethodTest
 * @author howechen
 * @date 2019/4/20
 */

package book.corejava.code.reflection;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionMethodTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println("class " + name);
            if (supercl != null && supercl != Object.class) {
                System.out.print(" extends " + supercl.getName());
            }
            System.out.print("\n{\n");
            ReflectionMethod.printConstructors(cl);
            System.out.println();
            ReflectionMethod.printMethods(cl);
            System.out.println();
            ReflectionMethod.printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
