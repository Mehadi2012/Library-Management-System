package controller;

import model.IssueBookModel;
import model.librarianHomeModel;
import view.IssueBookView;
import view.librarianHomeView;

import javax.swing.*;

public class issueBookController {
    private IssueBookView view;
    private IssueBookModel model;
    private int id;

    public issueBookController(IssueBookView view, IssueBookModel model) {
        this.view = view;
        this.model = model;

    }
    public void initController(){
        view.setVisible(true);
        view.getBtnIssue().addActionListener(e -> issueBook());
        view.getBtnBack().addActionListener(e -> back());

    }

    private void issueBook() {
        String string_id = view.getIdTextField().getText();
        id = Integer.parseInt(string_id);
        String string_bookcallNo = view.getBookCallTextField().getText();
        Boolean checkBook = model.checkBook(string_bookcallNo);
        Boolean checkStd = model.checkStd(id);
        if (checkStd) {
            if (checkBook) {
                int checkIssue = model.issueBook(string_bookcallNo, id);
                if (checkIssue > 0) {
                    JOptionPane.showMessageDialog(view, "Book issued successfully!");
                    view.setVisible(false);
                    view.dispose();
                } else {
                    JOptionPane.showMessageDialog(view, "Sorry, unable to issue!");
                    view.setVisible(false);
                    view.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(view, "Sorry, Callno doesn't exist!");
                view.setVisible(false);
                view.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(view, "Sorry, Student doesn't exist!");
            view.setVisible(false);
            view.dispose();
        }
    }

    private void back() {
        view.setVisible(false);
        view.dispose();
    }
}
