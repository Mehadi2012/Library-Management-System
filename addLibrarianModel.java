package model;

import Dao.LibrarianDAO;

public class addLibrarianModel {
    private String name,password,email,phoneNumber;

    public addLibrarianModel() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int addLibrarian() {
        int check;

        check = LibrarianDAO.save(name, password, email, phoneNumber);

        return check;
    }
}
