package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menentukanNIM {
    private JTextField textNama;
    private JTextField textahunmasuk;
    private JPanel rootPanel;
    private JTextField textjenjang;
    private JTextField textfakultas;
    private JTextField textjurusan;
    private JTextField textkelamin;
    private JTextField texturutan;
    private JButton OKButton;
    private JLabel labelhasil;

    public menentukanNIM() {
OKButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String Nama = textNama.getText();
        String tahunmasuk = textahunmasuk.getText();
        String jenjang = textjenjang.getText();
        String fakultas = textfakultas.getText();
        String jurusan = textjurusan.getText();
        String kelamin = textkelamin.getText();
        String urutan = texturutan.getText();

        masukandata md = new masukandata();
        md.setNama(Nama);
        md.setTahunmasuk(tahunmasuk);
        md.setJenjang(jenjang);
        md.setFakultas(fakultas);
        md.setJurusan(jurusan);
        md.setKelamin(kelamin);
        md.setUrutan(urutan);

        labelhasil.setText(md.toString());

    }
});
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
