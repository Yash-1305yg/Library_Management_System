package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;

class AddBook extends JFrame implements ActionListener {
    
    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6,t7;
    private JButton b1,b2;
    JComboBox comboBox;
    
    public static void main(String[] args){
        new AddBook().setVisible(true);
    }
    public void random(){
        Random rd=new Random();
        t1.setText("" + rd.nextInt(1000+1));
    }
    public AddBook() {
        setBounds(600, 200, 518, 442);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Name");
	l1.setForeground(new Color(47, 79, 79));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(73, 84, 90, 22);
	contentPane.add(l1);

	JLabel l2 = new JLabel("ISBN");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(73, 117, 90, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Publisher");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(73, 150, 90, 22);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Price");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(73, 216, 90, 22);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Pages");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(73, 249, 90, 22);
	contentPane.add(l5);
        
        JLabel l18= new JLabel("Book Count");
	l18.setForeground(new Color(47, 79, 79));
	l18.setFont(new Font("Tahoma", Font.BOLD, 14));
	l18.setBounds(73, 282, 90, 22);
	contentPane.add(l18);
        

	JLabel l6 = new JLabel("Book_id");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(73, 51, 90, 22);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Edition");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(73, 183, 90, 22);
	contentPane.add(l7);

	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(169, 54, 198, 20);
        t1.setEditable(false);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(169, 87, 198, 20);
	contentPane.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(169, 120, 198, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(169, 153, 198, 20);
	contentPane.add(t4);

        t5 = new JTextField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(169, 219, 198, 20);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(169, 252, 198, 20);
	contentPane.add(t6);
        
        t7 = new JTextField();
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(169, 284, 198, 20);
	contentPane.add(t7);
        

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
	comboBox.setBounds(173, 186, 194, 20);
	contentPane.add(comboBox);
        
        b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(102, 320, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);
        
        

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(212, 320, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);
        
        JPanel panel=new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Books", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(0, 0, 255)));
	panel.setBounds(10, 29, 398, 344);
	contentPane.add(panel);
        
        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
	random();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
         try{
            conn con = new conn();
            if(e.getSource() == b1){
                String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages, count) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
                if(t1.getText().isEmpty() || t1.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Fill all the required details");
                    st.close();
                    return;
                }
                
                if(t2.getText().isEmpty() || t2.getText().trim().isEmpty()){
                    t2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Fill all the required details");
                    st.close();
                     return;
                }
                else{
                    if(!isNameValid(t2.getText().trim())){
                         t2.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "Name is Invalid");
                        st.close();
                        return;
                    }
                    else t2.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                
                //ISBN textfield check
                if(t3.getText().isEmpty() || t3.getText().trim().isEmpty()){
                    t3.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Fill all the required details");
                    st.close();
                     return;
                }
                else{
                    if(!isISBNvalid(t3.getText().trim())){
                        t3.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "ISBN is Invalid");
                        st.close();
                        return;
                    }
                    else t3.setBorder(BorderFactory.createLineBorder(Color.black));
                }
                
                //Publisher Check
                if(t4.getText().isEmpty() || t4.getText().trim().isEmpty()){
                    t4.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Fill all the required details");
                    st.close();
                     return;
                }
                else{
                    if(!isNameValid(t4.getText().trim())){
                         t4.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "Publisher Name is Invalid");
                        st.close();
                        return;
                    }
                    else t4.setBorder(BorderFactory.createLineBorder(Color.black));
                    
                }
                
                //Price Field Check
                if(t5.getText().isEmpty() || t5.getText().trim().isEmpty()){
                    t5.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Fill all the required details");
                    st.close();
                     return;
                }
                else {
                    if(!isPriceValid(t5.getText().trim())){
                        t5.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "Price is Invalid");
                         st.close();
                        return;
                    }
                    else {
                        t5.setBorder(BorderFactory.createLineBorder(Color.black));
                    }
                }
                
                //Pages Field Check
                if(t6.getText().isEmpty() || t6.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Fill all the required details");
                    st.close();
                     return;
                }
                else{
                     if(!isPagesValid(t6.getText().trim())){
                        t6.setBorder(BorderFactory.createLineBorder(Color.red));
                        JOptionPane.showMessageDialog(null, "Pages is Invalid");
                        st.close();
                        return;
                    }
                    else {
                        t6.setBorder(BorderFactory.createLineBorder(Color.black));
                    } 
                }
                
                if(t7.getText().isEmpty() || t7.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter Count");
                    st.close();
                     return;
                }
               
		st.setString(1, t1.getText().trim());
		st.setString(2, t2.getText().trim());
		st.setString(3, t3.getText().trim());
		st.setString(4, t4.getText().trim());
		st.setString(5, (String) comboBox.getSelectedItem());
		st.setString(6, t5.getText().trim());
		st.setString(7, t6.getText().trim());
                st.setString(8, t7.getText().trim());

		int rs = st.executeUpdate();
		if (rs > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    random();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error");
                    }
                
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                comboBox.setSelectedIndex(0);;
		st.close();
            }
            if(e.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);

            }
            con.c.close();
        }catch(Exception ee){
            
        }
    }
    
    public boolean isISBNvalid(String str){
        int len = 0;
        for(int i=0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == 'X'){
                len++;
            }
            else return false;
        }
        if(len == 10 || len == 13){
            return true;
        }
        return false;
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
    
    public boolean isPriceValid(String str){
        int len = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                len+=1;
            }
            else return false;
        }
        if(len > 10){
            return false;
        }
        return true;
    }
    
    public boolean isPagesValid(String str){
        int len = 0;
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        if(Integer.parseInt(str) == 0){
            return false;
        }
        if(Integer.parseInt(str) > 25000){
            return false;
        }
        return true;
    }        
}
