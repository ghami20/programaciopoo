
public class Persona {
	private String nombre;
	private String apellido;
	private String activo;
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.activo = "Activo";

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	public void cambiarnombre() {
		this.nombre = "vacac";
	}	
	
	public final void Mostraractividad() {
		if(activo.equals("Activo")) {
		System.out.println("Esta activo");
		}else
			System.out.println("No esta activo");
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
}
