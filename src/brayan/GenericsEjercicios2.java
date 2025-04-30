/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Alumno;
import Modelos.Comparador;
import Modelos.Par1;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class GenericsEjercicios2 {

    public static void main(String[] args) {
        /*Crea una clase Par<T, U> que almacene dos elementos genéricos 
    (pueden ser de distinto tipo).
    Agrega métodos:
    getPrimero()
    getSegundo()
    mostrarTipos() → imprime ambos tipos.*/
        Par1<String, Integer> par1 = new Par1<>("Edad", 30);

        System.out.println(par1.getPrimero());
        System.out.println(par1.getSegundo());
        par1.mostrarTipos();

        /*2. 🧮 Operaciones con arrays
        Crea un método genérico:
        <T extends Number> double promedio(T[] numeros)
        Devuelve el promedio de los elementos.*/
        Integer[] numeros = {20, 30, 25, 18, 22};
        System.out.println(obtenerPromedio(numeros));

        /*3. 🔍 Buscar un elemento en un array
        Crea un método:
        <T> boolean contiene(T[] array, T valor)
        Retorna true si el valor está en el array.*/
        String[] vocales = {"a", "e", "i", "o", "u"};
        System.out.println(elementoEncontrado(numeros,15));
        System.out.println(elementoEncontrado(vocales,"e"));
        
        /*4. 🎚️ Comparar dos objetos
        Crea una clase:
        Comparador<T extends Comparable<T>>
        Con un método:
        int comparar(T a, T b)
        Devuelve:
        1 si a > b
        -1 si a < b
        0 si son iguales*/
        
      /*5. 🔁 Intercambiar elementos
       * <T> void intercambiar(T[] arr, int i, int j)
       * Intercambia los elementos en las posiciones i y j. */

        intercambiar(numeros, 1,4);
        System.out.println(Arrays.toString(numeros));//20, 22, 25, 18, 30
        
/*6. 💥 Clase Caja con Wildcard
Crea una función:
void mostrarCaja(Caja<?> caja)
Debe imprimir el contenido de cualquier Caja<T>.

7. 🧠 Contenedor numérico seguro
Crea una clase:

java
Copia
Modifica
CajaNumerica<T extends Number>
Con método:

java
Copia
Modifica
double obtenerDobleValor()
Que retorna objeto.doubleValue() * 2.

8. 🎭 Método genérico múltiple
java
Copia
Modifica
<K, V> void mostrarPar(K clave, V valor)
Imprime el tipo y valor de ambos.

9. 🧺 Filtrar lista numérica
java
Copia
Modifica
<T extends Number> List<T> filtrarMayores(List<T> lista, T limite)
Devuelve los elementos mayores que el límite.

10. 📘 Clase Registro<K, V> con wildcard
Crea un método:

java
Copia
Modifica
void mostrarClaves(List<? extends Registro<K, ?>> registros)
Para imprimir claves de cualquier lista de registros que tengan K como clave.*/
    }

    private static <T extends Number> double obtenerPromedio(T[] numeros) {
        return Arrays.stream(numeros).mapToDouble(Number::doubleValue).sum() / numeros.length;
    }

    private static <T> boolean elementoEncontrado(T[] arr, T valor) {
        return Arrays.stream(arr).anyMatch(e -> e.equals(valor));
    }
    
    private static <T> void intercambiar(T[] arr, int i, int j) {
    	T aux = arr[i];
    	arr[i] = arr[j];
    	arr[j] = aux;
    }

}
