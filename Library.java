import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;




public class Library {
    private JButton btn_1;
    private JTextField txt_2;
    private JTextField txt_1;
    private JPanel panel;
    private JLabel lbl_icon;


    JFrame frame;

    public void disposeJFrame(JFrame frame2)
    {

        frame2.setVisible(false);
        frame2.dispose();
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Administration Panel");
        frame.setContentPane(new Library().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,150);

    }

    public Library() {

        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txt_2.getText().equals("a")&txt_1.getText().equals("1"))
                {

                    JFrame frame1 = new JFrame("Library Administration Panel");
                    frame1.setContentPane(new SecondMenu().panel1);
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame1.pack();
                    frame1.setVisible(true);
                    frame1.setResizable(false);
                    frame1.setSize(600,600);


                }
                else
                    JOptionPane.showMessageDialog(panel,"Username or password is wrong!","Error",JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}



