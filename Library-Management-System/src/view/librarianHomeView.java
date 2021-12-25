package view;

import javax.swing.*;
import java.awt.*;


public class librarianHomeView extends JFrame {
    private  JButton btnAddStudent;
    private  JButton btnViewStudent;
    private  JButton btnDeleteStudent;
    private  JButton addBookbutton;
    private  JButton btnViewBooks;
    private  JButton btnViewIssuedBooks;
    private  JButton issueBooks;
    private  JButton btnReturnBook;
    private  JButton btnLogOut;
    private  JButton btnFineImposed;
    private  JLabel lblNewLabel;


    public librarianHomeView() {
        initialize();
    }


    private void initialize() {

        setBounds(550, 165, 850, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblNewLabel = new JLabel("LIBRARIAN SECTION");
        lblNewLabel.setForeground(Color.GRAY);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));


        btnAddStudent = new JButton("Add Student");
        btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnViewStudent = new JButton("View Student");
        btnViewStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnDeleteStudent = new JButton("Delete Student");
        btnDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));



        addBookbutton = new JButton("Add New Book");

        addBookbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnViewBooks = new JButton("View Books");

        btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnViewIssuedBooks = new JButton("View Issued Books");

        btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));

        issueBooks = new JButton("Issue Books");

        issueBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));


        btnReturnBook = new JButton("Return Book");

        btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnLogOut = new JButton("Log Out");

        btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnFineImposed = new JButton("Fine Imposed");

        btnFineImposed.setFont(new Font("Tahoma", Font.PLAIN, 18));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(82)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
                                        .addComponent(lblNewLabel,GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(addBookbutton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)


                                                        .addComponent(btnAddStudent, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                        .addComponent(btnViewStudent, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                        .addComponent(btnDeleteStudent, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                        .addComponent(btnViewBooks, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(issueBooks, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnViewIssuedBooks, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                        .addComponent(btnReturnBook, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                        .addComponent(btnFineImposed, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(20)))
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(58, Short.MAX_VALUE)
                                .addComponent(btnLogOut)
                                .addGap(57))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNewLabel)
                                .addGap(34)
                                .addComponent(addBookbutton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewStudent, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(issueBooks, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnFineImposed, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addGap(37)
                                .addComponent(btnLogOut)
                                .addGap(67))
        );
        getContentPane().setLayout(groupLayout);
    }

    public JButton getBtnAddStudent() {
        return btnAddStudent;
    }

    public void setBtnAddStudent(JButton btnAddStudent) {
        this.btnAddStudent = btnAddStudent;
    }

    public JButton getBtnViewStudent() {
        return btnViewStudent;
    }

    public void setBtnViewStudent(JButton btnViewStudent) {
        this.btnViewStudent = btnViewStudent;
    }

    public JButton getBtnDeleteStudent() {
        return btnDeleteStudent;
    }

    public void setBtnDeleteStudent(JButton btnDeleteStudent) {
        this.btnDeleteStudent = btnDeleteStudent;
    }

    public JButton getAddBookbutton() {
        return addBookbutton;
    }

    public void setAddBookbutton(JButton addBookbutton) {
        this.addBookbutton = addBookbutton;
    }

    public JButton getBtnViewBooks() {
        return btnViewBooks;
    }

    public void setBtnViewBooks(JButton btnViewBooks) {
        this.btnViewBooks = btnViewBooks;
    }

    public JButton getBtnViewIssuedBooks() {
        return btnViewIssuedBooks;
    }

    public void setBtnViewIssuedBooks(JButton btnViewIssuedBooks) {
        this.btnViewIssuedBooks = btnViewIssuedBooks;
    }

    public JButton getIssueBooks() {
        return issueBooks;
    }

    public void setIssueBooks(JButton issueBooks) {
        this.issueBooks = issueBooks;
    }

    public JButton getBtnReturnBook() {
        return btnReturnBook;
    }

    public void setBtnReturnBook(JButton btnReturnBook) {
        this.btnReturnBook = btnReturnBook;
    }

    public JButton getBtnLogOut() {
        return btnLogOut;
    }

    public void setBtnLogOut(JButton btnLogOut) {
        this.btnLogOut = btnLogOut;
    }

    public JButton getBtnFineImposed() {
        return btnFineImposed;
    }

    public void setBtnFineImposed(JButton btnFineImposed) {
        this.btnFineImposed = btnFineImposed;
    }


}
