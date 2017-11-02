/**
 * @file Aspirantes.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 2/11/2017 A
 */
public abstract class Aspirantes implements Comparable<Aspirantes>{
	protected String nombre; 
	protected String dpi; 
	protected float notaEscalafon; 
	protected float notaHistoria; 
	
	public Aspirantes(String nombre, String dpi, float notaEscalafon, float notaHistoria) {
		this.nombre = nombre; 
		this.dpi = dpi; 
		this.notaEscalafon = notaEscalafon;
		this.notaHistoria = notaHistoria; 
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dpi
	 */
	public String getDpi() {
		return dpi;
	}

	/**
	 * @param dpi the dpi to set
	 */
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	/**
	 * @return the notaEscalafon
	 */
	public float getNotaEscalafon() {
		return notaEscalafon;
	}

	/**
	 * @param notaEscalafon the notaEscalafon to set
	 */
	public void setNotaEscalafon(float notaEscalafon) {
		this.notaEscalafon = notaEscalafon;
	}

	/**
	 * @return the notaHistoria
	 */
	public float getNotaHistoria() {
		return notaHistoria;
	}

	/**
	 * @param notaHistoria the notaHistoria to set
	 */
	public void setNotaHistoria(float notaHistoria) {
		this.notaHistoria = notaHistoria;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aspirantes [nombre=" + nombre + ", dpi=" + dpi + ", notaEscalafon=" + notaEscalafon + ", notaHistoria="
				+ notaHistoria + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Aspirantes a) {
		if(notaEscalafon < a.getNotaEscalafon()) {
			return -1; 
		} 
		if(notaEscalafon > a.getNotaEscalafon()) {
			return 1; 
		}
		return 0; 
	}
	
	/**
	 * Calcula la nota para el escalafon según las especificaciones de cada tipo de aspirante
	 */
	public abstract void NotaParaEscalafon(); 
	
	
	
	

}
