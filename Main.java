import java.util.Hashtable;

public class Main {
	public static void main (String [ ] Args) {
	        Escuela escuela = new Escuela ();
	        escuela.setDireccionEscuela("sagues");
	        escuela.setTipoEscuela("batxillergoa / zikloal");
	        escuela.setNombreEscuela("donostia");

	        
	        System.out.print("--- Escuela: ");
	        System.out.print("\nDireccionEscuela: " + escuela.getDireccionEscuela());
	        System.out.print("\nTipo: " + escuela.getTipoEscuela());
	        System.out.print("\nNombre: " + escuela.getNombreEscuela());


	        Profesores profesor = new Profesores();
	        profesor.setNombreProfe("Telmo Arzelus");
	        profesor.setIdProfe(2);
	        profesor.setTipoProfe("Programacion");
	        profesor.setHorarioProfe("9-14");

	        System.out.print("\n\n--- Profesor: ");
	        System.out.print("\nNombre: " + profesor.getNombreProfe());
	        System.out.print("\nTipo: " + profesor.getTipoProfe());
	        System.out.print("\nHorario: " + profesor.getHorarioProfe());


		Alumnos alumno = new Alumnos();
	        alumno.setNombreAlumno("Telmo Arzelus");
	        alumno.setIdAlumno(2);
	        alumno.setCursoAlumno("Desarrollo web");
	        alumno.setDniAlumno("777777777T");

	        System.out.print("\n\n--- Alumno: ");
	        System.out.print("\nNombre: " + alumno.getNombreAlumno());
	        System.out.print("\nId: " + alumno.getIdAlumno());
	        System.out.print("\nEstudiando: " + alumno.getCursoAlumno());
	        System.out.print("\nDni: " + alumno.getDniAlumno());

 		//Hashtable

	        Hashtable<String,String> otrosEspacios = new Hashtable<String,String>();
	        otrosEspacios.put("Nombre1", alumno.getNombreAlumno());
			otrosEspacios.put("Id", alumno.getIdAlumno());
			otrosEspacios.put("Estudiando", alumno.getCursoAlumno());
			otrosEspacios.put("Dni", alumno.getDniAlumno());
			System.out.print("\n\n--- Impresion Hashtable : \n");
			System.out.println(otrosEspacios.get("Nombre1"));
			System.out.println(otrosEspacios.get("Dni"));
	        
	        
	}
}
