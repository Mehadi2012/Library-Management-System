package view;

import javax.swing.*;
import java.awt.*;

public class returnBooksView extends JFrame {

    private JTextField idTextField;
    private JTextField bookCallTextField;
    private JButton btnReturn;
    private JButton btnBack;

    public returnBooksView() {
        initialize();
    }

    private void initialize() {
        setBounds(680, 300, 680, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblIssueBook = new JLabel("Issue Book");
        lblIssueBook.setForeground(Color.GRAY);
        lblIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 28));

        JLabel lblBookCallNumber = new JLabel("Book Call Number :");
        lblBookCallNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));

        bookCallTextField = new JTextField();
        bookCallTextField.setColumns(10);

        btnReturn = new JButton("Return");

        btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnBack = new JButton("Back");


        JLabel lblStudentId = new JLabel("Student ID :");
        lblStudentId.setFont(new Font("Tahoma", Font.PLAIN, 18));

        idTextField = new JTextField();
        idTextField.setColumns(10);

        JLabel lblNewLabel = new JLabel("");
        Image img7=new ImageIcon(this.getClass().getResource("/img/book1.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img7));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(225)
                                                .addComponent(lblIssueBook))
                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(groupLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(lblNewLabel)
                                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(groupLayout.createSequentialGroup()
                                                                        .addGap(18, 273, Short.MAX_VALUE)
                                                                        .addComponent(btnBack))
                                                                .addGroup(groupLayout.createSequentialGroup()
                                                                        .addGap(18)
                                                                        .addComponent(btnReturn, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
                                                        .addGap(86)
                                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(lblBookCallNumber)
                                                                .addComponent(lblStudentId))
                                                        .addGap(44)
                                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(idTextField)
                                                                .addComponent(bookCallTextField, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))))
                                .addGap(22))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIssueBook)
                                .addGap(25)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblStudentId)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblBookCallNumber)
                                        .addComponent(bookCallTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(43)
                                                .addComponent(btnReturn, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addGap(137)
                                                .addComponent(btnBack))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNewLabel)))
                                .addGap(38))
        );
        getContentPane().setLayout(groupLayout);
    }

    public JTextField getIdTextField() {
        return idTextField;
    }

    public void setIdTextField(JTextField idTextField) {
        this.idTextField = idTextField;
    }

    public JTextField getBookCallTextField() {
        return bookCallTextField;
    }

    public void setBookCallTextField(JTextField bookCallTextField) {
        this.bookCallTextField = bookCallTextField;
    }

    public JButton getBtnReturn() {
        return btnReturn;
    }

    public void setBtnReturn(JButton btnReturn) {
        this.btnReturn = btnReturn;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

}
