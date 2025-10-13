import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Q2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfMember;
	int[] price= {500,850,1000};
	double fee = 0;
	double disc = 0.0;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q2 frame = new Q2();
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
	public Q2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 6, 588, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGymIcon = new JLabel("");
		lblGymIcon.setIcon(new ImageIcon("/Users/efekansahin/eclipse-workspace/LG6_Q2/gymfit.png"));
		lblGymIcon.setBounds(407, 92, 151, 75);
		panel.add(lblGymIcon);
		
		JLabel lblMemberLabel = new JLabel("Member Name Surname:");
		lblMemberLabel.setBounds(6, 33, 162, 16);
		panel.add(lblMemberLabel);
		
		tfMember = new JTextField();
		tfMember.setToolTipText("");
		tfMember.setBounds(207, 28, 247, 26);
		panel.add(tfMember);
		tfMember.setColumns(10);
		
		JLabel lblGymLabel = new JLabel("Gym");
		lblGymLabel.setBounds(6, 61, 28, 16);
		panel.add(lblGymLabel);
		
		JLabel lblVIPLabel = new JLabel("VIP Cost:");
		lblVIPLabel.setBounds(180, 61, 61, 16);
		panel.add(lblVIPLabel);
		
		JLabel lblVIPCost = new JLabel("500 TL");
		lblVIPCost.setBounds(242, 61, 61, 16);
		panel.add(lblVIPCost);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 170, 576, 118);
		panel.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex() == 0) {
					lblVIPCost.setText(price[0] + " TL");
					fee = 65000;
					lblGymIcon.setIcon(new ImageIcon("/Users/efekansahin/eclipse-workspace/LG6_Q2/gymfit.png"));
				}
				else if(comboBox.getSelectedIndex()==1) {
					lblVIPCost.setText(price[1] + " TL");
					fee = 52000;
					lblGymIcon.setIcon(new ImageIcon("/Users/efekansahin/eclipse-workspace/LG6_Q2/macfit.png"));
				}
				else {
					lblVIPCost.setText(price[2] + " TL");
					fee = 75000;
					lblGymIcon.setIcon(new ImageIcon("/Users/efekansahin/eclipse-workspace/LG6_Q2/sportsINT.png"));
				}
				
			}
		
		
		
		
		
		
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GymFit", "MacFit", "Sports International"}));
		comboBox.setBounds(46, 57, 122, 27);
		panel.add(comboBox);
		
		JCheckBox chckbxVIP = new JCheckBox("VIP");
		chckbxVIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					fee = fee + 500;
				}
				else if (comboBox.getSelectedIndex() == 1) {
					fee = fee + 850;
				}
				else {
					fee = fee + 1000;
				}
				
			}
		});
		chckbxVIP.setBounds(339, 57, 61, 23);
		panel.add(chckbxVIP);
		
		JRadioButton rdbtnAcademic = new JRadioButton("Academic");
		buttonGroup.add(rdbtnAcademic);
		rdbtnAcademic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					disc = 20;
				}
				else if (comboBox.getSelectedIndex() == 1) {
					disc = 6;
				}
				else {
					disc = 58;
				}
			}
		});
		rdbtnAcademic.setBounds(6, 108, 93, 23);
		panel.add(rdbtnAcademic);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		buttonGroup.add(rdbtnStudent);
		rdbtnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					disc = 10;
				}
				else if (comboBox.getSelectedIndex() == 1) {
					disc = 3.5;
				}
				else {
					disc = 38;
				}
			}
		});
		rdbtnStudent.setBounds(148, 108, 93, 23);
		panel.add(rdbtnStudent);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		buttonGroup.add(rdbtnOther);
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					disc = 5;
				}
				else if (comboBox.getSelectedIndex() == 1) {
					disc = 1;
				}
				else {
					disc = 3;
				}
			}
		});
		rdbtnOther.setBounds(282, 108, 84, 23);
		panel.add(rdbtnOther);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string = new String();
				string = "Member Name: " + tfMember.getText() + "\nVIP: ";
				if (chckbxVIP.isSelected())
					string += "true\n";
				else
					string += "false\n";
				
			fee = fee - (fee * disc / 100);
			string += "Fee: " + fee + " TL";
				
				textArea.setText(string);
			}
		});
		btnCalculate.setBackground(SystemColor.textHighlight);
		btnCalculate.setBounds(148, 138, 117, 29);
		panel.add(btnCalculate);

	}
}
