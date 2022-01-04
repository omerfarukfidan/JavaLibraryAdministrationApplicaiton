import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WithdrawManager {
    private JTextField txt_borrower;
    private JTextField txt_loaned;
    private JTextField txt_deadline;
    private JList list_loaned;
    private JButton btn_insert;
    private JLabel lbl_borrower;
    private JLabel lbl_loaned;
    private JLabel lbl_deadline;
    public JPanel panel_withdraw;
    private int counter=1;
    private JButton btn_display;
    DefaultListModel model1;
    private void readFile(String fileName)
    {
        String fileDataStr = "";

        try{
            FileReader fileReader = new FileReader(fileName);
            Scanner inFile = new Scanner(fileReader);

            while(inFile.hasNext() == true)
            {
                fileDataStr = fileDataStr + inFile.nextLine() + "\n";
                model1.addElement(fileDataStr);
                fileDataStr="";
            }
            inFile.close();
            fileReader.close();
        }
        catch(IOException error)
        {
            JOptionPane.showMessageDialog(null,"Error was handled...");
        }
    }
    public WithdrawManager() {



        model1=new DefaultListModel();
        list_loaned.setModel(model1);
        btn_insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model1.addElement(txt_borrower.getText()+", "+txt_loaned.getText()+", "+txt_deadline.getText());
                txt_borrower.setText("");
                txt_loaned.setText("");
                txt_deadline.setText("");
            }
        });
        btn_display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter==1)
                {
                    readFile("C:\\Users\\omerf\\Desktop\\LibraryApplication\\Gönderilen LibraryApplication\\LibraryApplication\\src\\WithdrawList.txt");
                    counter++;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"You can't display document more than once!");
                }
            }
        });
    }
}
