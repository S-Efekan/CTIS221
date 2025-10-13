import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1 frame = new Q1();
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
	public Q1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 6, 579, 332);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNameLabel = new JLabel("NAME:");
		lblNameLabel.setBounds(6, 54, 78, 16);
		panel.add(lblNameLabel);
		
		JLabel lblSurnameLabel = new JLabel("SURNAME:");
		lblSurnameLabel.setBounds(6, 84, 78, 16);
		panel.add(lblSurnameLabel);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(96, 54, 168, 26);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(96, 84, 168, 26);
		panel.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		JLabel lblCampusLabel = new JLabel("Campus Access Status:");
		lblCampusLabel.setBounds(6, 139, 154, 16);
		panel.add(lblCampusLabel);
		
		JRadioButton rdbtnAllowed = new JRadioButton("Allowed");
		buttonGroup.add(rdbtnAllowed);
		rdbtnAllowed.setBounds(172, 135, 92, 23);
		panel.add(rdbtnAllowed);
		
		JRadioButton rdbtnNotAllowed = new JRadioButton("Not Allowed");
		buttonGroup.add(rdbtnNotAllowed);
		rdbtnNotAllowed.setBounds(352, 135, 109, 23);
		panel.add(rdbtnNotAllowed);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 167, 567, 159);
		panel.add(textArea);
		
		JButton btnSubmitButton = new JButton("SUBMIT");
		btnSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String string = new String();
				
				string = "STUDENT INFORMATION\n******************\n";
				
				string = string + textFieldName.getText() + " " + textFieldSurname.getText() + " ";
				
				if(rdbtnAllowed.isSelected()) {
					string = string + "is Allowed :)";
				}
				else if (rdbtnNotAllowed.isSelected()) {
					string = string + "is NOT Allowed!";
				}
				else {
					string = string + "must kill himself!";
				}
				
				
				textArea.setText(string);
				
			}
		});
		btnSubmitButton.setBounds(352, 54, 154, 56);
		panel.add(btnSubmitButton);
		

	}
}
