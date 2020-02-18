import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {
	
	private static JFrame frame;

	private static JTextField userText;

	private static JPasswordField passwordText;
	private static JLabel success;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		// *** USERNAME TEXT
		JLabel userlabel = new JLabel("Username");
		userlabel.setBounds(10, 20, 80, 25);
		panel.add(userlabel);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// *** PASSWORD TEXT
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		JPasswordField passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		// *** LOGIN BUTTON
		JButton button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new Login());
		panel.add(button);
		
		// *** SUCCESS LABEL
		JLabel success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		@SuppressWarnings("deprecation")
		String password = passwordText.getText();
		
		if (user.equals("Alex") && password.equals("123")) {
			success.setText("Login Sucessful!");
		}
	}

}
