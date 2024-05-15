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
        switch (type) {
            case "int":
                return getInt("Ingresa un entero: ");
            case "float":
                return getFloat("Ingresa un float: ");
            case "long":
                return getLong("Ingresa un long integer: ");
            case "double":
                return getDouble("Ingresa un double: ");
            case "byte":
                return getByte("Ingresa un byte: ");
            case "short":
                return getShort("Ingresa un short integer: ");
            case "biginteger":
                return getBigInteger("Ingresa un BigInteger: ");
            case "bigdecimal":
                return getBigDecimal("Ingresa un BigDecimal: ");
            case "string":
                return getString("Ingresa un string: ");
            case "boolean":
                return getBoolean("Ingresa un boolean (true/false): ");
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
        return sc.nextInt();
    }

    // Float
    public float getFloat(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextFloat()) {
            System.out.print("Entrada inválida. Por favor ingrese un float: ");
            sc.next();
        }
        return sc.nextFloat();
    }

    // Long
    public long getLong(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextLong()) {
            System.out.print("Entrada inválida. Por favor ingrese un long integer: ");
            sc.next();
        }
        return sc.nextLong();
    }

    // Double
    public double getDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada inválida. Por favor ingrese un double: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    // Byte
    public byte getByte(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextByte()) {
            System.out.print("Entrada inválida. Por favor ingrese un byte: ");
            sc.next();
        }
        return sc.nextByte();
    }

    // Short
    public short getShort(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextShort()) {
            System.out.print("Entrada inválida. Por favor ingrese un short integer: ");
            sc.next();
        }
        return sc.nextShort();
    }

    // BigInteger
    public BigInteger getBigInteger(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextBigInteger()) {
            System.out.print("Entrada inválida. Por favor ingrese un BigInteger: ");
            sc.next();
        }
        return sc.nextBigInteger();
    }

    // BigDecimal
    public BigDecimal getBigDecimal(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextBigDecimal()) {
            System.out.print("Entrada inválida. Por favor ingrese un BigDecimal: ");
            sc.next();
        }
        return sc.nextBigDecimal();
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
        return sc.nextBoolean();
    }

    public void close() {
        sc.close();
    }
}