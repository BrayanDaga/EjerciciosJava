package Modelos;

public class Empleado {

    private String nombre;
    private int edad;
    private int salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no valida");
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario > 0) {
            this.salario = edad;
        } else {
            System.out.println("Edad no valida");
        }
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", edad: " + this.edad + ", salario: " + this.salario;
    }

}
