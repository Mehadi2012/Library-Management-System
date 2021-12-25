package controller;

import model.*;

import view.*;


public class adminHomeController {
    
    
    private adminHomeView view;
    private adminHomeModel model;

    public adminHomeController(adminHomeView view, adminHomeModel model) {
        this.view = view;
        this.model = model;
        
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnAddLibrarian().addActionListener(e -> addLibrarian());
        view.getBtnDeleteLibrarian().addActionListener(e -> deleteLibrarian());
        view.getBtnViewLibrarian().addActionListener(e -> viewLibrarian());
        view.getBtnLogOut().addActionListener(e -> logOut());
    }

    private void addLibrarian() {
        view.dispose();
        addLibrarianView view = new addLibrarianView();
        addLibrarianModel model = new addLibrarianModel();
        addLibrarianController c = new addLibrarianController(view,model);
        c.initController();
    }

    private void deleteLibrarian() {
        view.dispose();
        deleteLibrarianView view = new deleteLibrarianView();
        deleteLibrarianModel model = new deleteLibrarianModel();
        deleteLibrarianController c = new deleteLibrarianController(view,model);
        c.initController();
    }

    private void viewLibrarian() {
        ViewLibrarianView view = new ViewLibrarianView();
        viewLibrarianModel model = new viewLibrarianModel();
        viewLibrarianController c = new viewLibrarianController(view,model);
        c.initController();
    }

    private void logOut() {
        view.dispose();
        adminView view = new adminView();
        adminModel model = new adminModel();
        adminController c = new adminController(view,model);
        c.initController();
    }
}
