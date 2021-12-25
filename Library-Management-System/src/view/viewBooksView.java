package view;

import javax.swing.*;
import java.awt.*;


public class viewBooksView extends JFrame {
    private JTable table;
    private JScrollPane sp;

    public viewBooksView() {
        initialize();
    }


    private void initialize() {

        setBounds(680, 300, 680, 460);

        table = new JTable();
        sp=new JScrollPane(table);
        add(sp, BorderLayout.CENTER);

    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }
}
