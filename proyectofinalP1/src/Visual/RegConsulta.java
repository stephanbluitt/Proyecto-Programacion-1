package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegConsulta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private ButtonGroup botones= new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegConsulta dialog = new RegConsulta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegConsulta() {
		setModal(true);
		setResizable(false);
		setTitle("Consulta");
		setBounds(100, 100, 502, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 476, 216);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JList list = new JList();
			list.setBounds(92, 44, 1, 1);
			panel.add(list);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new LineBorder(new Color(200, 200, 200), 2, true));
				panel_1.setBounds(17, 34, 212, 153);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblDctor = new JLabel("Doctor:");
					lblDctor.setBounds(10, 21, 46, 17);
					panel_1.add(lblDctor);
				}
				
				JLabel lblPaciente = new JLabel("Paciente:");
				lblPaciente.setBounds(10, 70, 62, 14);
				panel_1.add(lblPaciente);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(88, 19, 96, 20);
				panel_1.add(comboBox);
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setBounds(88, 67, 96, 20);
				panel_1.add(comboBox_1);
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
				{
					JLabel lblFecha = new JLabel("Fecha:");
					lblFecha.setBounds(10, 118, 46, 14);
					panel_1.add(lblFecha);
				}
				{
					JSpinner spinner = new JSpinner();
					spinner.setBounds(88, 115, 96, 20);
					panel_1.add(spinner);
					spinner.setModel(new SpinnerDateModel(new Date(1585281600000L), new Date(-2201628444000L), new Date(32510952000000L), Calendar.DAY_OF_YEAR));
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new LineBorder(new Color(200, 200, 200), 2, true));
				panel_1.setBounds(246, 34, 212, 153);
				panel.add(panel_1);
				{
					JLabel lblDiagn = new JLabel("Diagn\u00F3stico:");
					lblDiagn.setBounds(10, 22, 86, 14);
					panel_1.add(lblDiagn);
				}
				{
					textField = new JTextField();
					textField.setBounds(86, 19, 116, 20);
					panel_1.add(textField);
					textField.setColumns(10);
				}
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBorder(new TitledBorder(null, "Agregar consulta al historial", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_2.setBounds(10, 63, 192, 67);
					panel_1.add(panel_2);
					panel_2.setLayout(null);
					{
						JRadioButton rdbtnSi = new JRadioButton("Si");
						rdbtnSi.setBounds(23, 23, 61, 23);
						panel_2.add(rdbtnSi);
						botones.add(rdbtnSi);
					}
					{
						JRadioButton rdbtnNo = new JRadioButton("No");
						rdbtnNo.setBounds(107, 23, 61, 23);
						panel_2.add(rdbtnNo);
						botones.add(rdbtnNo);
					}
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Crear");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("Crear");
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
