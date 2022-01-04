import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondMenu{

    public JPanel panel1;

    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JLabel lbl_icon1;
    private JLabel lbl_icon2;


    public SecondMenu() {
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Library");
                frame2.setContentPane(new BookManager().panel2);
                frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame2.pack();
                frame2.setVisible(true);
                frame2.setResizable(false);
                frame2.setSize(800,800);
            }
        });

            btn_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new RoomManager();
                }


            });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new JFrame("Library");
                frame3.setContentPane(new WithdrawManager().panel_withdraw);
                frame3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame3.pack();
                frame3.setVisible(true);
                frame3.setResizable(false);
                frame3.setSize(800,800);
            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
