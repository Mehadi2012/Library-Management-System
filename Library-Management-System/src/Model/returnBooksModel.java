package model;

import Dao.ReturnBookDao;

public class returnBooksModel {
    public returnBooksModel() {

    }

    public int returnBook(String bookcellNo, int studentid) {
        int check;
        check = ReturnBookDao.delete(bookcellNo,studentid);
        return check;
    }

}
