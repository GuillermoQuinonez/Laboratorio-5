import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
/**
 * @file PrincipalGUI.java
 * @author José Guillermo Quiñónez Castillo <qui17775@uvg.edu.gt>
 * @author Estuardo Ureta 17010 <ure17010@uvg.edu.gt>
 * @version 4/11/2017 
 */
public class PrincipalGUI {

	private JFrame frmEscalafnDeAspirantes;
	private JTextField tfNombre;
	private JTextField tfDpi;
	private JComboBox<String> cbTipo;
	private JButton btnGuardar;
	private JButton btnValidar;
	private JButton btnValidar2;
	private JTextArea txtEscalafon;
	private JTextArea txtAspirantesSecundaria;
	private JTextArea txtAspirantesBachillerato;
	private static ControlEscalafon controlador; 
	private JButton btnActualizar;
	private JSpinner tfNota1;
	private JSpinner tfNota2;
	private JSpinner tfNota3;
	private JSpinner tfAptitud;
	private JSpinner tfHistoria;
	private JSpinner tfEspaniol;
	private JSpinner tfMatematicas;
	private JSpinner tfPromedioIngresado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		controlador = new ControlEscalafon();
		try {
			controlador.Conexion();
		}
		catch(Exception e) {
			System.out.println("No se pudo hacer la conexion");
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI window = new PrincipalGUI();
					window.frmEscalafnDeAspirantes.setVisible(true);
					window.frmEscalafnDeAspirantes.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//Fin del método

	/**
	 * Create the application.
	 */
	public PrincipalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEscalafnDeAspirantes = new JFrame();
		frmEscalafnDeAspirantes.getContentPane().setBackground(Color.WHITE);
		frmEscalafnDeAspirantes.setTitle("ESCALAF\u00D3N DE ASPIRANTES A PERITO CONTADOR");
		frmEscalafnDeAspirantes.setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());
		frmEscalafnDeAspirantes.setBounds(100, 100, 910, 525);
		frmEscalafnDeAspirantes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEscalafnDeAspirantes.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frmEscalafnDeAspirantes.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 446, 200);
		panel_2.setBorder(new TitledBorder(null, "INGRESO DE DATOS DEL ASPIRANTE ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setForeground(Color.BLACK);
		tfNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblDpi = new JLabel("DPI");
		lblDpi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDpi.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblDpi);
		
		tfDpi = new JTextField();
		tfDpi.setForeground(Color.BLACK);
		tfDpi.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(tfDpi);
		tfDpi.setColumns(10);
		
		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblTipo);
		
		cbTipo = new JComboBox<>();
		cbTipo.addItemListener(new CbListener());
		cbTipo.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		cbTipo.addItem("Seleccione el tipo de aspirante");
		cbTipo.addItem("Egresado de Secundaria");
		cbTipo.addItem("Desvinculado de Secundaria");
		cbTipo.addItem("Egresado de Bachillerato");
		cbTipo.addItem("Desvinculado de Bachillerato");
		panel_2.add(cbTipo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 200, 446, 277);
		panel_3.setBorder(new TitledBorder(null, "Ingreso de Notas", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNotasDeEstudio = new JLabel("NOTAS DE ESTUDIOS");
		lblNotasDeEstudio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNotasDeEstudio.setBounds(7, 19, 213, 46);
		lblNotasDeEstudio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotasDeEstudio);
		
		JLabel lblNotasDeExmenes = new JLabel("NOTAS DE EX\u00C1MENES");
		lblNotasDeExmenes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNotasDeExmenes.setBounds(225, 19, 213, 46);
		lblNotasDeExmenes.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotasDeExmenes);
		
		JLabel lblNota = new JLabel("Nota 1 / Nota 4");
		lblNota.setBounds(7, 70, 104, 46);
		lblNota.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNota);
		
		JLabel lblNotaHistoria = new JLabel("Nota Historia");
		lblNotaHistoria.setBounds(225, 70, 104, 46);
		lblNotaHistoria.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaHistoria);
		
		JLabel lblNotaNota = new JLabel("Nota 2/ Nota 5");
		lblNotaNota.setBounds(7, 121, 104, 46);
		lblNotaNota.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaNota);
		
		JLabel lblNotaEspaol = new JLabel("Nota Espa\u00F1ol");
		lblNotaEspaol.setBounds(225, 121, 104, 46);
		lblNotaEspaol.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaEspaol);
		
		JLabel lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setBounds(7, 172, 104, 46);
		lblNota_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNota_1);
		
		JLabel lblNotaMatemticas = new JLabel("Nota Matem\u00E1ticas");
		lblNotaMatemticas.setBounds(225, 172, 104, 46);
		lblNotaMatemticas.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaMatemticas);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new Listener());
		btnGuardar.setBounds(251, 223, 153, 46);
		panel_3.add(btnGuardar);
		
		JLabel lblNotaEDe = new JLabel("E. de aptitud");
		lblNotaEDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaEDe.setBounds(17, 231, 94, 33);
		panel_3.add(lblNotaEDe);
		
		tfNota1 = new JSpinner();
		tfNota1.setForeground(Color.BLACK);
		tfNota1.setBackground(Color.WHITE);
		tfNota1.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfNota1.setBounds(116, 70, 104, 46);
		panel_3.add(tfNota1);
		
		tfNota2 = new JSpinner();
		tfNota2.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfNota2.setBounds(116, 121, 104, 46);
		panel_3.add(tfNota2);
		
		tfNota3 = new JSpinner();
		tfNota3.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfNota3.setBounds(116, 172, 104, 46);
		panel_3.add(tfNota3);
		
		tfAptitud = new JSpinner();
		tfAptitud.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfAptitud.setBounds(116, 223, 104, 46);
		panel_3.add(tfAptitud);
		
		tfHistoria = new JSpinner();
		tfHistoria.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfHistoria.setBounds(334, 70, 104, 46);
		panel_3.add(tfHistoria);
		
		tfEspaniol = new JSpinner();
		tfEspaniol.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfEspaniol.setBounds(334, 121, 104, 46);
		panel_3.add(tfEspaniol);
		
		tfMatematicas = new JSpinner();
		tfMatematicas.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfMatematicas.setBounds(334, 172, 104, 46);
		panel_3.add(tfMatematicas);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmEscalafnDeAspirantes.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 1, 5, 5));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(null, "ESCALAF\u00D3N", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.add(panel_4);
		panel_4.setLayout(null);
	
		
		txtEscalafon = new JTextArea();
		txtEscalafon.setEditable(false);
		txtEscalafon.setLineWrap(true); 
		JScrollPane scroll = new JScrollPane(txtEscalafon,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(6, 18, 434, 160);
		panel_4.add(scroll);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new Listener());
		btnActualizar.setBounds(165, 191, 116, 32);
		panel_4.add(btnActualizar);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 2, 5, 5));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ASPIRANTES DE SECUNDARIA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblIngresarPromedio = new JLabel("Ingresar promedio");
		lblIngresarPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresarPromedio.setBounds(12, 32, 196, 29);
		panel_6.add(lblIngresarPromedio);
		
		btnValidar = new JButton("VALIDAR");
		btnValidar.addActionListener(new Listener());
		btnValidar.setBounds(57, 109, 108, 37);
		panel_6.add(btnValidar);
		
		txtAspirantesSecundaria = new JTextArea();
		txtAspirantesSecundaria.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		txtAspirantesSecundaria.setEditable(false);
		txtAspirantesSecundaria.setWrapStyleWord(true);
		txtAspirantesSecundaria.setLineWrap(true);
		txtAspirantesSecundaria.setBounds(12, 160, 196, 63);
		panel_6.add(txtAspirantesSecundaria);
		
		tfPromedioIngresado = new JSpinner();
		tfPromedioIngresado.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		tfPromedioIngresado.setBounds(12, 59, 196, 37);
		panel_6.add(tfPromedioIngresado);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new TitledBorder(null, "ASPIRANTES DE BACHILLERATO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblElPromedioEs = new JLabel("El promedio es mayor a 80");
		lblElPromedioEs.setHorizontalAlignment(SwingConstants.CENTER);
		lblElPromedioEs.setBounds(12, 29, 196, 42);
		panel_7.add(lblElPromedioEs);
		
		btnValidar2 = new JButton("VALIDAR");
		btnValidar2.addActionListener(new Listener());
		btnValidar2.setBounds(51, 84, 106, 34);
		panel_7.add(btnValidar2);
		
		txtAspirantesBachillerato = new JTextArea();
		txtAspirantesBachillerato.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		txtAspirantesBachillerato.setEditable(false);
		txtAspirantesBachillerato.setWrapStyleWord(true);
		txtAspirantesBachillerato.setLineWrap(true);
		txtAspirantesBachillerato.setBounds(12, 133, 196, 90);
		panel_7.add(txtAspirantesBachillerato);
	}//Fin del método
	
	public class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == btnGuardar) {
				if(tfNombre.getText().compareTo("") == 0 || tfDpi.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos", "Campos Vacios", 2);
				}
				if(cbTipo.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Seleccione el tipo de aspirante", "Selección incorrecta", 2);
				}
				else {
					if(cbTipo.getSelectedIndex() == 1) {
						controlador.GuardarAspirante(1, tfNombre.getText(), tfDpi.getText(), Float.parseFloat(tfHistoria.getValue().toString()), Float.parseFloat(tfMatematicas.getValue().toString()), Float.parseFloat(tfEspaniol.getValue().toString()), Float.parseFloat(tfNota1.getValue().toString()), Float.parseFloat(tfNota2.getValue().toString()), Float.parseFloat(tfNota3.getValue().toString()), 0);
					}
					else if(cbTipo.getSelectedIndex() == 2) {
						controlador.GuardarAspirante(1, tfNombre.getText(), tfDpi.getText(), Float.parseFloat(tfHistoria.getValue().toString()), Float.parseFloat(tfMatematicas.getValue().toString()), Float.parseFloat(tfEspaniol.getValue().toString()), Float.parseFloat(tfNota1.getValue().toString()), Float.parseFloat(tfNota2.getValue().toString()), Float.parseFloat(tfNota3.getValue().toString()), Float.parseFloat(tfAptitud.getValue().toString()));
					}
					else if(cbTipo.getSelectedIndex() == 3) {
						controlador.GuardarAspirante(3, tfNombre.getText(), tfDpi.getText(), Float.parseFloat(tfHistoria.getValue().toString()), 0, 0, Float.parseFloat(tfNota1.getValue().toString()), Float.parseFloat(tfNota2.getValue().toString()), 0, 0);
						
					}
					else if(cbTipo.getSelectedIndex() == 4) {
						controlador.GuardarAspirante(4, tfNombre.getText(), tfDpi.getText(), Float.parseFloat(tfHistoria.getValue().toString()), 0, 0, Float.parseFloat(tfNota1.getValue().toString()), Float.parseFloat(tfNota2.getValue().toString()), 0, 0);
					}
					txtEscalafon.setText("");
				}
				
			}
			if(arg0.getSource() == btnValidar) {
				float valor = Float.parseFloat(tfPromedioIngresado.getValue().toString()); 
				txtAspirantesSecundaria.setText(controlador.PromedioSecundariaMayorA(valor));
			}
			if(arg0.getSource() == btnValidar2) {
				txtAspirantesBachillerato.setText(controlador.BachilleratoMitadSuperior());
			}
			if(arg0.getSource() == btnActualizar) {
				txtEscalafon.setText("");
				txtEscalafon.setText("********************************** ASPIRANTES *********************************");
				for(Aspirantes miaspirante: controlador.OrdenarParaEscalafon()) {
					String nombre = miaspirante.getNombre(); 
					String clase = miaspirante.getClass().toString(); 
					String nota = String.valueOf(miaspirante.getNotaEscalafon()); 
					txtEscalafon.setText(txtEscalafon.getText() + "\n" + nombre + " (" + clase + ") : " + nota);	
				}
			}
			
		}//Fin del método
		
	}//Fin de la clase
	
	public class CbListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if(cbTipo.getSelectedIndex() == 1) {
				JFormattedTextField nota3 = ((JSpinner.DefaultEditor) tfNota3.getEditor()).getTextField();
				nota3.setEditable(true);
				JFormattedTextField notamatematicas = ((JSpinner.DefaultEditor) tfMatematicas.getEditor()).getTextField();
				notamatematicas.setEditable(true);
				JFormattedTextField notaespaniol = ((JSpinner.DefaultEditor) tfEspaniol.getEditor()).getTextField();
				notaespaniol.setEditable(true);
				JFormattedTextField notaaptitud = ((JSpinner.DefaultEditor) tfAptitud.getEditor()).getTextField();
				notaaptitud.setEditable(false);
				
			}
			if(cbTipo.getSelectedIndex() == 2) {
				JFormattedTextField nota3 = ((JSpinner.DefaultEditor) tfNota3.getEditor()).getTextField();
				nota3.setEditable(true);
				JFormattedTextField notamatematicas = ((JSpinner.DefaultEditor) tfMatematicas.getEditor()).getTextField();
				notamatematicas.setEditable(true);
				JFormattedTextField notaespaniol = ((JSpinner.DefaultEditor) tfEspaniol.getEditor()).getTextField();
				notaespaniol.setEditable(true);
				JFormattedTextField notaaptitud = ((JSpinner.DefaultEditor) tfAptitud.getEditor()).getTextField();
				notaaptitud.setEditable(true);
			}
			if(cbTipo.getSelectedIndex() == 3) {
				JFormattedTextField nota3 = ((JSpinner.DefaultEditor) tfNota3.getEditor()).getTextField();
				nota3.setEditable(false);
				JFormattedTextField notamatematicas = ((JSpinner.DefaultEditor) tfMatematicas.getEditor()).getTextField();
				notamatematicas.setEditable(false);
				JFormattedTextField notaespaniol = ((JSpinner.DefaultEditor) tfEspaniol.getEditor()).getTextField();
				notaespaniol.setEditable(false);
				JFormattedTextField notaaptitud = ((JSpinner.DefaultEditor) tfAptitud.getEditor()).getTextField();
				notaaptitud.setEditable(false);
			}
			if(cbTipo.getSelectedIndex() == 4) {
				JFormattedTextField nota3 = ((JSpinner.DefaultEditor) tfNota3.getEditor()).getTextField();
				nota3.setEditable(false);
				JFormattedTextField notamatematicas = ((JSpinner.DefaultEditor) tfMatematicas.getEditor()).getTextField();
				notamatematicas.setEditable(false);
				JFormattedTextField notaespaniol = ((JSpinner.DefaultEditor) tfEspaniol.getEditor()).getTextField();
				notaespaniol.setEditable(false);
				JFormattedTextField notaaptitud = ((JSpinner.DefaultEditor) tfAptitud.getEditor()).getTextField();
				notaaptitud.setEditable(false);
			}
		}//Fin del método
		
	}//Fin de la clase
	
}//Fin de la clase principal
