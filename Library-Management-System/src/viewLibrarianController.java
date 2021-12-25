package controller;


import model.viewLibrarianModel;
import view.ViewLibrarianView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class viewLibrarianController {
    private viewLibrarianModel model;
    private ViewLibrarianView view;
    private JTable table;


    public viewLibrarianController(ViewLibrarianView view, viewLibrarianModel model) {
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
        TableModel tableModel = model.librarianTable();
        if (tableModel.getRowCount()>0)
            table.setModel(tableModel);
        else {
            table.setModel(defaultTableModel);
            JOptionPane.showMessageDialog(view, "Nothing in the table");
        }
    }
}
