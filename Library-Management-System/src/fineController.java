package controller;

import model.deleteStudentModel;
import model.fineModel;
import model.librarianHomeModel;
import view.deleteStudentView;
import view.fineView;
import view.librarianHomeView;

import javax.swing.*;

public class fineController {
    private fineView view;
    private fineModel model;
    private int id;

    public fineController(fineView view, fineModel model) {
        this.view = view;
        this.model = model;

    }
    public void initController(){
        view.setVisible(true);
        view.getBtnPaid().addActionListener(e -> imposeFine());
        view.getBtnBack().addActionListener(e -> back());

    }

    private void imposeFine() {
        String sid=view.getIdTextField().getText();
        int id=Integer.parseInt(sid);
        String fi=view.getFineTextField().getText();
        Boolean checkStd = model.checkStd(id);
        if(checkStd) {
            int fine=Integer.parseInt(fi);
            int i= model.fineImpose(id, fine);
            if(i>0) {
                JOptionPane.showMessageDialog(view,"Fine paid successfully!");

                view.dispose();
            }
            else{
                JOptionPane.showMessageDialog(view,"Sorry, unable to repay!");
                view.dispose();
            }

        }else{
            JOptionPane.showMessageDialog(view,"Sorry, Student Id doesn't exist!");
            view.dispose();
        }
    }

    private void back() {
        view.setVisible(false);
        view.dispose();
        librarianHomeView view = new librarianHomeView();
        librarianHomeModel model = new librarianHomeModel();
        librarianHomeController c = new librarianHomeController(view,model);
        c.initController();
    }
}
