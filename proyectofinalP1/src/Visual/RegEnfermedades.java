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
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class RegEnfermedades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreEnfermedad;
	private JTextField txtSintomasEnfermedad;
	private JTextField txtDescripcionEnfermedad;
	private JTextField txtEstadoEnfermedad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegEnfermedades dialog = new RegEnfermedades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegEnfermedades() {
		setModal(true);
		setResizable(false);
		setTitle("Registrar Enfermedad");
		setBounds(100, 100, 450, 284);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 414, 188);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNombreEnfermedad = new JLabel("Nombre:");
				lblNombreEnfermedad.setBounds(10, 26, 73, 14);
				panel.add(lblNombreEnfermedad);
			}
			{
				JLabel lblSintomasEnfermedad = new JLabel("S\u00EDntomas:");
				lblSintomasEnfermedad.setBounds(10, 66, 73, 14);
				panel.add(lblSintomasEnfermedad);
			}
			{
				JLabel lblDescripcionEnfermedad = new JLabel("Descripci\u00F3n:");
				lblDescripcionEnfermedad.setBounds(10, 146, 83, 14);
				panel.add(lblDescripcionEnfermedad);
			}
			{
				JLabel lblEstadoEnfermedad = new JLabel("Estado:");
				lblEstadoEnfermedad.setBounds(10, 106, 46, 14);
				panel.add(lblEstadoEnfermedad);
			}
			{
				txtNombreEnfermedad = new JTextField();
				txtNombreEnfermedad.setBounds(88, 23, 316, 20);
				panel.add(txtNombreEnfermedad);
				txtNombreEnfermedad.setColumns(10);
			}
			{
				txtSintomasEnfermedad = new JTextField();
				txtSintomasEnfermedad.setBounds(88, 63, 316, 20);
				panel.add(txtSintomasEnfermedad);
				txtSintomasEnfermedad.setColumns(10);
			}
			{
				txtDescripcionEnfermedad = new JTextField();
				txtDescripcionEnfermedad.setBounds(88, 143, 316, 20);
				panel.add(txtDescripcionEnfermedad);
				txtDescripcionEnfermedad.setColumns(20);
			}
			{
				txtEstadoEnfermedad = new JTextField();
				txtEstadoEnfermedad.setBounds(88, 103, 86, 20);
				panel.add(txtEstadoEnfermedad);
				txtEstadoEnfermedad.setColumns(10);
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
