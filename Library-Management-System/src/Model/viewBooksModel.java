package model;

import Dao.BookDao;

import javax.swing.table.TableModel;

public class viewBooksModel {
    TableModel table;
    public viewBooksModel() {

    }


    public TableModel bookTable() {
        table = BookDao.getBookTable();
        return table;
    }
}
