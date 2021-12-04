package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminHomeView extends JFrame {
    JButton btnAddLibrarian;
    JButton btnViewLibrarian;
    JButton btnDeleteLibrarian;
    JButton btnLogOut;

    public adminHomeView() {
        initialize();
    }


    private void initialize() {

        setBounds(100, 100, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblAdminSection = new JLabel("ADMIN SECTION");
        lblAdminSection.setForeground(Color.GRAY);
        lblAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 28));

        btnAddLibrarian = new JButton("Add Librarian");

        btnAddLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnViewLibrarian = new JButton("View Librarian");

        btnViewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnDeleteLibrarian = new JButton("Delete Librarian");

        btnDeleteLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnLogOut = new JButton("Log Out");

        btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 18));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(214)
                                .addComponent(lblAdminSection)
                                .addContainerGap())
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(203)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnAddLibrarian, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                                .addGap(181))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnDeleteLibrarian, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnViewLibrarian, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                                                .addContainerGap(181, Short.MAX_VALUE))))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(266, Short.MAX_VALUE)
                                .addComponent(btnLogOut)
                                .addGap(259))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(24)
                                .addComponent(lblAdminSection)
                                .addGap(35)
                                .addComponent(btnAddLibrarian, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(26)
                                .addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addGap(28)
                                .addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btnLogOut)
                                .addGap(30))
        );
        getContentPane().setLayout(groupLayout);
    }

    public JButton getBtnAddLibrarian() {
        return btnAddLibrarian;
    }

    public void setBtnAddLibrarian(JButton btnAddLibrarian) {
        this.btnAddLibrarian = btnAddLibrarian;
    }

    public JButton getBtnViewLibrarian() {
        return btnViewLibrarian;
    }

    public void setBtnViewLibrarian(JButton btnViewLibrarian) {
        this.btnViewLibrarian = btnViewLibrarian;
    }

    public JButton getBtnDeleteLibrarian() {
        return btnDeleteLibrarian;
    }

    public void setBtnDeleteLibrarian(JButton btnDeleteLibrarian) {
        this.btnDeleteLibrarian = btnDeleteLibrarian;
    }

    public JButton getBtnLogOut() {
        return btnLogOut;
    }

    public void setBtnLogOut(JButton btnLogOut) {
        this.btnLogOut = btnLogOut;
    }
}
