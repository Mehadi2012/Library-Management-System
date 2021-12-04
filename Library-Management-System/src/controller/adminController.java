package controller;


import model.adminHomeModel;
import model.adminModel;
import model.libraryModel;
import view.adminHomeView;
import view.adminView;
import view.libraryView;

import javax.swing.*;


public class adminController {
    private adminView view;
    private adminModel model;

    public adminController(adminView view, adminModel model) {
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnLogin().addActionListener(e -> adminLogin());
        view.getBtnBack().addActionListener(e -> back());
    }

    private void back() {
        view.dispose();
        libraryView view = new libraryView();
        libraryModel model = new libraryModel();
        libraryController c = new libraryController(view,model);
        c.initController();
    }

    private void adminLogin() {

        String name = view.getTextField().getText();
        String pass = view.getPasswordField().getText();

        if(name.equals("admin")&&pass.equals("admin")){

            view.dispose();
            adminHomeView view = new adminHomeView();
            adminHomeModel model = new adminHomeModel();
            adminHomeController c = new adminHomeController(view,model);
            c.initController();
        }else{
            JOptionPane.showMessageDialog(view, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
            view.getTextField().setText("");
            view.getPasswordField().setText("");
        }

    }
}
