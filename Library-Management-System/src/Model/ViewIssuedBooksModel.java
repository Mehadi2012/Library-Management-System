package model;


import Dao.IssueBookDao;

import javax.swing.table.TableModel;

public class ViewIssuedBooksModel {
    TableModel table;
    public ViewIssuedBooksModel() {

    }


    public TableModel IssuedBookTable() {
        table = IssueBookDao.getIssuedBookTable();
        return table;
    }
}
