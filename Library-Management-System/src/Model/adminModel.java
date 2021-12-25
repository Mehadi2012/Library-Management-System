package model;

import Dao.adminDao;

public class adminModel {
    public boolean getAdmin(String name, String pass){
        boolean check;
        check = adminDao.validateAdmin(name, pass);
        return check;
    }
}
