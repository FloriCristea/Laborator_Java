import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm {
    public TeacherForm() {
        btnCurs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == btnCurs) {
                        System.out.println("Afisare cursuri");
                }
            }
        });
        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == btnStudent) {
                    System.out.println("Afisare studenti");
                }
            }
        });
        btnNoteaza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == btnNoteaza) {
                    System.out.println("Noteaza studenti");
                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private JPanel panel1;
    private JButton btnCurs;
    private JButton btnStudent;
    private JButton btnNoteaza;
}
