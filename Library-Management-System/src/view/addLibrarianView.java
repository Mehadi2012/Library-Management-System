package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addLibrarianView extends JFrame {
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JTextField emailTextField_1;
    private JTextField phoneNumTextField_2;
    private JButton btnAddLibrarian;
    private JButton btnBack;

    public addLibrarianView() {
        initialize();
    }


    private void initialize() {

        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
        setBounds(100, 100, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblAddNewLibrarian = new JLabel("Add New Librarian");
        lblAddNewLibrarian.setForeground(Color.GRAY);
        lblAddNewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 28));

        JLabel lblName = new JLabel("Name :");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblContactNumber = new JLabel("Contact Number :");
        lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));

        nameTextField = new JTextField();
        nameTextField.setColumns(10);

        passwordField = new JPasswordField();

        emailTextField_1 = new JTextField();
        emailTextField_1.setColumns(10);

        phoneNumTextField_2 = new JTextField();
        phoneNumTextField_2.setColumns(10);

        btnAddLibrarian = new JButton("Add Librarian");
        btnAddLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 18));


        btnBack = new JButton("Back");

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(189)
                                                .addComponent(lblAddNewLibrarian))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(73)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblName)
                                                        .addComponent(lblPassword)
                                                        .addComponent(lblEmail)
                                                        .addComponent(lblContactNumber))
                                                .addGap(33)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(phoneNumTextField_2)
                                                        .addComponent(emailTextField_1)
                                                        .addComponent(passwordField)
                                                        .addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(234)
                                                .addComponent(btnAddLibrarian)))
                                .addContainerGap(137, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(513, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblAddNewLibrarian)
                                .addGap(36)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(lblName)
                                                .addGap(33)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblPassword)
                                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(35)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblEmail)
                                                        .addComponent(emailTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContactNumber)
                                        .addComponent(phoneNumTextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(39)
                                .addComponent(btnAddLibrarian)
                                .addGap(18)
                                .addComponent(btnBack)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getEmailTextField_1() {
        return emailTextField_1;
    }

    public void setEmailTextField_1(JTextField emailTextField_1) {
        this.emailTextField_1 = emailTextField_1;
    }

    public JTextField getPhoneNumTextField_2() {
        return phoneNumTextField_2;
    }

    public void setPhoneNumTextField_2(JTextField phoneNumTextField_2) {
        this.phoneNumTextField_2 = phoneNumTextField_2;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }



    public JButton getBtnAddLibrarian() {
        return btnAddLibrarian;
    }

    public void setBtnAddLibrarian(JButton btnAddLibrarian) {
        this.btnAddLibrarian = btnAddLibrarian;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }
}
