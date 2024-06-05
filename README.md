# Fundamentos de Programacion en Java

## System.out.Println()
Se utiliza para imprimir una linea de texto en la consola seuido de un salto de linea.
```bash
System.out.println("¡Hola, mundo!");
System.out.println("El resultado es: " + resultado);
```

## System.out.printf()
Se utiliza para formatear una cadena con valores variables y luego imprimirlos en la consola.
```bash
int edad = 25;
double altura = 1.75;
System.out.printf("Tengo %d años y mi altura es %.2f metros.", edad, altura);
```

## String.format()
Se utiliza para formatear una cadena con valores variables, pero en lugar de imprimirlos directamente, devuelve la cadena formateada.
```bash
String nombre = "Juan";
int edad = 30;
String mensaje = String.format("Hola, soy %s y tengo %d años.", nombre, edad);
System.out.println(mensaje);
```

## Tabla de referencias.
| Especificador de Formato  | Tipo de Dato | Descripción                                           |
|---------------------------|--------------|-------------------------------------------------------|
| `%s`                      | Texto        | Formatea una cadena de caracteres                     |
| `%d`                      | Entero       | Formatea un número entero decimal                     |
| `%f`                      | Flotante     | Formatea un número de punto flotante                  |
| `%b`                      | Booleano     | Formatea un valor booleano (true o false) como texto  |
| `%c`                      | Carácter     | Formatea un único carácter                            |
| `%n`                      | Salto de línea | Inserta un salto de línea en la cadena de formato   |

## Operadores.
| Operador | Significado           | Ejemplo          | Resultado (si a=10 y b=5) |
|----------|-----------------------|------------------|---------------------------|
| `+`      | Suma                  | `a + b`          | 15                        |
| `-`      | Resta                 | `a - b`          | 5                         |
| `*`      | Multiplicación        | `a * b`          | 50                        |
| `/`      | División              | `a / b`          | 2.0                       |
| `%`      | Módulo                | `a % b`          | 0                         |
| `++`     | Incremento            | `a++` o `++a`    | 11 (para `a++`)           |
| `--`     | Decremento            | `a--` o `--a`    | 9 (para `a--`)            |

## Tipos de acceso.
| Tipo de Acceso | Alcance                                      | Descripción                                                                                                                                                                    |
|----------------|----------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Public         | En cualquier lugar                           | Accesible desde cualquier otra clase, ya sea en el mismo paquete o en otro paquete. Se utiliza para indicar que el miembro es parte de la interfaz pública de la clase.        |
| Private        | Dentro de la misma clase                     | Accesible solo dentro de la misma clase. No es accesible desde clases fuera de la clase que lo contiene, incluso si están en el mismo paquete. Se usa para encapsular.         |
| Protected      | Dentro del mismo paquete y subclases         | Accesible dentro del mismo paquete y por clases derivadas (subclases) de la clase que lo contiene, ya sea dentro del mismo paquete o en otro paquete.                           |
| Default        | Dentro del mismo paquete                     | Accesible solo dentro del mismo paquete. No es accesible desde clases fuera del paquete que lo contiene, incluso si son subclases de la clase que lo contiene.             |

### Tabla de Tipos de Datos Primitivos en Java

| Tipo Primitivo | Tamaño (bits) | Valor Mínimo                   | Valor Máximo                   | Clase Wrapper |
|----------------|----------------|--------------------------------|--------------------------------|---------------|
| `byte`         | 8              | -128                           | 127                            | `Byte`        |
| `short`        | 16             | -32,768                        | 32,767                         | `Short`       |
| `int`          | 32             | -2^31                          | 2^31-1                         | `Integer`     |
| `long`         | 64             | -2^63                          | 2^63-1                         | `Long`        |
| `float`        | 32             | ~1.4E-45                       | ~3.4E+38                       | `Float`       |
| `double`       | 64             | ~4.9E-324                      | ~1.7E+308                      | `Double`      |
| `char`         | 16             | 0 (u0000)                      | 65,535 (uFFFF)                 | `Character`   |
| `boolean`      | 1 (no estándar)| `false`                        | `true`                         | `Boolean`     |

### Descripción de la Tabla

- **Tipo Primitivo**: El tipo de dato primitivo en Java.
- **Tamaño (bits)**: El tamaño en bits del tipo de dato primitivo.
- **Valor Mínimo**: El valor mínimo que puede almacenar el tipo de dato.
- **Valor Máximo**: El valor máximo que puede almacenar el tipo de dato.
- **Clase Wrapper**: La clase wrapper correspondiente en Java, que proporciona métodos y características adicionales para trabajar con el tipo de dato primitivo.

