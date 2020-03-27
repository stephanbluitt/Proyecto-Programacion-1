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
	private JTextField txtTelDoctor;
	private JTextField txtIDDoctor;
	private JTextField txtApellidoDoctor;
	private JTextField txtEspecialidad;
	private JTextField txtNombreDoctor;
	private JTextField txtDireccionDoctor;
	private JTextField txtEmailDoctor;
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
		
		JLabel lblNombreDoctor = new JLabel("Nombre:");
		lblNombreDoctor.setBounds(10, 17, 65, 14);
		panel_1.add(lblNombreDoctor);
		
		txtNombreDoctor = new JTextField();
		txtNombreDoctor.setColumns(10);
		txtNombreDoctor.setBounds(10, 48, 290, 20);
		panel_1.add(txtNombreDoctor);
		
		JLabel lblDireccionDoctor = new JLabel("Direcci\u00F3n:");
		lblDireccionDoctor.setBounds(10, 153, 58, 14);
		panel_1.add(lblDireccionDoctor);
		
		txtDireccionDoctor = new JTextField();
		txtDireccionDoctor.setColumns(10);
		txtDireccionDoctor.setBounds(10, 184, 290, 20);
		panel_1.add(txtDireccionDoctor);
		
		JLabel lblEmailDoctor = new JLabel("E-mail:");
		lblEmailDoctor.setBounds(10, 221, 46, 14);
		panel_1.add(lblEmailDoctor);
		
		txtEmailDoctor = new JTextField();
		txtEmailDoctor.setColumns(10);
		txtEmailDoctor.setBounds(10, 252, 290, 20);
		panel_1.add(txtEmailDoctor);
		
		txtApellidoDoctor = new JTextField();
		txtApellidoDoctor.setBounds(10, 116, 290, 20);
		panel_1.add(txtApellidoDoctor);
		txtApellidoDoctor.setColumns(10);
		
		JLabel lblApellidoDoctor = new JLabel("Apellido:");
		lblApellidoDoctor.setBounds(10, 85, 65, 14);
		panel_1.add(lblApellidoDoctor);
		
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
		
		JLabel lblFechaDeNacimientoDoctor = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimientoDoctor.setBounds(8, 17, 122, 14);
		panel_2.add(lblFechaDeNacimientoDoctor);
		
		JSpinner spnFNacimientoDoctor = new JSpinner();
		spnFNacimientoDoctor.setBounds(8, 48, 66, 20);
		panel_2.add(spnFNacimientoDoctor);
		spnFNacimientoDoctor.setModel(new SpinnerDateModel(new Date(1585195200000L), new Date(-2201887644000L), new Date(32510952000000L), Calendar.DAY_OF_YEAR));
		
		JLabel lblTelDoctor = DefaultComponentFactory.getInstance().createLabel("Tel.:");
		lblTelDoctor.setBounds(174, 221, 86, 14);
		panel_2.add(lblTelDoctor);
		
		txtTelDoctor = new JTextField();
		txtTelDoctor.setBounds(174, 252, 123, 20);
		panel_2.add(txtTelDoctor);
		txtTelDoctor.setColumns(10);
		
		JLabel lblEspecialidadDoctor = new JLabel("Especialidad:");
		lblEspecialidadDoctor.setBounds(8, 221, 86, 14);
		panel_2.add(lblEspecialidadDoctor);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(8, 252, 123, 20);
		panel_2.add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		JLabel lblIDDoctor = new JLabel("ID:");
		lblIDDoctor.setBounds(517, 31, 46, 14);
		panel_3.add(lblIDDoctor);
		
		txtIDDoctor = new JTextField();
		txtIDDoctor.setBounds(564, 28, 86, 20);
		panel_3.add(txtIDDoctor);
		txtIDDoctor.setEnabled(false);
		txtIDDoctor.setColumns(10);
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
