package LOGICA;

public class POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alu1=new Alumno();
		
		Alumno alu2=new Alumno(5,"Daniel","Méndez");
		
		
		System.out.println("la id del alumno 2 es: "+ alu2.getId());
		System.out.println("el Nombre del alumno 2 es: "+ alu2.getNombre());
		System.out.println("el Apellido del alumno 2 es: "+ alu2.getApellido());
		
		
		// Asignamos valores al alumno 1 con setter
		alu1.setId(4);
		alu1.setNombre("Karen");
		alu1.setApeliido("Carias");
		//comprobamos en consola
		System.out.println("-----------------------------------------");
		System.out.println("la id del alumno 1 es: "+ alu1.getId());
		System.out.println("el Nombre del alumno 1 es: "+ alu1.getNombre());
		System.out.println("el Apellido del alumno 1 es: "+ alu1.getApellido());
		System.out.println("-----------------------------------------");
		//modificamos datos con setter o cambio de valor
		alu2.setId(3);
	
		System.out.println("la id del alumno 2 es: "+ alu2.getId());
		System.out.println("el Nombre del alumno 2 es: "+ alu2.getNombre());
		System.out.println("el Apellido del alumno 2 es: "+ alu2.getApellido());
	}

}
