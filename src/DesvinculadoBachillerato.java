/**
 * @file DesvinculadoBachillerato.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 2/11/2017 
 */
public class DesvinculadoBachillerato extends EgresadoBachillerato {

	/**
	 * @param nombre
	 * @param dpi
	 * @param notaEscalafon
	 * @param notaHistoria
	 * @param nota4
	 * @param nota5
	 */
	public DesvinculadoBachillerato(String nombre, String dpi, float notaEscalafon, float notaHistoria, float nota4, float nota5) {
		super(nombre, dpi, notaEscalafon, notaHistoria, nota4, nota5);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesvinculadoBachillerato []";
	}

	/* (non-Javadoc)
	 * @see EgresadoBachillerato#NotaParaEscalafon()
	 */
	@Override
	public void NotaParaEscalafon() {
			
	} 
	
	
}
