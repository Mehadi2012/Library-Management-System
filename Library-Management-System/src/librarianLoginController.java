package controller;

import model.adminHomeModel;

import model.librarianHomeModel;
import model.librarianLoginModel;
import model.libraryModel;
import view.adminHomeView;

import view.librarianHomeView;
import view.librarianLoginView;
import view.libraryView;

import javax.swing.*;

public class librarianLoginController {
    private librarianLoginView view;
    private librarianLoginModel model;

    public librarianLoginController(librarianLoginView view, librarianLoginModel model) {
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnLogin().addActionListener(e -> librarianLogin());
        view.getBtnBack().addActionListener(e -> back());
    }

    private void back() {
        view.dispose();
        libraryView view = new libraryView();
        libraryModel model = new libraryModel();
        libraryController c = new libraryController(view,model);
        c.initController();
    }

    private void librarianLogin() {

        String name = view.getNameTextField().getText();
        String pass = view.getPasswordField().getText();

        model.setName(name);
        model.setPassword(pass);

        boolean check = model.getLoginStatus();

        if(check){

            view.dispose();
            librarianHomeView view = new librarianHomeView();
            librarianHomeModel model = new librarianHomeModel();
            librarianHomeController c = new librarianHomeController(view,model);
            c.initController();
        }else{
            JOptionPane.showMessageDialog(view, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
            view.getNameTextField().setText("");
            view.getPasswordField().setText("");
        }

    }
}
