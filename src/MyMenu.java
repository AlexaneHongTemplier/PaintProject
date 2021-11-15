
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MyMenu {

    JMenu menu1, menu2;
    JMenuItem New, Open, Save, Quit;

    public JMenu getMenu1() {
        return menu1;
    }

    public JMenu getMenu2() {
        return menu2;
    }

    public MyMenu(JFrame f) {
        JMenuBar mb = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("A propos");

        New = new JMenuItem("New");
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Quit = new JMenuItem("Quit");

        menu1.add(New);
        menu1.add(Open);
        menu1.add(Save);
        menu1.addSeparator();
        menu1.add(Quit);

        mb.add(menu1);
        mb.add(menu2);

        f.setJMenuBar(mb);



    }

}
