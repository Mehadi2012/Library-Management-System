package model;

import Dao.LibrarianDAO;

import javax.swing.table.TableModel;

public class viewLibrarianModel {
    TableModel table;

    public viewLibrarianModel() {
    }

    public TableModel librarianTable() {
        table = LibrarianDAO.getLibrarianTable();
        return table;
    }
}
