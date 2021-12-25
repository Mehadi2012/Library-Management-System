package controller;

import model.adminModel;
import model.librarianLoginModel;
import model.libraryModel;
import view.adminView;
import view.librarianLoginView;
import view.libraryView;



public class libraryController {
    private libraryView view;
    private libraryModel model;

    public libraryController(libraryView view, libraryModel model) {
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnAdmin().addActionListener(e -> admin());
        view.getBtnLibrarian().addActionListener(e -> librarian());
    }

    private void librarian() {
        view.dispose();
        librarianLoginView view = new librarianLoginView();
        librarianLoginModel model = new librarianLoginModel();
        librarianLoginController c = new librarianLoginController(view,model);
        c.initController();
    }

    private void admin() {
        view.dispose();
        adminView view = new adminView();
        adminModel model = new adminModel();
        adminController c = new adminController(view,model);
        c.initController();

    }
}
