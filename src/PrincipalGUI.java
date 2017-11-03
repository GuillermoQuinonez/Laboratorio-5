import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class PrincipalGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI window = new PrincipalGUI();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 744, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresar = new JLabel("INGRESAR");
		lblIngresar.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblIngresar.setBounds(12, 13, 87, 28);
		frame.getContentPane().add(lblIngresar);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(12, 54, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDpi = new JLabel("D.P.I.:");
		lblDpi.setBounds(12, 83, 56, 16);
		frame.getContentPane().add(lblDpi);
		
		textField = new JTextField();
		textField.setBounds(72, 80, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 51, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		lblTipo.setBounds(12, 129, 56, 16);
		frame.getContentPane().add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(40, 168, 121, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNotasDelColegio = new JLabel("NOTAS DEL COLEGIO");
		lblNotasDelColegio.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		lblNotasDelColegio.setBounds(12, 215, 160, 16);
		frame.getContentPane().add(lblNotasDelColegio);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setBounds(12, 255, 56, 16);
		frame.getContentPane().add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota");
		lblNota_1.setBounds(12, 284, 56, 16);
		frame.getContentPane().add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota");
		lblNota_2.setBounds(12, 313, 56, 16);
		frame.getContentPane().add(lblNota_2);
		
		JLabel lblNota_3 = new JLabel("Nota");
		lblNota_3.setBounds(12, 342, 56, 16);
		frame.getContentPane().add(lblNota_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 252, 56, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(45, 284, 56, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(45, 313, 56, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(45, 339, 54, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNota_4 = new JLabel("Nota");
		lblNota_4.setBounds(12, 371, 56, 16);
		frame.getContentPane().add(lblNota_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(45, 368, 56, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNotasExamenes = new JLabel("NOTAS EXAMENES");
		lblNotasExamenes.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		lblNotasExamenes.setBounds(184, 215, 134, 16);
		frame.getContentPane().add(lblNotasExamenes);
		
		JLabel lblHistoria = new JLabel("Historia:");
		lblHistoria.setBounds(179, 258, 56, 16);
		frame.getContentPane().add(lblHistoria);
		
		JLabel lblEspaol = new JLabel("Espa\u00F1ol:");
		lblEspaol.setBounds(179, 301, 56, 16);
		frame.getContentPane().add(lblEspaol);
		
		JLabel lblMatematicas = new JLabel("Matematicas:");
		lblMatematicas.setBounds(179, 342, 77, 16);
		frame.getContentPane().add(lblMatematicas);
		
		textField_7 = new JTextField();
		textField_7.setBounds(247, 252, 56, 22);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(247, 298, 56, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(268, 339, 56, 22);
		frame.getContentPane().add(textField_9);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(206, 395, 97, 25);
		frame.getContentPane().add(btnIngresar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(652, 13, 21, 193);
		frame.getContentPane().add(scrollBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(405, 14, 268, 193);
		JScrollBar scrollBar = new JScrollBar(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(textArea);
		
		
		JButton btnEscalafn = new JButton("Escalaf\u00F3n");
		btnEscalafn.setBounds(490, 212, 97, 25);
		frame.getContentPane().add(btnEscalafn);
	}
}
