package LOGICA;

public class Alumno {
	int id;
	String nombre;
	String apellido;
	
	//constructor vacio
	public Alumno() { 
		
	}
	
	//constructor con parametros de la clase Alumno
	
	public Alumno(int id, String nombre, String apellido) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		}
	
	
	// estructuramos los setter y los getter de cada parametro
	
	public int getId()	{
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApeliido(String apellido) {
		this.apellido=apellido;
	}
	
	//metodo para mostrar nombre de alumno en especifico
	public void mostrarNombre() {
		
		System.out.println("hola mundo, soy un alumno y se decir mi nombre");
	}
public void saberAprobado(double calificacion) {
	
	if(calificacion>=6) {
		System.out.println("esta aprobado");
	}else { 
			System.out.println("esta reprobado");
	}
	
}

}
