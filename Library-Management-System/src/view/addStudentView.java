package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addStudentView extends JFrame {

    private JTextField nameTextField;
    private JTextField emailTextField;
    private JTextField contactNumberTextField;
    private JButton  backBtn;
    private JButton  btnAddStudent;

    public addStudentView() {
        initialize();
    }


    private void initialize() {

        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
        setBounds(100, 100, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblAddNewStudent = new JLabel("Add New Student");
        lblAddNewStudent.setForeground(Color.GRAY);
        lblAddNewStudent.setFont(new Font("Tahoma", Font.PLAIN, 28));

        JLabel lblName = new JLabel("Name :");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblContactNumber = new JLabel("Contact Number :");
        lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));

        nameTextField = new JTextField();
        nameTextField.setColumns(10);


        emailTextField = new JTextField();
        emailTextField.setColumns(10);

        contactNumberTextField = new JTextField();
        contactNumberTextField.setColumns(10);

        btnAddStudent = new JButton("Add Student");
        btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));


        backBtn = new JButton("Back");

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(189)
                                                .addComponent(lblAddNewStudent))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(73)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblName)
                                                        .addComponent(lblEmail)
                                                        .addComponent(lblContactNumber))
                                                .addGap(33)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(contactNumberTextField)
                                                        .addComponent(emailTextField)
                                                        .addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(234)
                                                .addComponent(btnAddStudent)))
                                .addContainerGap(137, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(513, Short.MAX_VALUE)
                                .addComponent(backBtn)
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblAddNewStudent)
                                .addGap(36)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(lblName)
                                                .addGap(33)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblEmail)
                                                        .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContactNumber)
                                        .addComponent(contactNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(39)
                                .addComponent(btnAddStudent)
                                .addGap(18)
                                .addComponent(backBtn)
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


    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    public JTextField getContactNumberTextField() {
        return contactNumberTextField;
    }

    public void setContactNumberTextField(JTextField contactNumberTextField) {
        this.contactNumberTextField = contactNumberTextField;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

    public void setBackBtn(JButton backBtn) {
        this.backBtn = backBtn;
    }

    public JButton getBtnAddStudent() {
        return btnAddStudent;
    }

    public void setBtnAddStudent(JButton btnAddStudent) {
        this.btnAddStudent = btnAddStudent;
    }
}
