package actividad_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class actividad_4 extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField text_resp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad_4 frame = new actividad_4();
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
	public actividad_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//primer número a operar
		num1 = new JTextField();
		num1.setBounds(31, 88, 63, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		
		//segundo número a operar
		num2 = new JTextField();
		num2.setBounds(164, 88, 63, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		//text field donde se mostrará la respuesta
		text_resp = new JTextField();
		text_resp.setBounds(297, 88, 110, 20);
		contentPane.add(text_resp);
		text_resp.setColumns(10);
		
		//boton sumar
		JButton btn_sum = new JButton("+");
		btn_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Cambiamos de string a double
					double n1 = Double.parseDouble(num1.getText());
					double n2 = Double.parseDouble(num2.getText());

					// Calculamos la suma
					double result = n1+n2;

					// Pasamos el resultado al text field que contiene el resultado
					text_resp.setText(String.valueOf(result));

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inserta unos valores correctos");
					System.out.println(e1.getMessage());
				}
			}
		});
		btn_sum.setBounds(104, 53, 50, 23);
		contentPane.add(btn_sum);
		
		//boton restar
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Cambiamos de string a double
					double n1 = Double.parseDouble(num1.getText());
					double n2 = Double.parseDouble(num2.getText());

					// Calculamos la suma
					double result = n1-n2;

					// Pasamos el resultado al text field que contiene el resultado
					text_resp.setText(String.valueOf(result));

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inserta unos valores correctos");
					System.out.println(e1.getMessage());
				}
			}
		});
		btnNewButton_1.setBounds(104, 87, 50, 23);
		contentPane.add(btnNewButton_1);
		
	
		//boton multiplicar
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Cambiamos de string a double
					double n1 = Double.parseDouble(num1.getText());
					double n2 = Double.parseDouble(num2.getText());

					// Calculamos la suma
					double result = n1*n2;

					// Pasamos el resultado al text field que contiene el resultado
					text_resp.setText(String.valueOf(result));

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inserta unos valores correctos");
					System.out.println(e1.getMessage());
				}
			}
		});
		btnNewButton_2.setBounds(104, 121, 50, 23);
		contentPane.add(btnNewButton_2);
		
		
		//boton dividir
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Cambiamos de string a double
					double n1 = Double.parseDouble(num1.getText());
					double n2 = Double.parseDouble(num2.getText());

					// Calculamos la suma
					double result = n1/n2;

					// Pasamos el resultado al text field que contiene el resultado
					text_resp.setText(String.valueOf(result));

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inserta unos valores correctos");
					System.out.println(e1.getMessage());
				}
			}
		});
		btnNewButton_3.setBounds(104, 155, 50, 23);
		contentPane.add(btnNewButton_3);
		
		//boton para salir
		JButton btn_salir = new JButton("Salir");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Gracias por su asistencia!");
				System.exit(0);
			}
		});
		btn_salir.setBounds(318, 227, 89, 23);
		contentPane.add(btn_salir);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setBounds(258, 91, 23, 14);
		contentPane.add(lblNewLabel);
	}
}
