import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class PrincipalGUI {

	private JFrame frmEscalafnDeAspirantes;
	private JTextField tfNombre;
	private JTextField tfDpi;
	private JComboBox<String> cbTipo;
	private JTextField tfNota1;
	private JTextField tfHistoria;
	private JTextField tfNota2;
	private JTextField tfEspaniol;
	private JTextField tfNota3;
	private JTextField tfMatematicas;
	private JTextField tfAspirantesSecundaria;
	private JButton btnGuardar;
	private JButton btnActualizar;
	private JButton btnValidar;
	private JButton btnValidar2;
	private JTextArea txtEscalafon;
	private JTextArea txtAspirantesSecundaria;
	private JTextArea txtAspirantesBachillerato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

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
		cbTipo.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
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
		
		tfNota1 = new JTextField();
		tfNota1.setBounds(116, 70, 104, 46);
		tfNota1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(tfNota1);
		tfNota1.setColumns(10);
		
		JLabel lblNotaHistoria = new JLabel("Nota Historia");
		lblNotaHistoria.setBounds(225, 70, 104, 46);
		lblNotaHistoria.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaHistoria);
		
		tfHistoria = new JTextField();
		tfHistoria.setBounds(334, 70, 104, 46);
		tfHistoria.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(tfHistoria);
		tfHistoria.setColumns(10);
		
		JLabel lblNotaNota = new JLabel("Nota 2/ Nota 5");
		lblNotaNota.setBounds(7, 121, 104, 46);
		lblNotaNota.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaNota);
		
		tfNota2 = new JTextField();
		tfNota2.setBounds(116, 121, 104, 46);
		tfNota2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(tfNota2);
		tfNota2.setColumns(10);
		
		JLabel lblNotaEspaol = new JLabel("Nota Espa\u00F1ol");
		lblNotaEspaol.setBounds(225, 121, 104, 46);
		lblNotaEspaol.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaEspaol);
		
		tfEspaniol = new JTextField();
		tfEspaniol.setBounds(334, 121, 104, 46);
		tfEspaniol.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(tfEspaniol);
		tfEspaniol.setColumns(10);
		
		JLabel lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setBounds(7, 172, 104, 46);
		lblNota_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNota_1);
		
		tfNota3 = new JTextField();
		tfNota3.setBounds(116, 172, 104, 46);
		tfNota3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(tfNota3);
		tfNota3.setColumns(10);
		
		JLabel lblNotaMatemticas = new JLabel("Nota Matem\u00E1ticas");
		lblNotaMatemticas.setBounds(225, 172, 104, 46);
		lblNotaMatemticas.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNotaMatemticas);
		
		tfMatematicas = new JTextField();
		tfMatematicas.setBounds(334, 172, 104, 46);
		tfMatematicas.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(tfMatematicas);
		tfMatematicas.setColumns(10);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(37, 223, 153, 46);
		panel_3.add(btnGuardar);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(254, 223, 153, 46);
		panel_3.add(btnActualizar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmEscalafnDeAspirantes.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 1, 5, 5));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(null, "ESCALAF\u00D3N", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		/*JScrollPane scrollPane = new JScrollPane();
		panel_4.add(scrollPane);*/
		
		txtEscalafon = new JTextArea();
		txtEscalafon.setEditable(false);
		txtEscalafon.setLineWrap(true);
		txtEscalafon.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(txtEscalafon, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel_4.add(scrollPane);
		
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
		
		tfAspirantesSecundaria = new JTextField();
		tfAspirantesSecundaria.setHorizontalAlignment(SwingConstants.CENTER);
		tfAspirantesSecundaria.setBounds(12, 67, 196, 29);
		panel_6.add(tfAspirantesSecundaria);
		tfAspirantesSecundaria.setColumns(10);
		
		btnValidar = new JButton("VALIDAR");
		btnValidar.setBounds(57, 109, 108, 37);
		panel_6.add(btnValidar);
		
		txtAspirantesSecundaria = new JTextArea();
		txtAspirantesSecundaria.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		txtAspirantesSecundaria.setEditable(false);
		txtAspirantesSecundaria.setWrapStyleWord(true);
		txtAspirantesSecundaria.setLineWrap(true);
		txtAspirantesSecundaria.setBounds(12, 160, 196, 63);
		panel_6.add(txtAspirantesSecundaria);
		
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
		btnValidar2.setBounds(51, 84, 106, 34);
		panel_7.add(btnValidar2);
		
		txtAspirantesBachillerato = new JTextArea();
		txtAspirantesBachillerato.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		txtAspirantesBachillerato.setEditable(false);
		txtAspirantesBachillerato.setWrapStyleWord(true);
		txtAspirantesBachillerato.setLineWrap(true);
		txtAspirantesBachillerato.setBounds(12, 133, 196, 90);
		panel_7.add(txtAspirantesBachillerato);
	}

}
