package view;

import javax.swing.*;
import java.awt.*;


public class librarianLoginView extends JFrame {
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton  btnLogin;
    private JButton  btnBack;

    public librarianLoginView() {
        initialize();
    }


    private void initialize() {
        setBounds(650, 300, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblLibrarianLoginForm = new JLabel("Librarian Login Form");
        lblLibrarianLoginForm.setForeground(Color.GRAY);
        lblLibrarianLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 31));

        JLabel lblEnterName = new JLabel("Enter Name :");
        lblEnterName.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEnterPasword = new JLabel("Enter Password :");
        lblEnterPasword.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblNewLabel = new JLabel("");
        Image img1=new ImageIcon(this.getClass().getResource("/img/login1.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img1));

        nameTextField = new JTextField();
        nameTextField.setColumns(10);

        btnLogin = new JButton("Login");

        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));

        passwordField = new JPasswordField();

        btnBack = new JButton("Back");

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblEnterPasword)
                                                        .addComponent(lblEnterName))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordField)
                                                        .addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(84)
                                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblLibrarianLoginForm, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)))
                                .addGap(26))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(552, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(40))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(31)
                                                .addComponent(lblLibrarianLoginForm, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                .addGap(50)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblEnterName)
                                                        .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(64)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblEnterPasword))
                                                .addGap(59)
                                                .addComponent(btnLogin))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(53)
                                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
        );
        getContentPane().setLayout(groupLayout);
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }
}
