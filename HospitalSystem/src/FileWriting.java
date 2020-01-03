/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Simon Yates
 */
public class FileWriting implements ActionListener{
    JFrame window = new JFrame("Sign Up Form");
    JTextField userNameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JLabel userNameLabel = new JLabel("User Name");
    JLabel passwordLabel = new JLabel("Password");
    JButton signUpButton = new JButton("Submit");
    JLabel blank = new JLabel();
    FileWriter fileWriter;
    
    FileWriting()
    {
        GridLayout gl = new GridLayout();
        gl.setColumns(2);
        gl.setRows(3);
        
        window.setLayout(gl);
        signUpButton.addActionListener(this);
       
        
        window.add(userNameLabel);
        window.add(userNameTextField);
        window.add(passwordLabel);
        window.add(passwordTextField);
        window.add(blank);
        window.add(signUpButton);
        
        window.setSize(300,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getActionCommand()==signUpButton.getActionCommand())
        {
            try
            {
                fileWriter  = new FileWriter("Patients.txt");
                fileWriter.write(userNameLabel.getText() + " : " +userNameTextField.getText());
                fileWriter.write(passwordLabel.getText() + " : " +passwordTextField.getText());
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Account Created");
                
            }catch(IOException e){JOptionPane.showMessageDialog(null, e+"");}
        }
    }


    
}
