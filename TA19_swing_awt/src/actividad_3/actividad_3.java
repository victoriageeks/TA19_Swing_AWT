package actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class actividad_3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad_3 frame = new actividad_3();
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
	public actividad_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo:");
		lblNewLabel.setBounds(34, 43, 171, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtn_o1 = new JRadioButton("Windows");
		rdbtn_o1.setBounds(34, 64, 122, 23);
		contentPane.add(rdbtn_o1);
		rdbtn_o1.setActionCommand("Windows");
		
		JRadioButton rdbtn_o2 = new JRadioButton("Linux");
		rdbtn_o2.setBounds(34, 90, 122, 23);
		contentPane.add(rdbtn_o2);
		rdbtn_o2.setActionCommand("Linux");
		
		JRadioButton rdbtn_o3 = new JRadioButton("Mac");
		rdbtn_o3.setBounds(34, 116, 122, 23);
		contentPane.add(rdbtn_o3);
		rdbtn_o3.setActionCommand("Mac");
		
		JLabel lbl_especialidad = new JLabel("Elije tu especialidad:");
		lbl_especialidad.setBounds(215, 43, 178, 14);
		contentPane.add(lbl_especialidad);
		
		JCheckBox chckbx_1 = new JCheckBox("Programación");
		chckbx_1.setBounds(215, 64, 148, 23);
		contentPane.add(chckbx_1);
		
		JCheckBox chckbx_2= new JCheckBox("Diseño gráfico");
		chckbx_2.setBounds(215, 90, 148, 23);
		contentPane.add(chckbx_2);
		
		JCheckBox chckbx_3= new JCheckBox("Administración");
		chckbx_3.setBounds(215, 116, 148, 23);
		contentPane.add(chckbx_3);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas al ordenador:");
		lblNewLabel_2.setBounds(34, 176, 148, 14);
		contentPane.add(lblNewLabel_2);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(34, 201, 157, 14);
		contentPane.add(slider);
		
		ButtonGroup btngrp = new ButtonGroup();
		btngrp.add(rdbtn_o1);
		btngrp.add(rdbtn_o2);
		btngrp.add(rdbtn_o3);
		
		JButton btnNewButton = new JButton("Mostrar resultados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				String sysop = btngrp.getSelection().getActionCommand();;
				int tiempo_pc = slider.getValue();
				
				String e1="";
				String e2="";
				String e3="";
				
				if(chckbx_1.isSelected() == true) {
					 e1 = chckbx_1.getText();
				}
				if(chckbx_2.isSelected() == true) {
					 e2 = chckbx_2.getText();
				}
				if(chckbx_3.isSelected() == true) {
					 e3 = chckbx_3.getText();
				}
				JOptionPane.showMessageDialog(null, "El sistema operativo que escogiste es: "+sysop+"\nEl número de horas que has estado con el ordenador es de: "+tiempo_pc+"\ny las especialidades son: "+e1+" "+e2+" "+e3);
			}
		});
		btnNewButton.setBounds(215, 186, 148, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
