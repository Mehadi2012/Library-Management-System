package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class libraryView extends JFrame {



    private JButton btnAdmin;
    private JButton btnLibrarian;

    public libraryView() {

        initialize();
    }


    private void initialize() {

        setBounds(650, 300, 640, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        btnLibrarian = new JButton("Librarian");
        btnLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 18));


        JLabel lblIntegratedLibrarySystem = new JLabel("Library Management System");
        lblIntegratedLibrarySystem.setBackground(Color.GRAY);
        lblIntegratedLibrarySystem.setFont(new Font("Tahoma", Font.PLAIN, 23));

        JLabel lblNewLabel = new JLabel("");
        Image img=new ImageIcon(this.getClass().getResource("/img/login1.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));

        btnAdmin = new JButton("Admin");

        btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 18));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(124, Short.MAX_VALUE)
                                .addComponent(lblIntegratedLibrarySystem, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
                                .addGap(79))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(97)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(93, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(211)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAdmin, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(btnLibrarian, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))

                                .addGap(201)
        ));
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIntegratedLibrarySystem, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

                                .addGap(18)
                                .addComponent(btnLibrarian, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btnAdmin, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);
        setVisible(true);

    }



    public JButton getBtnAdmin() {
        return btnAdmin;
    }

    public void setBtnAdmin(JButton btnAdmin) {
        this.btnAdmin = btnAdmin;
    }

    public JButton getBtnLibrarian() {
        return btnLibrarian;
    }

    public void setBtnLibrarian(JButton btnLibrarian) {
        this.btnLibrarian = btnLibrarian;
    }
}
