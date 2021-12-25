package controller;

import model.libraryModel;
import view.libraryView;

public class main {



    public static void main(String[] args) {

        libraryView view = new libraryView();
        libraryModel model = new libraryModel();
        libraryController c = new libraryController(view,model);
        c.initController();
    }
}
