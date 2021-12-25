package model;

import Dao.LibrarianDAO;

public class librarianLoginModel {
    private  String name;
    private  String password;

    public librarianLoginModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLoginStatus() {
        boolean status = false;
        status = LibrarianDAO.validate(name,password);
        return status;
    }
}
