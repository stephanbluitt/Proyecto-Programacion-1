package Visual;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dimention;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Clinica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 342);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_2 = new JMenu("Doctores");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mntmRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegDoctor doctor = new RegDoctor();
				doctor.setModal(true);
				doctor.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmRegistrar);
		
		JMenu mnNewMenu = new JMenu("Pacientes");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRegistrar_1 = new JMenuItem("Registrar");
		mntmRegistrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegPaciente paciente = new RegPaciente();
				paciente.setModal(true);
				paciente.setVisible(true);
			}
		});
		mnNewMenu.add(mntmRegistrar_1);
		
		JMenu mnNewMenu_1 = new JMenu("Consulta");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mntmCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegConsulta consulta = new RegConsulta();
				consulta.setModal(true);
				consulta.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmCrear);
		
		JMenu mnNewMenu_3 = new JMenu("Control de Enfermedades");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmAadir = new JMenuItem("A\u00F1adir");
		mntmAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegEnfermedades enfermedades = new RegEnfermedades();
				enfermedades.setModal(true);
				enfermedades.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmAadir);
		
		JMenuItem mntmBajoVigilancia = new JMenuItem("Bajo Vigilancia");
		mnNewMenu_3.add(mntmBajoVigilancia);
		
		JMenu mnControlVacunas = new JMenu("Control Vacunas");
		menuBar.add(mnControlVacunas);
		
		JMenuItem mntmVacunas_1 = new JMenuItem("Vacunas");
		mnControlVacunas.add(mntmVacunas_1);
		
		JMenuItem mntmPcientesVacunados = new JMenuItem("Pcientes Vacunados");
		mnControlVacunas.add(mntmPcientesVacunados);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		dimention = super.getToolkit().getScreenSize();
		super.setSize(dimention.width, (dimention.height-50));
		setLocationRelativeTo(null);
	}
}
