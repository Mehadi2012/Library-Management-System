package controller;

import model.adminHomeModel;
import model.deleteStudentModel;
import model.librarianHomeModel;
import view.adminHomeView;
import view.deleteStudentView;
import view.librarianHomeView;

import javax.swing.*;

public class deleteStudentController {
    private deleteStudentView view;
    private deleteStudentModel model;
    private int id;

    public deleteStudentController(deleteStudentView view, deleteStudentModel model) {
        this.view = view;
        this.model = model;

    }
    public void initController(){
        view.setVisible(true);
        view.getBtnDelete().addActionListener(e -> deleteLibrarian());
        view.getBtnBack().addActionListener(e -> back());

    }

    private void back() {
        view.setVisible(false);
        view.dispose();
        librarianHomeView view = new librarianHomeView();
        librarianHomeModel model = new librarianHomeModel();
        librarianHomeController c = new librarianHomeController(view,model);
        c.initController();
    }

    private void deleteLibrarian() {

        String string_id = view.getIdTextField().getText();
        id = Integer.parseInt(string_id);
        model.setId(id);
        int check = model.deleteStd();
        if (check>0){
            JOptionPane.showMessageDialog(view, "Deleted Successfully");
            view.setVisible(false);
            view.dispose();
            librarianHomeView view = new librarianHomeView();
            librarianHomeModel model = new librarianHomeModel();
            librarianHomeController c = new librarianHomeController(view,model);
            c.initController();

        }else
            JOptionPane.showMessageDialog(view, "Something gone wrong !!");

    }
}
