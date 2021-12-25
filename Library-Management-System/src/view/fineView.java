package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fineView extends JFrame {

    private JTextField idTextField;
    private JTextField fineTextField;
    private JButton btnPaid;
    private JButton btnBack;

    public fineView() {
        initialize();
    }


    private void initialize() {

        setBounds(680, 300, 680, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblFine = new JLabel("FINE");
        lblFine.setForeground(Color.GRAY);
        lblFine.setBackground(Color.GRAY);
        lblFine.setFont(new Font("Tahoma", Font.PLAIN, 28));

        JLabel lblEnterStudentId = new JLabel("Enter Student ID :");
        lblEnterStudentId.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEnterFinePaid = new JLabel("Enter fine paid :");
        lblEnterFinePaid.setFont(new Font("Tahoma", Font.PLAIN, 18));

        idTextField = new JTextField();
        idTextField.setColumns(10);

        fineTextField = new JTextField();
        fineTextField.setColumns(10);

        btnPaid = new JButton("Fine");
        btnPaid.setFont(new Font("Tahoma", Font.PLAIN, 18));


        btnBack = new JButton("Back");


        JLabel lblNewLabel = new JLabel("");
        Image img6=new ImageIcon(this.getClass().getResource("/img/fine.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img6));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(248, Short.MAX_VALUE)
                                .addComponent(btnPaid, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(196)
                                .addComponent(btnBack)
                                .addGap(39))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
                                                .addGap(269)
                                                .addComponent(lblFine))
                                        .addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
                                                .addGap(136)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblEnterStudentId)
                                                        .addComponent(lblEnterFinePaid))
                                                .addGap(28)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(fineTextField, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idTextField, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                                .addGap(153))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(210)
                                .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(112))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(22)
                                .addComponent(lblFine)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEnterStudentId)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEnterFinePaid)
                                        .addComponent(fineTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                                .addGap(18)
                                .addComponent(btnPaid)
                                .addGap(22))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(375, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
        );
        getContentPane().setLayout(groupLayout);
    }

    public JTextField getIdTextField() {
        return idTextField;
    }

    public void setIdTextField(JTextField idTextField) {
        this.idTextField = idTextField;
    }

    public JTextField getFineTextField() {
        return fineTextField;
    }

    public void setFineTextField(JTextField fineTextField) {
        this.fineTextField = fineTextField;
    }

    public JButton getBtnPaid() {
        return btnPaid;
    }

    public void setBtnPaid(JButton btnPaid) {
        this.btnPaid = btnPaid;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }
}
