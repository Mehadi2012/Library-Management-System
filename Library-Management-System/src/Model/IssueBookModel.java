package model;

import Dao.IssueBookDao;
import Dao.StudentDao;

public class IssueBookModel {

    public IssueBookModel() {

    }

    public boolean checkBook(String bookcellNo) {
        boolean check;
        check = IssueBookDao.checkBook(bookcellNo);
        return check;
    }
    public boolean checkStd(int id) {
        boolean check;
        check = StudentDao.checkstud(id);
        return check;
    }

    public int issueBook(String bookcellNo, int id) {
        int check;
        check = IssueBookDao.save(bookcellNo,id);
        return check;
    }
}
