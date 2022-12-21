package Ex1;

import Ex1.Exceptions.StringNotContainesAbcException;
import Ex1.Exceptions.StringNotEndsWith1a2bException;
import Ex1.Exceptions.StringNotStartsWith555Exception;

public class StringMethods {

    public static void printContainsABC(String str) throws StringNotContainesAbcException {
        if (str.toLowerCase().contains("abc") || str.toUpperCase().contains("ABC")) {
            System.out.println("Строка содержит ABC (без учета регистра)");
        } else {
            throw new StringNotContainesAbcException("Строка не содержит ABC (без учета регистра)");
        }
    }

    public static void printStartsWith555(String str) throws StringNotStartsWith555Exception {
        if (str.startsWith("555")) {
            System.out.println("Строка начинается с 555");
        } else {
            throw new StringNotStartsWith555Exception("Строка не начинается с 555");
        }
    }

    public static void printEndsWith1a2b(String str) throws StringNotEndsWith1a2bException {
        if (str.endsWith("1a2b")) {
            System.out.println("Строка заканчивается на 1a2b");
        } else {
            throw new StringNotEndsWith1a2bException("Строка не заканчивается на 1a2b");
        }
    }
}


