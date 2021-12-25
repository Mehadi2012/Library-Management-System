package view;

import javax.swing.*;
import java.awt.*;

public class deleteStudentView extends JFrame {

    private JTextField idTextField;
    private JButton btnDelete;
    private JButton btnBack;

    public deleteStudentView() {
        initialize();
    }



    private void initialize() {
        setBounds(680, 300, 680, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblDeleteStudent = new JLabel("Delete Student");
        lblDeleteStudent.setForeground(Color.GRAY);
        lblDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 28));

        JLabel lblEnterId = new JLabel("Enter ID :");
        lblEnterId.setFont(new Font("Tahoma", Font.PLAIN, 18));

        idTextField = new JTextField();
        idTextField.setColumns(10);

        btnDelete = new JButton("Delete");

        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));

        btnBack = new JButton("Back");


        JLabel lblNewLabel = new JLabel("");
        Image img4=new ImageIcon(this.getClass().getResource("/img/Delete.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img4));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(260, Short.MAX_VALUE)
                                .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                .addGap(154)
                                .addComponent(btnBack)
                                .addGap(26))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(214)
                                .addComponent(lblDeleteStudent)
                                .addContainerGap(213, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(172)
                                                .addComponent(lblEnterId)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                                .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
                                .addGap(139))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblDeleteStudent)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEnterId)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNewLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(btnDelete))
                                .addGap(48))
        );
        getContentPane().setLayout(groupLayout);


    }

    public JTextField getIdTextField() {
        return idTextField;
    }

    public void setIdTextField(JTextField idTextField) {
        this.idTextField = idTextField;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }
}
