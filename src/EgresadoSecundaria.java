import org.mongodb.morphia.annotations.Entity;
/**
 * @file EgresadoSecundaria.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 6/11/2017 A
 */
@Entity(value="Aspirantes")
public class EgresadoSecundaria extends Aspirantes{
	protected float notaMatematicas; 
	protected float notaEspaniol; 
	protected float nota1; 
	protected float nota2; 
	protected float nota3;
	/**
	 * @param nombre
	 * @param dpi
	 * @param notaEscalafon
	 * @param notaHistoria
	 */
	
	/**
	 * Constructor sin parámetros
	 */
	public EgresadoSecundaria() {}//Fin del método
	
	/**
	 * Constructor con parámteros de la clase
	 * @param nombre: String
	 * @param dpi: String
	 * @param notaEscalafon: float
	 * @param notaHistoria: float
	 * @param notaMatematicas: float
	 * @param notaEspaniol: float
	 * @param nota1: float
	 * @param nota2: float
	 * @param nota3: flat
	 */
	public EgresadoSecundaria(String nombre, String dpi, float notaEscalafon, float notaHistoria, float notaMatematicas, float notaEspaniol, float nota1, float nota2, float nota3) {
		super(nombre, dpi, notaEscalafon, notaHistoria);
		this.notaMatematicas = notaMatematicas; 
		this.notaEspaniol = notaEspaniol; 
		this.nota1 = nota1; 
		this.nota2 = nota2; 
		this.nota3 = nota3; 
	}//Fin del método
	
	/**
	 * @return the notaMatematicas
	 */
	public float getNotaMatematicas() {
		return notaMatematicas;
	}//Fin del método


	/**
	 * @param notaMatematicas the notaMatematicas to set
	 */
	public void setNotaMatematicas(float notaMatematicas) {
		this.notaMatematicas = notaMatematicas;
	}//Fin del método


	/**
	 * @return the notaEspaniol
	 */
	public float getNotaEspaniol() {
		return notaEspaniol;
	}//Fin del método


	/**
	 * @param notaEspaniol the notaEspaniol to set
	 */
	public void setNotaEspaniol(float notaEspaniol) {
		this.notaEspaniol = notaEspaniol;
	}//Fin del método


	/**
	 * @return the nota1
	 */
	public float getNota1() {
		return nota1;
	}//Fin del método


	/**
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}//Fin del método


	/**
	 * @return the nota2
	 */
	public float getNota2() {
		return nota2;
	}//Fin del método


	/**
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}//Fin del método


	/**
	 * @return the nota3
	 */
	public float getNota3() {
		return nota3;
	}//Fin del método


	/**
	 * @param nota3 the nota3 to set
	 */
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}//Fin del método
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EgresadoSecundaria [notaMatematicas=" + notaMatematicas + ", notaEspaniol=" + notaEspaniol + ", nota1="
				+ nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
	}//Fin del método


	/* (non-Javadoc)
	 * @see Aspirantes#NotaParaEscalafon()
	 */
	@Override
	public void NotaParaEscalafon() {
		float PromedioNotasEstudio = (float) ((nota1 + nota2 + nota3)/3.0); 
		float PromedioExamenes = (float) ((notaHistoria + notaMatematicas + notaEspaniol)/3.0); 
		float NotaEgresadoSecundaria = (float) ((0.6*PromedioNotasEstudio) + (0.4*(PromedioExamenes))); 
		this.notaEscalafon = NotaEgresadoSecundaria; 
	}//Fin del método 
	
	
}//Fin de la clase
