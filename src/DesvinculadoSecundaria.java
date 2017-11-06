import org.mongodb.morphia.annotations.Entity;

/**
 * @file DesvinculadoSecundaria.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 6/11/2017 
 */
@Entity(value="Aspirantes")
public class DesvinculadoSecundaria extends EgresadoSecundaria {
	private float notaAptitud;

	/**
	 * Constructor sin parámetros
	 */
	public DesvinculadoSecundaria() {}//Fin del método
	
	/**
	 * Constructor con parámetros de la clase
	 * @param nombre:String
	 * @param dpi: String
	 * @param notaEscalafon: float
	 * @param notaHistoria: float
	 * @param notaMatematicas: float
	 * @param notaEspaniol: float
	 * @param nota1: float
	 * @param nota2: float
	 * @param nota3: float
	 */
	public DesvinculadoSecundaria(String nombre, String dpi, float notaEscalafon, float notaHistoria, float notaMatematicas, float notaEspaniol, float nota1, float nota2, float nota3, float notaAptitud) {
		super(nombre, dpi, notaEscalafon, notaHistoria, notaMatematicas, notaEspaniol, nota1, nota2, nota3);
		this.notaAptitud = notaAptitud; 
	}//Fin del método

	/**
	 * @return the notaAptitud
	 */
	public float getNotaAptitud() {
		return notaAptitud;
	}//Fin del método

	/**
	 * @param notaAptitud the notaAptitud to set
	 */
	public void setNotaAptitud(float notaAptitud) {
		this.notaAptitud = notaAptitud;
	}//Fin del método

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesvinculadoSecundaria [notaAptitud=" + notaAptitud + "]";
	} //Fin del método
	
	/* (non-Javadoc)
	 * @see EgresadoSecundaria#NotaParaEscalafon()
	 */
	@Override
	public void NotaParaEscalafon() {
		// TODO Auto-generated method stub
		float PromedioNotasEstudio = (float) ((nota1 + nota2 + nota3)/3.0); 
		float PromedioExamenes = (float) ((notaHistoria + notaMatematicas + notaEspaniol)/3.0); 
		float NotaDesvinculadoSecundaria = (float) (((0.4*PromedioNotasEstudio) + (0.6*PromedioExamenes) + notaAptitud)/2.0);
		this.notaEscalafon = NotaDesvinculadoSecundaria; 
	} //Fin del método
	
}//Fin de la clase
