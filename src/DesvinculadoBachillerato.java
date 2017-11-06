import org.mongodb.morphia.annotations.Entity;

/**
 * @file DesvinculadoBachillerato.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 6/11/2017 
 */
 
@Entity(value="Aspirantes")
public class DesvinculadoBachillerato extends EgresadoBachillerato {

	/**
	 * Constructor sin parámetros
	 */
	public DesvinculadoBachillerato() {}//Fin del método
	
	/**
	 * Constructor con parámetros de la clase
	 * @param nombre: String
	 * @param dpi: String
	 * @param notaEscalafon: float
	 * @param notaHistoria: float
	 * @param nota4: float
	 * @param nota5: float
	 */
	public DesvinculadoBachillerato(String nombre, String dpi, float notaEscalafon, float notaHistoria, float nota4, float nota5) {
		super(nombre, dpi, notaEscalafon, notaHistoria, nota4, nota5);
	}//Fin del método
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesvinculadoBachillerato []";
	}//Fin del método

	/* (non-Javadoc)
	 * @see EgresadoBachillerato#NotaParaEscalafon()
	 */
	@Override
	public void NotaParaEscalafon() {
		float PromedioNotasEstudio = (float) ((nota4 + nota5)/2.0); 
		float PromedioExamenes = notaHistoria; 
		float NotaDesvinculadoBachillerato = (float) ((0.4*PromedioNotasEstudio) + (0.6*PromedioExamenes)); 
		this.notaEscalafon = NotaDesvinculadoBachillerato; 
	} //Fin del método
	
}//Fin de la clase
