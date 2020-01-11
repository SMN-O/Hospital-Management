package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controller.Patient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author Simon Yates
 */
public class Register implements ActionListener{
    
    JFrame window = new JFrame("Sign Up Form");
    JTextField userNameTextField = new JTextField();
    JTextField surnameTextField = new JTextField();    
    JPasswordField passwordTextField = new JPasswordField();
    JTextField emailTextField = new JTextField();
    JTextField phoneTextField = new JTextField();
    JTextField addressTextField = new JTextField();
    JTextField postcodeTextField = new JTextField();
    JTextField genderTextField = new JTextField();
    JTextField ageTextField = new JTextField();
    JTextField accountTextField = new JTextField();

 


    JLabel userNameLabel = new JLabel("First Name");
    JLabel surnameLabel = new JLabel("Surname");    
    JLabel passwordLabel = new JLabel("Password");
    JLabel emailLabel = new JLabel("Email");
    JLabel phoneLabel = new JLabel("Phone");
    JLabel addressLabel = new JLabel("Address");
    JLabel postcodeLabel = new JLabel("PostCode");
    JLabel genderLabel = new JLabel("Male/Female");
    JLabel ageLabel = new JLabel("Age");
    JLabel accountLabel = new JLabel("Patient/Admin/Doctor/Secretary");


    
    JButton signUpButton = new JButton("Submit");
    JLabel blank = new JLabel();
    FileWriter fileWriter;
    
    Register()
    {
        GridLayout gl = new GridLayout();
        gl.setColumns(4);
        gl.setRows(4);
        
        window.setLayout(gl);
        signUpButton.addActionListener(this);
       
        
        window.add(userNameLabel);
        window.add(userNameTextField);
        
        window.add(surnameLabel);
        window.add(surnameTextField);

        window.add(passwordLabel);
        window.add(passwordTextField);

        window.add(emailLabel);
        window.add(emailTextField);

        window.add(phoneLabel);
        window.add(phoneTextField);

        window.add(addressLabel);
        window.add(addressTextField);
        
        window.add(postcodeLabel);
        window.add(postcodeTextField);
        
        window.add(genderLabel);
        window.add(genderTextField); 
        
        window.add(ageLabel);
        window.add(ageTextField);
        
        window.add(accountLabel);
        window.add(accountTextField);
                
        window.add(blank);
        window.add(signUpButton);
        
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void jsonConvert(ActionEvent ae) {
        String uniqueID = UUID.randomUUID().toString();
        String userID = accountTextField.getText() + uniqueID;

        String json = ("{"+"id:" + accountTextField.getText() + uniqueID  + "," + "firstname:" + userNameTextField.getText() + "," + "surname:" + surnameTextField.getText() + "," +
                            "passwords:" + passwordTextField.getText() + "," + "email:" + emailTextField.getText() + "," + "address:" + addressTextField.getText() + "," + "postcode:" + postcodeTextField.getText() + ","+
                            "phone:" + phoneTextField.getText() + "," + "gender:" + genderTextField.getText() + "," + "age:" + ageTextField.getText() + "}}");
        
                Gson gson = new Gson();
               Patient patients= gson.fromJson(json, Patient.class);
               
                
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String uniqueID = UUID.randomUUID().toString();
        
        

    
        
        if(ae.getActionCommand()==signUpButton.getActionCommand())
        {
            
            try
            {
                fileWriter  = new FileWriter("Accounts.txt",true);

                String userID = accountTextField.getText() + uniqueID;
                
                String json = ("{"+"id:" + accountTextField.getText() + uniqueID  + "," + "firstname:" + userNameTextField.getText() + "," + "surname:" + surnameTextField.getText() + "," +
                            "passwords:" + passwordTextField.getText() + "," + "email:" + emailTextField.getText() + "," + "address:" + addressTextField.getText() + "," + "postcode:" + postcodeTextField.getText() + ","+
                            "phone:" + phoneTextField.getText() + "," + "gender:" + genderTextField.getText() + "," + "age:" + ageTextField.getText() + "}}");

                fileWriter.write("{"+"id:" + accountTextField.getText() + uniqueID  + ",");
                fileWriter.write("firstname:" + userNameTextField.getText() + ",");
                fileWriter.write("surname:" + surnameTextField.getText() + ",");
                fileWriter.write("passwords:" + passwordTextField.getText() + ",");
                fileWriter.write("email:" + emailTextField.getText() + ",");
                fileWriter.write("address:" + addressTextField.getText() + ",");
                fileWriter.write("postcode:" + postcodeTextField.getText() + ",");
                fileWriter.write("phone:" + phoneTextField.getText() + ",");
                fileWriter.write("gender:" + genderTextField.getText() + ",");
                fileWriter.write("age:" + ageTextField.getText() + "}");

                
                
                fileWriter.write("\n");
                
                
                
                

                
                fileWriter.close();
                
                JOptionPane.showMessageDialog(null, "Account Created" + "\n" + "Your ID" + "\n" + userID + "\n" + "Your Email" + "\n" + emailTextField.getText()
                        + "\n" + "Your Password" + "\n" + passwordTextField.getText());
                
            }catch(IOException e){JOptionPane.showMessageDialog(null, e+"");}
        }
        
    
    }



    
}
