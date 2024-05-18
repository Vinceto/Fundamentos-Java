package Util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SScan {

    private Scanner sc;

    public SScan() {
        sc = new Scanner(System.in);
    }

    public Object escanear(String type) {
        switch (type.toLowerCase()) {
            case "int":
                return getInt("de tipo entero: ");
            case "float":
                return getFloat("de tipo float: ");
            case "long":
                return getLong("de tipo long integer: ");
            case "double":
                return getDouble("de tipo double: ");
            case "byte":
                return getByte("de tipo byte: ");
            case "short":
                return getShort("de tipo short integer: ");
            case "biginteger":
                return getBigInteger("de tipo BigInteger: ");
            case "bigdecimal":
                return getBigDecimal("de tipo BigDecimal: ");
            case "string":
                return getString("de tipo cadena: ");
            case "boolean":
                return getBoolean("de tipo boolean (true/false): ");
            default:
                System.out.println("Tipo inválido, intente nuevamente.");
                return null;
        }
    }

    // INT
    public int getInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Por favor ingrese un entero: ");
            sc.next();
        }
        int result = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // Float
    public float getFloat(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextFloat()) {
            System.out.print("Entrada inválida. Por favor ingrese un float: ");
            sc.next();
        }
        float result = sc.nextFloat();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // Long
    public long getLong(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextLong()) {
            System.out.print("Entrada inválida. Por favor ingrese un long integer: ");
            sc.next();
        }
        long result = sc.nextLong();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // Double
    public double getDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada inválida. Por favor ingrese un double: ");
            sc.next();
        }
        double result = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // Byte
    public byte getByte(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextByte()) {
            System.out.print("Entrada inválida. Por favor ingrese un byte: ");
            sc.next();
        }
        byte result = sc.nextByte();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // Short
    public short getShort(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextShort()) {
            System.out.print("Entrada inválida. Por favor ingrese un short integer: ");
            sc.next();
        }
        short result = sc.nextShort();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // BigInteger
    public BigInteger getBigInteger(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextBigInteger()) {
            System.out.print("Entrada inválida. Por favor ingrese un BigInteger: ");
            sc.next();
        }
        BigInteger result = sc.nextBigInteger();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // BigDecimal
    public BigDecimal getBigDecimal(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextBigDecimal()) {
            System.out.print("Entrada inválida. Por favor ingrese un BigDecimal: ");
            sc.next();
        }
        BigDecimal result = sc.nextBigDecimal();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    // String
    public String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // Boolean
    public boolean getBoolean(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextBoolean()) {
            System.out.print("Entrada inválida. Por favor ingrese verdadero o falso: ");
            sc.next();
        }
        boolean result = sc.nextBoolean();
        sc.nextLine(); // Consumir el salto de línea
        return result;
    }

    public void close() {
        sc.close();
    }
}
