package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class SignUp extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new SignUp().setVisible(true);
    }

    public SignUp() {
        setBounds(600, 250, 606, 406);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(99, 86, 92, 26);
	contentPane.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(99, 123, 92, 26);
	contentPane.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPassword.setBounds(99, 160, 92, 26);
	contentPane.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer.setBounds(99, 234, 92, 26);
	contentPane.add(lblAnswer);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?" }));
	comboBox.setBounds(265, 202, 148, 20);
	contentPane.add(comboBox);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(99, 197, 140, 26);
	contentPane.add(lblSecurityQuestion);

        textField = new JTextField();
	textField.setBounds(265, 91, 148, 20);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(265, 128, 148, 20);
	contentPane.add(textField_1);

        textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(265, 165, 148, 20);
	contentPane.add(textField_2);

	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(265, 239, 148, 20);
	contentPane.add(textField_3);

	b1 = new JButton("Create");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 13));
	b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 13));
	b2.setBounds(300, 289, 100, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setForeground(new Color(34, 139, 34));
	panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setBounds(31, 46, 476, 296);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                
                
                if(textField.getText().isEmpty() || textField.getText().trim().isEmpty()){
                    textField.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Username is Empty");
                    return;
                }
                else{
                    if(!isUsernamevalid(textField.getText().trim())){
                        textField.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "Username cannot contain Spaces");
                        return;
                    }          
                    else{
                        String sql = "select count(username) as rowCount from account where username = '" + textField.getText() + "'";
                        PreparedStatement ps = con.c.prepareStatement(sql);
                        ResultSet rs1 = ps.executeQuery();
                        rs1.next();
                        int count = rs1.getInt("rowCount");
                        if(count > 0){
                            JOptionPane.showMessageDialog(null, "Username already taken!!");
                            return;
                        }
                        rs1.close();
                        textField.setBorder(BorderFactory.createLineBorder(Color.black));
                    }
                }
                
                if(textField_1.getText().isEmpty() || textField_1.getText().trim().isEmpty()){
                    textField_1.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name is Empty");
                        return;
                }
                else{
                    if(!isNameValid(textField_1.getText().trim())){
                        textField_1.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "Name is Invalid");
                        return;
                    }
                    else textField_1.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                
                if(textField_2.getText().isEmpty() || textField_2.getText().trim().isEmpty()){
                    textField_2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Password is Empty");
                    return;
                }
                else{
                    if(textField_2.getText().length() < 4){
                        JOptionPane.showMessageDialog(null, "Password should be minimum 4 length");
                        return;
                    }
                }
                
                
                if(textField_3.getText().isEmpty() || textField_3.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Answer is Empty");
                    return;
                }
               
                
                
                
                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, (String) comboBox.getSelectedItem());
		st.setString(5, textField_3.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully Created");
                    this.setVisible(false);
                    new Login_user().setVisible(true);
                }

            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
    public boolean isUsernamevalid(String str){
        for(int i = 0; i< str.length(); i++){
            if(Character.isSpaceChar(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    public boolean isNameValid(String str){
        String str1 = "!@#$%^&*()?><[]::{}_-;',.``~\\|";
        for(int i=0; i < str.length(); i++){
            CharSequence ch = String.valueOf(str.charAt(i));
            if(Character.isDigit(str.charAt(i)) || str1.contains(ch)){
                return false;
            }
        }
        return true;
    }
}