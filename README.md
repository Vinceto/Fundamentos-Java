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

