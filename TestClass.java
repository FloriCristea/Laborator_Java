import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

enum LOAD_TYPE {
    HARDCODAT, KEYBOARD, FILE
}

enum DISPLAY_TYPE {
    CONSOLA, FISIER, GUI
}

public class TestClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphic user interface");
        LoginForm loginForm = new LoginForm(frame);
        frame.setContentPane(loginForm.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JFrame frame2 = new JFrame("Graphic user interface");
        RegisterForm loginForm = new LoginForm(frame2);
        frame.setContentPane(loginForm.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(false);

    }
}

