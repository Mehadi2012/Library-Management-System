package controller;

import model.addNewBookModel;

import model.librarianHomeModel;
import view.addNewBookView;

import view.librarianHomeView;

import javax.swing.*;

public class addNewBookController {
    private addNewBookView view;
    private addNewBookModel model;

    public addNewBookController(addNewBookView view, addNewBookModel model) {
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnAddBook().addActionListener(e -> addNewBook());
        view.getBtnBack().addActionListener(e -> back());
    }

    private void back() {
        view.dispose();
        librarianHomeView view = new librarianHomeView();
        librarianHomeModel model = new librarianHomeModel();
        librarianHomeController c = new librarianHomeController(view,model);
        c.initController();
    }

    private void addNewBook() {
        String bookNumber = view.getBookNumberTextField().getText();
        String bookName = view.getBookNameTextField().getText();
        String author = view.getAurthorTextField().getText();
        String publisher = view.getPublisherTextField().getText();
        String quantity = view.getQuantityTextField().getText();

        model.setBookName(bookName);
        model.setBookNumber(bookNumber);
        model.setAuthor(author);
        model.setPublisher(publisher);
        model.setQuantity(quantity);

        String check = model.addNewBook();
        if (check.equals("1")){
            //view.dispose();
            JOptionPane.showMessageDialog(view, "Book added successfully");

//            librarianHomeView view = new librarianHomeView();
//            librarianHomeModel model = new librarianHomeModel();
//            librarianHomeController c = new librarianHomeController(view,model);
//            c.initController();
        }else

            JOptionPane.showMessageDialog(view,check);


    }
}
