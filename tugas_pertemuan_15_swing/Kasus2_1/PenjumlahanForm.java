package Tugas_Pertemuan_15.Kasus2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenjumlahanForm extends JFrame implements ActionListener {

    // Deklarasi komponen GUI
    private JTextField textField1;
    private JTextField textField2;
    private JButton jumlahButton;
    private JLabel label1;
    private JLabel label2;

    public PenjumlahanForm() {
        label1 = new JLabel("Nilai 1:");
        textField1 = new JTextField(10);

        label2 = new JLabel("Nilai 2:");
        textField2 = new JTextField(10);

        jumlahButton = new JButton("Jumlah");

        jumlahButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(jumlahButton);

        setTitle("Program Penjumlahan");
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            int nilai1 = Integer.parseInt(textField1.getText());
            int nilai2 = Integer.parseInt(textField2.getText());

            int hasil = nilai1 + nilai2;

            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}