import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RoomManager{
    JFrame f;
    private JTable table1;
    private JPanel panel1;
    private JTextField kitaptxt,konumtxt,uytxt;
    private JLabel Number,Hirer,Hour;
    private JButton ekleButton;
    int i=0;
    RoomManager(){
        f=new JFrame();
        this.f.setBackground(Color.white);
        f.setResizable(false);

        Number=new JLabel("Room Number");
        Number.setBounds(40,600,200,20);
        f.add(Number);
        Hirer=new JLabel("Room Hirer");
        Hirer.setBounds(40,620,200,20);
        f.add(Hirer);
        Hour=new JLabel("Checkout Time");
        Hour.setBounds(40,640,200,20);
        f.add(Hour);
        kitaptxt = new JTextField();
        kitaptxt.setBounds(130,600,200,20);
        f.add(kitaptxt);
        konumtxt = new JTextField();
        konumtxt.setBounds(130,620,200,20);
        f.add(konumtxt);
        uytxt = new JTextField();
        uytxt.setBounds(130,640,200,20);
        f.add(uytxt);
        ekleButton = new JButton();
       ekleButton.setBounds(30,660,70,30);
       ekleButton.setText("Insert");
       f.add(ekleButton);


        DefaultTableModel model = new DefaultTableModel();
        JTable table1 = new JTable(model);
        table1.setBounds(30,40,200,300);
        model.addColumn("Room Number");
        model.addColumn("Room Hirer");
        model.addColumn("Checkout Time");


        f.add(new JScrollPane(table1));
        f.setSize(800,800);
        f.setVisible(true);

        ekleButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                model.insertRow(i,new Object[]{kitaptxt.getText(),konumtxt.getText(),uytxt.getText()});
                kitaptxt.setText("");
                konumtxt.setText("");
                uytxt.setText("");

                i++;
            }
        });

    }


}  