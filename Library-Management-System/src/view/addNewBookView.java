package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addNewBookView extends JFrame {
    private JTextField bookNumberTextField;
    private JTextField bookNameTextField;
    private JTextField aurthorTextField;
    private JTextField publisherTextField;
    private JTextField quantityTextField;
    private JButton btnAddBook;
    private JButton btnBack;

    public addNewBookView() {
        initialize();
    }


    private void initialize() {

        setBounds(650, 325, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblAddNewBook = new JLabel("Add New Book");
        lblAddNewBook.setForeground(Color.GRAY);
        lblAddNewBook.setFont(new Font("Tahoma", Font.PLAIN, 28));

        JLabel lblBookNumber = new JLabel("Book Number :");
        lblBookNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblNewLabel = new JLabel("Name :");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));

        bookNumberTextField = new JTextField();
        bookNumberTextField.setColumns(10);

        bookNameTextField = new JTextField();
        bookNameTextField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Author :");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

        aurthorTextField = new JTextField();
        aurthorTextField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Publisher :");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblNewLabel_3 = new JLabel("Quantity :");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

        publisherTextField = new JTextField();
        publisherTextField.setColumns(10);

        quantityTextField = new JTextField();
        quantityTextField.setColumns(10);

        btnAddBook = new JButton("ADD BOOK");
        btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 18));


        btnBack = new JButton("Back ");


        JLabel lblNewLabel_4 = new JLabel("");
        Image img6=new ImageIcon(this.getClass().getResource("/img/book.png")).getImage();
        lblNewLabel_4.setIcon(new ImageIcon(img6));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(49, Short.MAX_VALUE)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(lblNewLabel_2)
                                                                .addGap(55)
                                                                .addComponent(publisherTextField))
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblBookNumber)
                                                                        .addComponent(lblNewLabel)
                                                                        .addComponent(lblNewLabel_1))
                                                                .addGap(18)
                                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(aurthorTextField)
                                                                        .addComponent(bookNameTextField)
                                                                        .addComponent(bookNumberTextField, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                                        .addComponent(lblAddNewBook, GroupLayout.Alignment.TRAILING)))
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(lblNewLabel_3)
                                                                .addGap(59)
                                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnAddBook)
                                                                        .addComponent(quantityTextField))))
                                                .addGap(36)
                                                .addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                                .addGap(34))
                                        .addComponent(btnBack))
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblAddNewBook)
                                                .addGap(29)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblBookNumber)
                                                        .addComponent(bookNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNewLabel)
                                                        .addComponent(bookNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNewLabel_1)
                                                        .addComponent(aurthorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNewLabel_2)
                                                        .addComponent(publisherTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNewLabel_3)
                                                        .addComponent(quantityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                .addComponent(btnAddBook)
                                                .addGap(21))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(99)
                                                .addComponent(lblNewLabel_4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(btnBack)
                                .addGap(21))
        );
        getContentPane().setLayout(groupLayout);
    }

    public JTextField getBookNumberTextField() {
        return bookNumberTextField;
    }

    public void setBookNumberTextField(JTextField bookNumberTextField) {
        this.bookNumberTextField = bookNumberTextField;
    }

    public JTextField getBookNameTextField() {
        return bookNameTextField;
    }

    public void setBookNameTextField(JTextField bookNameTextField) {
        this.bookNameTextField = bookNameTextField;
    }

    public JTextField getAurthorTextField() {
        return aurthorTextField;
    }

    public void setAurthorTextField(JTextField aurthorTextField) {
        this.aurthorTextField = aurthorTextField;
    }

    public JTextField getPublisherTextField() {
        return publisherTextField;
    }

    public void setPublisherTextField(JTextField publisherTextField) {
        this.publisherTextField = publisherTextField;
    }

    public JTextField getQuantityTextField() {
        return quantityTextField;
    }

    public void setQuantityTextField(JTextField quantityTextField) {
        this.quantityTextField = quantityTextField;
    }

    public JButton getBtnAddBook() {
        return btnAddBook;
    }

    public void setBtnAddBook(JButton btnAddBook) {
        this.btnAddBook = btnAddBook;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }
}
