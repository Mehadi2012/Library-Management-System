package controller;


import model.adminHomeModel;
import model.deleteLibrarianModel;

import view.adminHomeView;
import view.deleteLibrarianView;

import javax.swing.*;

public class deleteLibrarianController {
    private deleteLibrarianView view;
    private deleteLibrarianModel model;
    private int id;

    public deleteLibrarianController(deleteLibrarianView view, deleteLibrarianModel model) {
        this.view = view;
        this.model = model;

    }
    public void initController(){
        view.setVisible(true);
        view.getBtnDelete().addActionListener(e -> deleteLibrarian());
        view.getBtnBack().addActionListener(e -> back());

    }

    private void back() {
        view.dispose();
        adminHomeView view = new adminHomeView();
        adminHomeModel model = new adminHomeModel();
        adminHomeController c = new adminHomeController(view, model);
        c.initController();
    }

    private void deleteLibrarian() {

        String string_id = view.getIdTextField().getText();
        id = Integer.parseInt(string_id);
        model.setId(id);
        int check = model.deleteLibrarian();
        if (check>0){
            JOptionPane.showMessageDialog(view, "Deleted Successfully");
            view.dispose();
            adminHomeView view = new adminHomeView();
            adminHomeModel model = new adminHomeModel();
            adminHomeController c = new adminHomeController(view, model);
            c.initController();

        }else
            JOptionPane.showMessageDialog(view, "Something gone wrong !!");

    }

}
