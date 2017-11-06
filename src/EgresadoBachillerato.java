import org.mongodb.morphia.annotations.Entity;

/**
 * @file EgresadoBachillerato.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 6/11/2017 A
 */

@Entity(value="Aspirantes")
public class EgresadoBachillerato extends Aspirantes {
	protected float nota4; 
	protected float nota5;
	
	/**
	 * Constructor sin parámetros
	 */
	public EgresadoBachillerato() {}//Fin del método
	
	/**
	 * Constructor con parámetros de la clase
	 * @param nombre: String
	 * @param dpi: String
	 * @param notaEscalafon: float
	 * @param notaHistoria: float
	 * @param nota4: float
	 * @param nota5: float
	 */
	public EgresadoBachillerato(String nombre, String dpi, float notaEscalafon, float notaHistoria, float nota4, float nota5) {
		super(nombre, dpi, notaEscalafon, notaHistoria);
		this.nota4 = nota4; 
		this.nota5 = nota4; 
	}//Fin del método

	/**
	 * @return the nota4
	 */
	public float getNota4() {
		return nota4;
	}//Fin del método

	/**
	 * @param nota4 the nota4 to set
	 */
	public void setNota4(float nota4) {
		this.nota4 = nota4;
	}//Fin del método

	/**
	 * @return the nota5
	 */
	public float getNota5() {
		return nota5;
	}//Fin del método

	/**
	 * @param nota5 the nota5 to set
	 */
	public void setNota5(float nota5) {
		this.nota5 = nota5;
	}//Fin del método

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EgresadoBachillerato [nota4=" + nota4 + ", nota5=" + nota5 + "]";
	}//Fin del método

	/* (non-Javadoc)
	 * @see Aspirantes#NotaParaEscalafon()
	 */
	@Override
	public void NotaParaEscalafon() {
		float PromedioNotasEstudio = (float) ((nota4 + nota5)/2.0); 
		float PromedioExamenes = notaHistoria; 
		float NotaEgresadoBachillerato = (float) ((0.6*PromedioNotasEstudio) + (0.4*PromedioExamenes)); 
		this.notaEscalafon = NotaEgresadoBachillerato; 
	}//Fin del método 
		
}//Fin de la clase
