package model;

import Dao.LibrarianDAO;
import Dao.StudentDao;

public class deleteStudentModel {
    private int id;

    public deleteStudentModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int deleteStd() {
        int check;
        check = StudentDao.delete(id);
        return check;
    }
}
