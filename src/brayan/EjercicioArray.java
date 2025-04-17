        /*
         * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
         * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
         */
        package brayan;

        import java.util.Arrays;

        /**
         *
         * @author bm_vd
         */
        public class EjercicioArray {

            public static void main(String[] args) {
                Producto[] productos = new Producto[10];
                for (int i= 0; i < productos.length; i++) {
                    /*if (i == 5) {
                        continue;//no cuenta
                    } else if (i == 8) {
                        break; // se detiene
                    }*/
                    int numrand = (int)(Math.random()*100)*100;
                    productos[i] = new Producto(("n"+i), i+"", numrand);

                }

                for (Producto producto : productos) {
                    System.out.println(producto);
                }
                System.out.println(productos); // 33

             Arrays.sort(productos);
               System.out.println("Array ordenado: " + Arrays.toString(productos));


            }
        }
