
package Modelos;

public class Comparador<T extends Comparable<T>> {
    private int comparar(T a, T b){
     /*    1 si a > b
        -1 si a < b
        0 si son iguales*/
     return a.compareTo(b);
    } 
}
    