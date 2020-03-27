package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private ButtonGroup botones= new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegPaciente dialog = new RegPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPaciente() {
		setModal(true);
		setTitle("Registrar Paciente");
		setResizable(false);
		setBounds(100, 100, 751, 379);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informaci\u00F3n ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 725, 284);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("ID:");
				lblNewLabel.setBounds(582, 25, 46, 14);
				panel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				textField.setBounds(608, 23, 86, 17);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new LineBorder(SystemColor.scrollbar));
				panel_1.setBounds(27, 58, 319, 182);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblNewLabel_1 = new JLabel("Nombre:");
					lblNewLabel_1.setBounds(10, 25, 63, 14);
					panel_1.add(lblNewLabel_1);
				}
				{
					JLabel lblApellido = new JLabel("Apellido:");
					lblApellido.setBounds(10, 64, 63, 14);
					panel_1.add(lblApellido);
				}
				{
					textField_2 = new JTextField();
					textField_2.setBounds(61, 22, 248, 20);
					panel_1.add(textField_2);
					textField_2.setColumns(10);
				}
				{
					JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
					lblFechaNacimiento.setBounds(10, 103, 133, 14);
					panel_1.add(lblFechaNacimiento);
				}
				{
					JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
					lblDireccion.setBounds(10, 142, 78, 14);
					panel_1.add(lblDireccion);
				}
				{
					textField_1 = new JTextField();
					textField_1.setBounds(61, 61, 248, 20);
					panel_1.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					textField_3 = new JTextField();
					textField_3.setBounds(61, 139, 248, 20);
					panel_1.add(textField_3);
					textField_3.setColumns(10);
				}
				
				JSpinner spinner = new JSpinner();
				spinner.setModel(new SpinnerDateModel(new Date(1585281600000L), new Date(-939326400000L), new Date(1585281600000L), Calendar.DAY_OF_YEAR));
				spinner.setBounds(137, 100, 68, 20);
				panel_1.add(spinner);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(SystemColor.scrollbar));
			panel_1.setBounds(375, 58, 319, 182);
			panel.add(panel_1);
			panel_1.setLayout(null);
			{
				textField_4 = new JTextField();
				textField_4.setBounds(84, 81, 81, 20);
				panel_1.add(textField_4);
				textField_4.setColumns(10);
			}
			{
				JLabel lblOcupacin = new JLabel("Ocupaci\u00F3n: ");
				lblOcupacin.setBounds(10, 84, 86, 14);
				panel_1.add(lblOcupacin);
			}
			{
				textField_5 = new JTextField();
				textField_5.setBounds(57, 130, 248, 20);
				panel_1.add(textField_5);
				textField_5.setColumns(10);
			}
			{
				JLabel lblEmail = new JLabel("E-mail:");
				lblEmail.setBounds(10, 133, 63, 14);
				panel_1.add(lblEmail);
			}
			{
				JLabel lblTel = new JLabel("Tel.:");
				lblTel.setBounds(10, 35, 46, 14);
				panel_1.add(lblTel);
			}
			{
				textField_6 = new JTextField();
				textField_6.setBounds(57, 32, 108, 20);
				panel_1.add(textField_6);
				textField_6.setColumns(10);
			}
			{
				JPanel panel_2 = new JPanel();
				panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
				panel_2.setBounds(175, 32, 134, 69);
				panel_1.add(panel_2);
				panel_2.setLayout(null);
				{
					JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
					rdbtnMasculino.setBounds(16, 13, 93, 23);
					panel_2.add(rdbtnMasculino);
					botones.add(rdbtnMasculino);
				}
				{
					JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
					rdbtnFemenino.setBounds(16, 39, 93, 23);
					panel_2.add(rdbtnFemenino);
					botones.add(rdbtnFemenino);

				}
				
				
				
			}
		}
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
