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
	private JTextField txtIDPaciente;
	private JTextField txtApellidoPaciente;
	private JTextField txtNombrePaciente;
	private JTextField txtDireccionPaciente;
	private JTextField txtOcupacionPaciente;
	private JTextField txtEmailPaciente;
	private JTextField txtTelPaciente;
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
				JLabel lblIDPaciente = new JLabel("ID:");
				lblIDPaciente.setBounds(582, 25, 46, 14);
				panel.add(lblIDPaciente);
			}
			{
				txtIDPaciente = new JTextField();
				txtIDPaciente.setBounds(608, 23, 86, 17);
				panel.add(txtIDPaciente);
				txtIDPaciente.setColumns(10);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new LineBorder(SystemColor.scrollbar));
				panel_1.setBounds(27, 58, 319, 182);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblNombrePaciente = new JLabel("Nombre:");
					lblNombrePaciente.setBounds(10, 25, 63, 14);
					panel_1.add(lblNombrePaciente);
				}
				{
					JLabel lblApellidoPaciente = new JLabel("Apellido:");
					lblApellidoPaciente.setBounds(10, 64, 63, 14);
					panel_1.add(lblApellidoPaciente);
				}
				{
					txtNombrePaciente = new JTextField();
					txtNombrePaciente.setBounds(61, 22, 248, 20);
					panel_1.add(txtNombrePaciente);
					txtNombrePaciente.setColumns(10);
				}
				{
					JLabel lblFechaNacimientoPaciente = new JLabel("Fecha Nacimiento:");
					lblFechaNacimientoPaciente.setBounds(10, 103, 133, 14);
					panel_1.add(lblFechaNacimientoPaciente);
				}
				{
					JLabel lblDireccionPaciente = new JLabel("Direcci\u00F3n:");
					lblDireccionPaciente.setBounds(10, 142, 78, 14);
					panel_1.add(lblDireccionPaciente);
				}
				{
					txtApellidoPaciente = new JTextField();
					txtApellidoPaciente.setBounds(61, 61, 248, 20);
					panel_1.add(txtApellidoPaciente);
					txtApellidoPaciente.setColumns(10);
				}
				{
					txtDireccionPaciente = new JTextField();
					txtDireccionPaciente.setBounds(61, 139, 248, 20);
					panel_1.add(txtDireccionPaciente);
					txtDireccionPaciente.setColumns(10);
				}
				
				JSpinner spnFechaNacimientoPaciente = new JSpinner();
				spnFechaNacimientoPaciente.setModel(new SpinnerDateModel(new Date(1585281600000L), new Date(-939326400000L), new Date(1585281600000L), Calendar.DAY_OF_YEAR));
				spnFechaNacimientoPaciente.setBounds(137, 100, 68, 20);
				panel_1.add(spnFechaNacimientoPaciente);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(SystemColor.scrollbar));
			panel_1.setBounds(375, 58, 319, 182);
			panel.add(panel_1);
			panel_1.setLayout(null);
			{
				txtOcupacionPaciente = new JTextField();
				txtOcupacionPaciente.setBounds(84, 81, 81, 20);
				panel_1.add(txtOcupacionPaciente);
				txtOcupacionPaciente.setColumns(10);
			}
			{
				JLabel lblOcupacin = new JLabel("Ocupaci\u00F3n: ");
				lblOcupacin.setBounds(10, 84, 86, 14);
				panel_1.add(lblOcupacin);
			}
			{
				txtEmailPaciente = new JTextField();
				txtEmailPaciente.setBounds(57, 130, 248, 20);
				panel_1.add(txtEmailPaciente);
				txtEmailPaciente.setColumns(10);
			}
			{
				JLabel lblEmailPaciente = new JLabel("E-mail:");
				lblEmailPaciente.setBounds(10, 133, 63, 14);
				panel_1.add(lblEmailPaciente);
			}
			{
				JLabel lblTel = new JLabel("Tel.:");
				lblTel.setBounds(10, 35, 46, 14);
				panel_1.add(lblTel);
			}
			{
				txtTelPaciente = new JTextField();
				txtTelPaciente.setBounds(57, 32, 108, 20);
				panel_1.add(txtTelPaciente);
				txtTelPaciente.setColumns(10);
			}
			{
				JPanel panel_2 = new JPanel();
				panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
				panel_2.setBounds(175, 32, 134, 69);
				panel_1.add(panel_2);
				panel_2.setLayout(null);
				{
					JRadioButton rdbtnMasculinoPaciente = new JRadioButton("Masculino");
					rdbtnMasculinoPaciente.setBounds(16, 13, 93, 23);
					panel_2.add(rdbtnMasculinoPaciente);
					botones.add(rdbtnMasculinoPaciente);
				}
				{
					JRadioButton rdbtnFemeninoPaciente = new JRadioButton("Femenino");
					rdbtnFemeninoPaciente.setBounds(16, 39, 93, 23);
					panel_2.add(rdbtnFemeninoPaciente);
					botones.add(rdbtnFemeninoPaciente);

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
