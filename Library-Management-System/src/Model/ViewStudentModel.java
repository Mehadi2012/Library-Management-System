package model;

import Dao.BookDao;
import Dao.StudentDao;

import javax.swing.table.TableModel;

public class ViewStudentModel{
    TableModel table;
    public ViewStudentModel() {

    }


    public TableModel studentTable() {
        table = StudentDao.getStd();
        return table;
    }
}
