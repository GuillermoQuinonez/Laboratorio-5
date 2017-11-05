import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.annotations.Entity;
import com.mongodb.MongoClient;
import org.mongodb.morphia.query.Query;
/**
 * @file ControlEscalafon.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 2/11/2017 
 */
@Entity(value="Aspirantes")
public class ControlEscalafon {
	private ArrayList<Aspirantes> aspirantes; 
	private Datastore ds; 
	private DecimalFormat formato; 
	/**
	 * 
	 */
	public ControlEscalafon() {
		aspirantes = new ArrayList<Aspirantes>();
		formato = new DecimalFormat("0.00"); 
	}
	/**
	 * @return the aspirantes
	 */
	public ArrayList<Aspirantes> getAspirantes() {
		return aspirantes;
	}
	/**
	 * @param aspirantes the aspirantes to set
	 */
	public void setAspirantes(ArrayList<Aspirantes> aspirantes) {
		this.aspirantes = aspirantes;
	}
	
	/**
	 * El método permite establcer la conexión con la base de datos mediante Morphia
	 */
	public void Conexion() {
		MongoClient mongo = new MongoClient();
	    Morphia morphia = new Morphia();
	    morphia.map(Aspirantes.class); // clases a guardar
	    ds = morphia.createDatastore(mongo, "Prueba2"); // Base Datos
	}
	
	/**
	 * @param tipo
	 * @param nombre
	 * @param dpi
	 * @param notaHistoria
	 * @param notaMatematicas
	 * @param notaEspaniol
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 * @param notaAptitud
	 */
	public void GuardarAspirante(int tipo, String nombre, String dpi, float notaHistoria, float notaMatematicas, float notaEspaniol, float nota1, float nota2, float nota3, float notaAptitud) {
		Aspirantes aspirante = null; 
		if(tipo == 1) {
			aspirante = new EgresadoSecundaria(nombre, dpi, 0, notaHistoria, notaMatematicas, notaEspaniol, nota1, nota2, nota3);
		}
		else if(tipo == 2) {
			aspirante = new DesvinculadoSecundaria(nombre, dpi, 0, notaHistoria, notaMatematicas, notaEspaniol, nota1, nota2, nota3, notaAptitud);
		}
		else if(tipo == 3) {
			aspirante = new EgresadoBachillerato(nombre, dpi, 0, notaHistoria, nota1, nota2);
		}
		else if(tipo == 4) {
			aspirante = new DesvinculadoBachillerato(nombre, dpi, 0, notaHistoria, nota1, nota2);
		}
		aspirante.NotaParaEscalafon();
		ds.save((Aspirantes)aspirante); 
	}
	
	/**
	 * @return
	 */
	public ArrayList<Aspirantes> OrdenarParaEscalafon() {
		Query<Aspirantes> query = ds.createQuery(Aspirantes.class); 
		List<Aspirantes> Misaspirantes = query.asList(); 
		for (Aspirantes miaspirante: Misaspirantes){
            aspirantes.add(miaspirante); 
        }
		Collections.sort(aspirantes);
		return aspirantes; 
	}
	
	/**
	 * @param valor
	 * @return
	 */
	public String PromedioSecundariaMayorA(float valor) {
		String validacion = "";  
		float suma = 0; 
		int total = 0; 
		for(Aspirantes miaspirante: OrdenarParaEscalafon()) {
			if(miaspirante instanceof DesvinculadoSecundaria) {
				suma = suma + miaspirante.getNotaEscalafon(); 
				total ++; 
			}
		}
		float promedio = suma/total; 
		if(promedio > valor) {
			validacion =  "El promedio de los estudiantes desvinculados graduados de secundaria es mayor a "+ valor + "\n" + " Tiene un valor de " + formato.format(promedio); 
		}
		else {
			validacion =  "El promedio de los estudiantes desvinculados graduados de secundaria es menor a "+ valor + "\n" + " Tiene un valor de " + formato.format(promedio);
		}
		return validacion; 
	} 
	
	/**
	 * @return
	 */
	public String BachilleratoMitadSuperior() {
		int total = 0; 
		int mayor80 = 0; 
		String validacion = ""; 
		for(Aspirantes miaspirante: OrdenarParaEscalafon()) {
			if(miaspirante instanceof DesvinculadoBachillerato) {
				total++; 
				if(miaspirante.getNotaEscalafon() > 80) {
					mayor80++; 
				}
			}
		}
		if(mayor80 >= (total*0.5)) {
			validacion = "Por lo menos la mitad de los aspirantes desvinculados graduados de bachillerato tienen una nota de escalafón mayor a 80"; 
		}
		else {
			validacion = "Menos de la mitad de los aspirantes desvinculados graduados de bachillerato tienen una nota de escalafón mayor a 80"; 
		}
		return validacion; 
	}

	
}
