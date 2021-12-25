package controller;

import model.returnBooksModel;
import view.returnBooksView;

import javax.swing.*;

public class returnBooksController {
    private returnBooksView view;
    private returnBooksModel model;
    private int id;

    public returnBooksController(returnBooksView view, returnBooksModel model) {
        this.view = view;
        this.model = model;

    }

    public void initController() {
        view.setVisible(true);
        view.getBtnReturn().addActionListener(e -> returnBook());
        view.getBtnBack().addActionListener(e -> back());

    }

    private void returnBook() {
        String string_id = view.getIdTextField().getText();
        id = Integer.parseInt(string_id);
        String string_bookcallNo = view.getBookCallTextField().getText();
        int checkReturn = model.returnBook(string_bookcallNo,id);
        if (checkReturn > 0) {
            JOptionPane.showMessageDialog(view, "Book returned successfully!");
            view.setVisible(false);
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(view, "Sorry, unable to return!");
            view.setVisible(false);
            view.dispose();
        }
    }

    private void back() {
        view.setVisible(false);
        view.dispose();
    }
}
