package controller;

import model.addStudentModel;
import model.librarianHomeModel;
import view.addStudentView;
import view.librarianHomeView;

import javax.swing.*;

public class addStudentController {
    private addStudentView view;
    private addStudentModel model;
    private String name, password, email, phoneNumner;

    public addStudentController(addStudentView view, addStudentModel model) {
        this.view = view;
        this.model = model;
    }

    public void initController(){
        view.setVisible(true);
        view.getBtnAddStudent().addActionListener(e -> addStudent());
        view.getBackBtn().addActionListener(e -> back());
    }

    private void back() {
        view.setVisible(false);
        view.dispose();
        librarianHomeView view = new librarianHomeView();
        librarianHomeModel model = new librarianHomeModel();
        librarianHomeController c = new librarianHomeController(view,model);
        c.initController();
    }

    private void addStudent() {
        String check="";
        name  = view.getNameTextField().getText();
        email  = view.getEmailTextField().getText();
        phoneNumner  = view.getContactNumberTextField().getText();

        model.setEmail(email);
        model.setName(name);
        model.setPhoneNumber(phoneNumner);

        check = model.addStudent();
        if (check.equals("1")){
            JOptionPane.showMessageDialog(view, "Student Added Successfully");
            view.setVisible(false);
            view.dispose();
            addStudentView view = new addStudentView();
            addStudentModel model = new addStudentModel();
            addStudentController c = new addStudentController(view,model);
            c.initController();
        }else{
            JOptionPane.showMessageDialog(view, "Something went Wrong!!"+" "+check);
        }
    }
}
