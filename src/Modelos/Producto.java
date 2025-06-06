package Modelos;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private String codigo;
    private String categoria;

    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.codigo = String.valueOf(Math.random() * 10); //aleatoria
        this.categoria = categoria;
        this.precio = Math.random() * 10; //aleatorio
    }

    public Producto(String nombre, String codigo, double precio) {
        super();
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = "Sin categoria";
    }

    public Producto(String nombre, String codigo, String categoria, double precio) {
        super();
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("No puede ser vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.isEmpty()) {
            System.out.println("No puede ser vacio");
        } else {
            this.codigo = codigo;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0.0) {
            System.out.println("No puede ser igual o menor que 0");
        } else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Producto{"
                + "nombre='" + nombre + '\''
                + ", codigo='" + codigo + '\''
                + ", precio=" + precio
                + '}';
    }

    @Override
    public int compareTo(Producto otroprod) {
        return Double.compare(this.precio, otroprod.precio);
    }
}
