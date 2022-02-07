package library.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class readme extends JFrame implements ActionListener{
        public  JButton b1;
	private JPanel contentPane;

        public static void main(String[] args) {
            new readme().setVisible(true);			
	}
    
        public readme() {
            
            super("Readme");
//            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(400, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);



            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(290, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Management System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(180, 90, 405, 40);
            contentPane.add(l4);

            JLabel l7 = new JLabel("A Library management system is a software that uses to");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 180, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("maintain the record of the library. ");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 210, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Library management system allows the librarian to");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 240, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("maintain library resources in a more operative manner that ");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.BOLD, 20));
            l10.setBounds(70, 270, 600, 34);
            contentPane.add(l10);
            
             JLabel l11 = new JLabel("will help to save their time.");
            
            l11.setFont(new Font("Trebuchet MS", Font.BOLD | Font.BOLD, 20));
            l11.setBounds(70, 300, 600, 34);
            contentPane.add(l11);
                
             b1 = new JButton("Back");
            b1.addActionListener(this);
            b1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            b1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
            b1.setBounds(465, 400, 170, 30);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            contentPane.add(b1);
            
            contentPane.setBackground(Color.WHITE);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == b1){
                this.setVisible(false);
		new Home().setVisible(true);	
            }
        }
        catch(Exception ae){
            
        }
    }
        

}