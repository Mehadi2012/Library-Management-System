package controller;

import model.ViewIssuedBooksModel;
import view.ViewIssuedBooksView;
import view.viewBooksView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ViewIssuedBooksController {
    private ViewIssuedBooksView view;
    private ViewIssuedBooksModel model;
    private JTable table;

    ViewIssuedBooksController(ViewIssuedBooksView view, ViewIssuedBooksModel model){
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
        TableModel tableModel = model.IssuedBookTable();
        if (tableModel.getRowCount()>0)
            table.setModel(tableModel);
        else {
            table.setModel(defaultTableModel);
            JOptionPane.showMessageDialog(view, "Nothing in the table");
        }
    }
}
