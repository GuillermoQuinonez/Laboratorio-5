import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @file Aspirantes.java
 * @author Jos� Guillermo Qui��nez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 6/11/2017 
 */
@Entity
public abstract class Aspirantes implements Comparable<Aspirantes>{
	@Id private ObjectId id; 
	protected String nombre; 
	protected String dpi; 
	protected float notaEscalafon; 
	protected float notaHistoria; 
	
	/**
	 * Constructor sin par�metros
	 */
	public Aspirantes() {}//Fin del m�todo
	
	/**
	 * Contructor con par�metros, no puede ser usado por la clase, pero es usado por las clasees que heredan de aspirante
	 * @param nombre: String
	 * @param dpi: String
	 * @param notaEscalafon: String
	 * @param notaHistoria: String
	 */
	public Aspirantes(String nombre, String dpi, float notaEscalafon, float notaHistoria) {
		this.nombre = nombre; 
		this.dpi = dpi; 
		this.notaEscalafon = notaEscalafon;
		this.notaHistoria = notaHistoria; 
	}//Fin del m�todo
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}//Fin del m�todo

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//Fin del m�todo

	/**
	 * @return the dpi
	 */
	public String getDpi() {
		return dpi;
	}//Fin del m�todo

	/**
	 * @param dpi the dpi to set
	 */
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}//Fin del m�todo

	/**
	 * @return the notaEscalafon
	 */
	public float getNotaEscalafon() {
		return notaEscalafon;
	}//Fin del m�todo

	/**
	 * @param notaEscalafon the notaEscalafon to set
	 */
	public void setNotaEscalafon(float notaEscalafon) {
		this.notaEscalafon = notaEscalafon;
	}//Fin del m�todo

	/**
	 * @return the notaHistoria
	 */
	public float getNotaHistoria() {
		return notaHistoria;
	}//Fin del m�todo

	/**
	 * @param notaHistoria the notaHistoria to set
	 */
	public void setNotaHistoria(float notaHistoria) {
		this.notaHistoria = notaHistoria;
	}//Fin del m�todo

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aspirantes [nombre=" + nombre + ", dpi=" + dpi + ", notaEscalafon=" + notaEscalafon + ", notaHistoria="
				+ notaHistoria + "]";
	}//Fin del m�todo
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Aspirantes a) {
		if(notaEscalafon < a.getNotaEscalafon()) {
			return 1; 
		} 
		if(notaEscalafon > a.getNotaEscalafon()) {
			return -1; 
		}
		return 0; 
	}//Fin del m�todo
	
	/**
	 * Calcula la ntoa para el escalaf�n seg�n la f�rmula para cada tipo de aspirante
	 */
	public abstract void NotaParaEscalafon(); 

}//Fin de la clase
