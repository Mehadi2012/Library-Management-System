package model;

import Dao.StudentDao;

public class fineModel {

    public  int fineImpose(int id , int fineAmnt){
        int check;
        check= StudentDao.finer(id,fineAmnt);
        return check;
    }
    public boolean checkStd(int id) {
        boolean check;
        check = StudentDao.checkstud(id);
        return check;
    }
}
