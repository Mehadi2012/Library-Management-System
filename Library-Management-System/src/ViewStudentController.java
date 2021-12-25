package controller;

import model.ViewStudentModel;
import view.ViewStudentsView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ViewStudentController {
    private ViewStudentModel model ;
    private ViewStudentsView view;
    private JTable table;

    ViewStudentController(ViewStudentsView view, ViewStudentModel model){
        this.view = view;
        this.model = model;
    }
    public void initController(){
        view.setVisible(true);
        table = view.getTable();
        initTable();
    }
    private void initTable() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        TableModel tableModel = model.studentTable();
        if (tableModel.getRowCount()>0)
            table.setModel(tableModel);
        else {
            table.setModel(defaultTableModel);
            JOptionPane.showMessageDialog(view, "Nothing in the table");
        }
    }
}
