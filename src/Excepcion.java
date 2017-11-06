/**
 * @file Excepciones.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 6/11/2017 
 */
public class Excepcion extends Exception{
	
	/**
	 * Es el constructor de las excepciones, devuelve un mensaje cuando se arroja la excepción.
	 * @param mensaje: String 
	 */
	public Excepcion(String mensaje) {
		super(mensaje); 
	}//Fin del método
}//Fin de la clase
