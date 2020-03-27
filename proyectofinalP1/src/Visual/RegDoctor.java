package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

public class RegDoctor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private ButtonGroup botones = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegDoctor dialog = new RegDoctor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegDoctor() {
		setModal(true);
		setTitle("Registrar Doctor");
		setResizable(false);
		setBounds(100, 100, 696, 468);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Informaci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 11, 670, 379);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 59, 305, 291);
		panel_3.add(panel_1);
		panel_1.setBorder(new LineBorder(SystemColor.scrollbar));
		panel_1.setLayout(null);
		
		JLabel label_5 = new JLabel("Nombre:");
		label_5.setBounds(10, 17, 65, 14);
		panel_1.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 48, 290, 20);
		panel_1.add(textField_2);
		
		JLabel label_6 = new JLabel("Direcci\u00F3n:");
		label_6.setBounds(10, 153, 58, 14);
		panel_1.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 184, 290, 20);
		panel_1.add(textField_4);
		
		JLabel label_7 = new JLabel("E-mail:");
		label_7.setBounds(10, 221, 46, 14);
		panel_1.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 252, 290, 20);
		panel_1.add(textField_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 116, 290, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Apellido:");
		lblNewLabel.setBounds(10, 85, 65, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(345, 59, 305, 291);
		panel_3.add(panel_2);
		panel_2.setBorder(new LineBorder(SystemColor.scrollbar));
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(7, 110, 290, 70);
		panel_2.add(panel);
		panel.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(null);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(32, 23, 96, 23);
		panel.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(160, 23, 96, 23);
		panel.add(rdbtnFemenino);
		
		botones.add(rdbtnMasculino);
		botones.add(rdbtnFemenino);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(8, 17, 122, 14);
		panel_2.add(lblFechaDeNacimiento);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(8, 48, 66, 20);
		panel_2.add(spinner);
		spinner.setModel(new SpinnerDateModel(new Date(1585195200000L), new Date(-2201887644000L), new Date(32510952000000L), Calendar.DAY_OF_YEAR));
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Tel.:");
		lblNewJgoodiesLabel.setBounds(174, 221, 86, 14);
		panel_2.add(lblNewJgoodiesLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 252, 123, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(8, 221, 86, 14);
		panel_2.add(lblEspecialidad);
		
		textField = new JTextField();
		textField.setBounds(8, 252, 123, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("ID:");
		label_4.setBounds(517, 31, 46, 14);
		panel_3.add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(564, 28, 86, 20);
		panel_3.add(textField_6);
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("Registrar");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancelar");
				buttonPane.add(cancelButton);
			}
		}
	}
}
