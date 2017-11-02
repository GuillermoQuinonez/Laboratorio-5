/**
 * @file EgresadoSecundaria.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 2/11/2017 A
 */
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
	public EgresadoSecundaria(String nombre, String dpi, float notaEscalafon, float notaHistoria, float notaMatematicas, float notaEspaniol, float nota1, float nota2, float nota3) {
		super(nombre, dpi, notaEscalafon, notaHistoria);
		this.notaMatematicas = notaMatematicas; 
		this.notaEspaniol = notaEspaniol; 
		this.nota1 = nota1; 
		this.nota2 = nota2; 
		this.nota3 = nota3; 
	}
	
	/**
	 * @return the notaMatematicas
	 */
	public float getNotaMatematicas() {
		return notaMatematicas;
	}


	/**
	 * @param notaMatematicas the notaMatematicas to set
	 */
	public void setNotaMatematicas(float notaMatematicas) {
		this.notaMatematicas = notaMatematicas;
	}


	/**
	 * @return the notaEspaniol
	 */
	public float getNotaEspaniol() {
		return notaEspaniol;
	}


	/**
	 * @param notaEspaniol the notaEspaniol to set
	 */
	public void setNotaEspaniol(float notaEspaniol) {
		this.notaEspaniol = notaEspaniol;
	}


	/**
	 * @return the nota1
	 */
	public float getNota1() {
		return nota1;
	}


	/**
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}


	/**
	 * @return the nota2
	 */
	public float getNota2() {
		return nota2;
	}


	/**
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}


	/**
	 * @return the nota3
	 */
	public float getNota3() {
		return nota3;
	}


	/**
	 * @param nota3 the nota3 to set
	 */
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	


	/* (non-Javadoc)
	 * @see Aspirantes#NotaParaEscalafon()
	 */
	@Override
	public void NotaParaEscalafon() {
		float PromedioNotasEstudio = (float) ((nota1 + nota2 + nota3)/3.0); 
		float PromedioExamenes = (float) ((notaHistoria + notaMatematicas + notaEspaniol)/3.0); 
		float NotaEgresadoSecundaria = (float) ((0.6*PromedioNotasEstudio) + (0.4*(PromedioExamenes))); 
		this.notaEscalafon = NotaEgresadoSecundaria; 
	} 
	
	
}
