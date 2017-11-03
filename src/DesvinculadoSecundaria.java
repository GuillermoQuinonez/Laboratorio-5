/**
 * @file DesvinculadoSecundaria.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 2/11/2017 A
 */
public class DesvinculadoSecundaria extends EgresadoSecundaria {
	private float notaAptitud;

	public DesvinculadoSecundaria() {}
	
	/**
	 * @param nombre
	 * @param dpi
	 * @param notaEscalafon
	 * @param notaHistoria
	 * @param notaMatematicas
	 * @param notaEspaniol
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 */
	public DesvinculadoSecundaria(String nombre, String dpi, float notaEscalafon, float notaHistoria, float notaMatematicas, float notaEspaniol, float nota1, float nota2, float nota3, float notaAptitud) {
		super(nombre, dpi, notaEscalafon, notaHistoria, notaMatematicas, notaEspaniol, nota1, nota2, nota3);
		this.notaAptitud = notaAptitud; 
	}

	/**
	 * @return the notaAptitud
	 */
	public float getNotaAptitud() {
		return notaAptitud;
	}

	/**
	 * @param notaAptitud the notaAptitud to set
	 */
	public void setNotaAptitud(float notaAptitud) {
		this.notaAptitud = notaAptitud;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesvinculadoSecundaria [notaAptitud=" + notaAptitud + "]";
	} 
	
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
	} 
	
	
	
	
}
