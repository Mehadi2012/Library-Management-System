package controller;

import model.*;
import view.*;

public class librarianHomeController {
    private librarianHomeModel model;
    private librarianHomeView view;

    public librarianHomeController(librarianHomeView view, librarianHomeModel model) {
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnLogOut().addActionListener(e -> librarianLogout());
        view.getBtnAddStudent().addActionListener(e -> addStudent());
        view.getBtnDeleteStudent().addActionListener(e -> deleteStudent());
        view.getBtnViewBooks().addActionListener(e -> viewBooks());
        view.getBtnFineImposed().addActionListener(e -> imposeFine());
        view.getIssueBooks().addActionListener(e -> issueBook());
        view.getBtnReturnBook().addActionListener(e -> returnBook());
        view.getBtnViewIssuedBooks().addActionListener(e -> viewIssuedBook());
        view.getBtnViewStudent().addActionListener(e -> viewStudent());
        view.getAddBookbutton().addActionListener(e -> addBook());

    }

    private void viewStudent() {
        ViewStudentsView view = new ViewStudentsView();
        ViewStudentModel model = new ViewStudentModel();
        ViewStudentController c = new ViewStudentController(view, model);
        c.initController();
    }

    private void viewIssuedBook() {
        ViewIssuedBooksView view = new ViewIssuedBooksView();
        ViewIssuedBooksModel model = new ViewIssuedBooksModel();
        ViewIssuedBooksController c = new ViewIssuedBooksController(view, model);
        c.initController();
    }

    private void returnBook() {
        returnBooksView view = new returnBooksView();
        returnBooksModel model = new returnBooksModel();
        returnBooksController c = new returnBooksController(view, model);
        c.initController();
    }

    private void issueBook() {
        IssueBookView view = new IssueBookView();
        IssueBookModel model = new IssueBookModel();
        issueBookController c = new issueBookController(view, model);
        c.initController();
    }

    private void imposeFine() {
        fineView view = new fineView();
        fineModel model = new fineModel();
        fineController c = new fineController(view, model);
        c.initController();
    }

    private void viewBooks() {
        viewBooksView view = new viewBooksView();
        viewBooksModel model = new viewBooksModel();
        viewBooksController c = new viewBooksController(view, model);
        c.initController();
    }

    private void deleteStudent() {
        view.setVisible(false);
        view.dispose();
        deleteStudentView view = new deleteStudentView();
        deleteStudentModel model = new deleteStudentModel();
        deleteStudentController c = new deleteStudentController(view,model);
        c.initController();
    }

    private void addStudent() {
        view.setVisible(false);
        view.dispose();
        addStudentView view = new addStudentView();
        addStudentModel model = new addStudentModel();
        addStudentController c = new addStudentController(view,model);
        c.initController();
    }

    private void addBook() {
        view.dispose();
        addNewBookView view = new addNewBookView();
        addNewBookModel model = new addNewBookModel();
        addNewBookController c = new addNewBookController(view, model);
        c.initController();
    }

    private void librarianLogout() {
        view.dispose();
        libraryView view = new libraryView();
        libraryModel model = new libraryModel();
        libraryController c = new libraryController(view,model);
        c.initController();
    }

}
