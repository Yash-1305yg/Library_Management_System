package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//runnable interface
//multiple threading class ke throw allowed nhi hai lekin interface ke throw hai
public class Loading extends JFrame implements Runnable{
    
    private JPanel contentPane;
    private JProgressBar progressBar;
    Connection conn;
    int s;
    Thread th;
    public static void main(String[] args){
        new Loading().setVisible(true);
    }
    public void setUploading(){
        //satrt method apne app run funtion ko bula raha hai
        th.start();
    }
    public void run(){
        try{
           for(int i=0;i<200;i++){
               s=s+1;
               int m=progressBar.getMaximum();
               int v=progressBar.getValue();
               if(v<m){
                   progressBar.setValue(progressBar.getValue()+1);
               }
               else{
                   i=201;
                   setVisible(false);
                   new Home().setVisible(true);
               }
               Thread.sleep(50);
           } 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Loading() {
        super("Loading");
        th=new Thread((Runnable) this);
        
        setBounds(600, 300, 600, 400);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lb1libraryManagement=new JLabel("Welcome to Smart Library ");
        lb1libraryManagement.setForeground(new Color(72,209,204));
        lb1libraryManagement.setFont(new Font("Trebuchet MS",Font.BOLD,35));
        lb1libraryManagement.setBounds(70,46,700,35);
        contentPane.add(lb1libraryManagement);
        
        progressBar=new JProgressBar();
        progressBar.setFont(new Font("Tahoma",Font.BOLD,12));
        progressBar.setStringPainted(true);
        progressBar.setBounds(130,135,300,25);
        contentPane.add(progressBar);
        
        JLabel lb1NewLabel=new JLabel("Please Wait....");
        lb1NewLabel.setFont(new Font("Yu Gothic UI Semibold",Font.BOLD,20));
        lb1NewLabel.setBackground(new Color(160,82,45));
        lb1NewLabel.setBounds(200,165,150,20);
        contentPane.add(lb1NewLabel);
        
        JPanel panel=new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0,0,590,390);
        contentPane.add(panel);
        
        setUploading();
        
    }

    
    
}
