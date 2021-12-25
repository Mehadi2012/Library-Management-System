package controller;

import model.viewBooksModel;
import view.viewBooksView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class viewBooksController {
    private viewBooksView view;
    private viewBooksModel model;
    private JTable table;

    viewBooksController(viewBooksView view, viewBooksModel model){
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
        TableModel tableModel = model.bookTable();
        if (tableModel.getRowCount()>0)
            table.setModel(tableModel);
        else {
            table.setModel(defaultTableModel);
            JOptionPane.showMessageDialog(view, "Nothing in the table");
        }
    }
}
