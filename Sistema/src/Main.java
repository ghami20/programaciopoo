import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona alumno = new Persona("gamaliel","quiroz"); 
		Persona director = new Persona("roberto","montoya"); 

		System.out.println(alumno);
		System.out.println(director);
		
		//alumno.setActivo("asdasd");
		alumno.Mostraractividad();
		
		System.out.println(alumno);
		System.out.println(Calendar.getInstance());
		System.out.println(ZonedDateTime.now());
		
		LocalDateTime.now();
	}

}
