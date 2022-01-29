import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    private JButton btnCursuri;

    public StudentForm() {
        btnCursuri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == btnCursuri) {
                    System.out.println("Afisare cursuri");
                }
            }
        });
        btnMedie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == btnMedie) {
                    System.out.println("Afisare medie an universitar");
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private JPanel mainPanel;
    private JButton btnMedie;
}
