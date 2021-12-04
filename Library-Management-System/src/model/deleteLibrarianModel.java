package model;

import Dao.LibrarianDAO;

public class deleteLibrarianModel {
    private int id;

    public deleteLibrarianModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int deleteLibrarian() {
        int check;
        check = LibrarianDAO.delete(id);
        return check;
    }
}
