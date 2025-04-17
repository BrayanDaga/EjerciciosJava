package Modelos;

import java.util.ArrayList;
import java.util.Iterator;


public class Empresa {
	private ArrayList<Empleado> empleados = new ArrayList<>();
	
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado newEmpleado) {
		this.empleados.add(newEmpleado);
	}
	
	public Empresa() {}
	public void eliminarEmpleado(String nombre) {
	    Iterator<Empleado> iter = empleados.iterator();
		while (iter.hasNext()) {
			Empleado empleado = iter.next();
			if (empleado.getNombre().equals(nombre)) {
				iter.remove();
			}
		}
	}
}
