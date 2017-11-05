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
 * @author Jos� Guillermo Qui��nez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 4/11/2017 
 */
@Entity(value="Aspirantes")
public class ControlEscalafon {
	private ArrayList<Aspirantes> aspirantes; //Arreglo de aspirantes
	private Datastore ds; //NoSQL Datastore
	private DecimalFormat formato; 
	/**
	 * Constructor del controlador, inicializael arreglo
	 */
	public ControlEscalafon() {
		aspirantes = new ArrayList<Aspirantes>(); 
		formato = new DecimalFormat("0.00"); 
	}//Fin del m�todo
	/**
	 * Retorna el arreglo que contiene los diferentes tipos de aspirantes
	 * @return the aspirantes
	 */
	public ArrayList<Aspirantes> getAspirantes() {
		return aspirantes;
	}//Fin del m�todo
	/**
	 * Permite cambiar el arreglo de objetos aspirantes 
	 * @param aspirantes the aspirantes to set
	 */
	public void setAspirantes(ArrayList<Aspirantes> aspirantes) {
		this.aspirantes = aspirantes;
	}//Fin del m�todo
	
	/**
	 * Este m�todo establece la conexi�n con la base de datos a trav�s de Morphia
	 */
	public void Conexion() {
		MongoClient mongo = new MongoClient();
	    Morphia morphia = new Morphia();
	    morphia.map(Aspirantes.class); // clases a guardar
	    ds = morphia.createDatastore(mongo, "Prueba2"); // Base Datos
	}//Fin del m�todo
	
	/**
	 * Este m�todo recibe como primer par�metro un entero que indica que tipo de aspirante se desea guardar, los otros par�metros indican los atributos que cualquier aspirante necesita para ser guardado. 
	 * Seg�n el tipo llama al constructor espec�fico, luego llama al m�todo NotaParaEscalafon para determinar mediante el m�todo respectivo el valor de la nota de escalaf�n y guardarlo. Finalmente
	 * guarda el objeto en la base de datos. 
	 * @param tipo: int 
	 * @param nombre: String
	 * @param dpi: String
	 * @param notaHistoria: float
	 * @param notaMatematicas: float
	 * @param notaEspaniol: float
	 * @param nota1: float
	 * @param nota2: float
	 * @param nota3: float
	 * @param notaAptitud: float
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
	}//Fin del m�todo
	
	/**
	 * Este m�todo consulta todo los objetos Aspirante contenidos en la base de datos y los almacena en el arreglo aspirantes. Luego mediante la interfaz Comparable ordena a los objetos
	 * en el arreglo seg�n la nota de escalaf�n de mayor a menor como se espec�fica en el m�todo compareTo de la clsae Aspirante. Retorna el arreglo ordenado. 
	 * @return aspirantes: ArrayList<Aspirantes> Arreglo con los aspirantes ordenados de mayor a menor seg�n la nota de escalaf�n
	 */
	public ArrayList<Aspirantes> OrdenarParaEscalafon() {
		Query<Aspirantes> query = ds.createQuery(Aspirantes.class); 
		List<Aspirantes> Misaspirantes = query.asList(); 
		for (Aspirantes miaspirante: Misaspirantes){
            aspirantes.add(miaspirante); 
        }
		Collections.sort(aspirantes);
		return aspirantes; 
	}//Fin del m�todo
	
	/**
	 * Este m�todo recibe como par�metro un valor entre 0 y 100. Luego determina el promedio de la nota de escalaf�n de los aspirantes Desvinculados graduados de Secundaria. Compara el promedio
	 * con el valor ingresado y devuelve una cadena indicando si el promedio es mayor o menor al ingresado. 
	 * @param valor: float
	 * @return validaci�n: String
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
	} //Fin del m�todo
	
	/**
	 * Este m�todo determina la cantidad de aspirantes desvinculados graduados de bachillerato que tienen una nota superior a 80 puntos, luego compara si este n�mero es igual o mayor
	 * al a la mitad del total y devulve una cadena de validaci�n indicado si se se cumple o no la afirmaci�n. 
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
			validacion = "Por lo menos la mitad de los aspirantes desvinculados graduados de bachillerato tienen una nota de escalaf�n mayor a 80"; 
		}
		else {
			validacion = "Menos de la mitad de los aspirantes desvinculados graduados de bachillerato tienen una nota de escalaf�n mayor a 80"; 
		}
		return validacion; 
	}//Fin del m�todo

	
}//Fin de la clase
