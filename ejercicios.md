**Ejercicios con java.util.stream (Java Streams)**

---

### ✨ BÁSICOS

**Ejercicio 1: Nombres en mayúsculas**
Dada una lista de nombres, obtén una nueva lista con todos los nombres en mayúculas.
```java
List<String> nombres = List.of("Brayan", "Lucia", "Carlos", "Ana");
```
Salida esperada:
```java
["BRAYAN", "LUCIA", "CARLOS", "ANA"]
```

**Ejercicio 2: Filtrar mayores de edad**
Dada una lista de edades, obtén una lista con solo las personas mayores o iguales a 18.
```java
List<Integer> edades = List.of(15, 22, 12, 30, 18, 10);
```
Salida:
```java
[22, 30, 18]
```

**Ejercicio 3: Calcular el total de precios**
```java
List<Integer> precios = List.of(99, 149, 79, 120);
```
Salida esperada:
```
Total: 447
```

**Ejercicio 4: Hay al menos un número par?**
```java
List<Integer> numeros = List.of(1, 3, 5, 7, 9, 10);
```
Salida esperada:
```java
true
```

**Ejercicio 5: Nombre que empiece con 'J'**
```java
List<String> nombres = List.of("Ana", "Jose", "Lucia", "Pedro");
```
Salida:
```java
Optional con el nombre o vacío.
```

**Ejercicio 6: Promedio de edades**
```java
List<Integer> edades = List.of(20, 30, 25, 18, 22);
```
Salida esperada:
```java
Promedio: 23.0
```

**Ejercicio 7: Palabras con más de 5 letras**
```java
List<String> palabras = List.of("Hola", "Programación", "Java", "Stream", "Ejercicios", "Sol");
```
Salida esperada:
```java
[Programación, Stream, Ejercicios]
```

**Ejercicio 8: Concatenar nombres con coma**
```java
List<String> nombres = List.of("Ana", "Luis", "Pedro", "Sofia");
```
Salida esperada:
```java
"Ana,Luis,Pedro,Sofia"
```

**Ejercicio 9: Número más grande**
```java
List<Integer> numeros = List.of(45, 32, 88, 23, 64);
```
Salida esperada:
```java
88
```

**Ejercicio 10: Todos los números son positivos?**
```java
List<Integer> lista = List.of(10, 3, 7, -2, 15);
```
Salida esperada:
```java
false
```

---

### 🚗 CON OBJETOS

**Ejercicio 11: Filtrar autos por precio**
```java
List<Auto> autos = List.of(new Auto("auto1", 15000), new Auto("auto2", 25000));
```
Filtra solo los que cuesten más de 20,000.

**Ejercicio 12: Nombres de libros**
```java
List<Libro> libros = List.of(new Libro("libro1", "autor1"));
```
Salida esperada:
```java
["libro1"]
```

**Ejercicio 13: Alumno con mejor promedio**
```java
List<Alumno> alumnos = List.of(new Alumno("Pedro", 15.4), new Alumno("Maria", 18.4));
```
Usa reduce o max() para encontrar al mejor.

**Ejercicio 14: Precio total del pedido**
```java
List<Producto> productos = List.of(new Producto("prod1", "cod1", 20.2), new Producto("prod2", "cod2", 15.4));
```
Salida esperada:
```java
Total: 35.6
```

---

### 🥞 CON COLLECTORS

**Ejercicio 15: Lista de nombres de productos**
```java
List<String> nombres = productos.stream().map(p -> p.getNombre()).collect(Collectors.toList());
```

**Ejercicio 16: Mapear productos por código**
```java
Map<String, Producto> map = productos.stream().collect(Collectors.toMap(p -> p.getCodigo(), p -> p));
```

**Ejercicio 17: Agrupar por categoría (si tuvieras esa propiedad)**
```java
Map<String, List<Producto>> porCategoria = productos.stream().collect(Collectors.groupingBy(p -> p.getCategoria()));
```

**Ejercicio 18: Contar por categoría**
```java
Map<String, Long> conteo = productos.stream().collect(Collectors.groupingBy(p -> p.getCategoria(), Collectors.counting()));
```

**Ejercicio 19: Precio promedio de productos**
```java
Double promedio = productos.stream().collect(Collectors.averagingDouble(p -> p.getPrecio()));
```

**Ejercicio 20: Producto más caro y más barato (usando max y min con Comparator)**
```java
Optional<Producto> max = productos.stream().max(Comparator.comparingDouble(p -> p.getPrecio()));
```

---

### ✨ BONUS (Extra Desafíos)

- Buscar si hay al menos un producto que cueste más de X.
- Contar cuántos productos hay con precio exacto a Y.
- Agrupar alumnos por calificación (>=15, >=10, <10).
- Obtener los primeros 3 productos ordenados por precio.
- Concatenar todos los códigos de productos con "|" entre ellos.

---

**Fin del documento.**
Puedes copiar estos ejercicios o combinarlos para hacer tus propios retos.

