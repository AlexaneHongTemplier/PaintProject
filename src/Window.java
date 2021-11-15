import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    public Color c;
    public Figure figure;
    public Window(String Title, int x, int y) {
        super(Title);
        this.setSize(x, y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();

        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        menu1.add(open);
        m.add(menu1);

        JButton BlackButton = new JButton("Noir");
        BlackButton.setBackground(Color.black);
        BlackButton.setForeground(Color.white);
        BlackButton.addActionListener(this);
        JButton RedButton = new JButton("Rouge");
        RedButton.setBackground(Color.red);
        RedButton.addActionListener(this);
        JButton GreenButton = new JButton("Vert");
        GreenButton.setBackground(Color.green);
        GreenButton.addActionListener(this);
        JButton BlueButton = new JButton("Bleu");
        BlueButton.setBackground(Color.blue);
        BlueButton.addActionListener(this);
        JButton EllipseButton = new JButton("Ellipse");
        EllipseButton.addActionListener(this);
        JButton CircleButton = new JButton("Cercle");
        CircleButton.addActionListener(this);
        JButton YellowButton = new JButton("Jaune");
        YellowButton.setBackground(Color.yellow);
        YellowButton.addActionListener(this);
        JButton PinkButton = new JButton("Rose");
        PinkButton.setBackground(Color.pink);
        PinkButton.addActionListener(this);
        JButton MagentaButton = new JButton("Magenta");
        MagentaButton.setBackground(Color.magenta);
        MagentaButton.addActionListener(this);
        JButton OrangeButton = new JButton("Orange");
        OrangeButton.setBackground(Color.orange);
        OrangeButton.addActionListener(this);
        JButton RectButton = new JButton("Rectangle");
        RectButton.addActionListener(this);
        JButton SqrButton = new JButton("Carré");
        SqrButton.addActionListener(this);




        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 6));
        southPanel.add(BlackButton);
        BlackButton.addActionListener(this);
        southPanel.add(RedButton);
        southPanel.add(GreenButton);
        southPanel.add(BlueButton);
        southPanel.add(EllipseButton);
        southPanel.add(CircleButton);
        southPanel.add(YellowButton);
        southPanel.add(PinkButton);
        southPanel.add(MagentaButton);
        southPanel.add(OrangeButton);
        southPanel.add(RectButton);
        southPanel.add(SqrButton);
        contentPanel.add(southPanel, "South");

        MyMenu MyMenuBar = new MyMenu(this);
        MyMenuBar.getMenu2().addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                    JOptionPane info = new JOptionPane();
                    info.showInternalMessageDialog(info, "Authors : Alexane Hong-Templier",
                        "information", JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        this.setVisible(true);
    }

    public static void main(String args[]) {
        Window win = new Window("Paint", 800, 600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e);
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Noir":
                c = Color.black;
                break;
            case "Rouge":
                c = Color.RED;
                break;
            case "Vert":
                c = Color.green;
                break;
            case "Bleu":
                c = Color.blue;
                break;
            case "Jaune":
                c = Color.yellow;
                break;
            case "Rose":
                c = Color.pink;
                break;
            case "Magenta":
                c = Color.magenta;
                break;
            case "Orange":
                c = Color.orange;
                break;
            case "Ellipse":
                figure = new Ellipse(c,new fr.ensea.projet2A.Point());
                break;
            case "Cercle":
                figure = new Circle(c,new fr.ensea.projet2A.Point());
                break;
            case "Rectangle":
                figure = new Rectangle(c,new fr.ensea.projet2A.Point());
                break;
            case "Carré":
                figure = new Square(c,new fr.ensea.projet2A.Point());
                break;

        }
    }
}
