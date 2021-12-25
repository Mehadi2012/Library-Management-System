package controller;

import model.addLibrarianModel;
import model.adminHomeModel;
import view.addLibrarianView;
import view.adminHomeView;


import javax.swing.*;

public class addLibrarianController {
    private addLibrarianModel model;
    private addLibrarianView view;

    private String name,password,email,phoneNumber;

    public addLibrarianController(addLibrarianView view, addLibrarianModel model) {
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        view.getBtnAddLibrarian().addActionListener(e -> addLibrarian());
        view.getBtnBack().addActionListener(e -> back());
    }

    private void back() {
        view.dispose();
        adminHomeView view = new adminHomeView();
        adminHomeModel model = new adminHomeModel();
        adminHomeController c = new adminHomeController(view, model);
        c.initController();
    }

    private void addLibrarian() {
        name = view.getNameTextField().getText();
        password = view.getPasswordField().getText();
        phoneNumber = view.getPhoneNumTextField_2().getText();
        email = view.getEmailTextField_1().getText();
        model.setEmail(email);
        model.setName(name);
        model.setPassword(password);
        model.setPhoneNumber(phoneNumber);
        if(name.isEmpty() || password.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()){
            JOptionPane.showMessageDialog(view, "All fields are required !!");
        }else {
            int check = model.addLibrarian();
            if (check > 0) {
                JOptionPane.showMessageDialog(view, "Librarian added successfully!");
                view.dispose();
                adminHomeView view = new adminHomeView();
                adminHomeModel model = new adminHomeModel();
                adminHomeController c = new adminHomeController(view, model);
                c.initController();
            }else {
                JOptionPane.showMessageDialog(view,"Something went wrong !!");
            }
        }
    }
}
