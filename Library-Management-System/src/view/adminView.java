package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminView extends JFrame{


    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnBack;
    private JButton btnLogin;





    public adminView() {
        initialize();
    }


    private void initialize() {

        setBounds(100, 100, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblEnter = new JLabel("Enter Name :");
        lblEnter.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblAdminLoginFrom = new JLabel("Admin Login Form");
        lblAdminLoginFrom.setForeground(Color.GRAY);
        lblAdminLoginFrom.setFont(new Font("Tahoma", Font.PLAIN, 28));

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lblEnterPassword = new JLabel("Enter Password :");
        lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));

        passwordField = new JPasswordField();

        JLabel lblNewLabel = new JLabel("New label");
        Image img3 = new ImageIcon(this.getClass().getResource("/img/login.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img3));

        btnLogin = new JButton("Login");

        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnBack = new JButton("Back");

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(groupLayout.createSequentialGroup()
                                                        .addGap(44)
                                                        .addComponent(lblAdminLoginFrom))
                                                .addGroup(groupLayout.createSequentialGroup()
                                                        .addGap(104)
                                                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(groupLayout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(groupLayout.createSequentialGroup()
                                                                        .addComponent(lblEnterPassword)
                                                                        .addGap(39)
                                                                        .addComponent(passwordField))
                                                                .addGroup(groupLayout.createSequentialGroup()
                                                                        .addComponent(lblEnter)
                                                                        .addGap(68)
                                                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBack)))
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(41)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(lblAdminLoginFrom)
                                                .addGap(53)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblEnter)
                                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(55)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblEnterPassword)
                                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                                .addComponent(btnLogin)
                                                .addGap(29)
                                                .addComponent(btnBack)))
                                .addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }
}
