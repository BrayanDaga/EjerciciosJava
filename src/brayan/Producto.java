package brayan;

public class Producto implements Comparable<Producto>{
	private String nombre;
	private String codigo;
	private int precio;
	public Producto(String nombre, String codigo, int precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if (nombre.isEmpty()) {
			System.out.println("No puede ser vacio");
		}else {			
			this.nombre = nombre;
		}
	}
	public String getCodigo() {
		
		return codigo;
	}
	public void setCodigo(String codigo) {
		if (codigo.isEmpty()) {
			System.out.println("No puede ser vacio");
		}else {
			this.codigo = codigo;			
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		if (precio <= 0) {
			System.out.println("No puede ser igual o menor que 0");
		}else {			
			this.precio = precio;
		}
	}
	@Override
	public String toString() {
		return "Producto: "+nombre+", con codigo: "+codigo+", precio: "+precio ;
	}

    @Override
    public int compareTo(Producto otroprod) {
        return Integer.compare(this.precio, otroprod.precio);
    }
    }
            
        
