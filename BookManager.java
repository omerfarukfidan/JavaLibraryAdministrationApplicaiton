import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BookManager {

    private JTextField txt_book;
    private JButton btn_removeBook;
    private JButton btn_addBook;
    private JButton btn_selectedRemove;
    private JList lst_books;
    private JLabel lbl_bookName;
    public JPanel panel2;
    private JLabel lbl_authorName;
    private JTextField txt_author;
    private JTextField txt_paper;
    private JLabel lbl_paper;
    private JButton btn_display;
    DefaultListModel model;
    public int counter=1;
    private void readFile(String fileName)
    {
        String fileDataStr = "";

        try{
            FileReader fileReader = new FileReader(fileName);
            Scanner inFile = new Scanner(fileReader);

            while(inFile.hasNext() == true)
            {
                fileDataStr = fileDataStr + inFile.nextLine() + "\n";
                model.addElement(fileDataStr);
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

    public BookManager() {
         model=new DefaultListModel();
         lst_books.setModel(model);


        btn_addBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                model.addElement(txt_book.getText()+", "+txt_author.getText()+", "+txt_paper.getText());
                txt_book.setText("");
                txt_author.setText("");
                txt_paper.setText("");



            }
        });
        btn_removeBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.removeElement(txt_book.getText()+", "+txt_author.getText()+", "+txt_paper.getText());
                txt_book.setText("");
                txt_author.setText("");
                txt_paper.setText("");

            }
        });
        btn_selectedRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index=lst_books.getSelectedIndex();//eğer herhangibir şey seçilmediyse fonksiyon -1 döndürür

                if(index!=-1)
                {
                    model.remove(index);

                }
                else
                {
                   //JOptionPane pnl1=new JOptionPane();
                   JOptionPane.showMessageDialog(null,"Book didn't choose!","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btn_display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter==1)
                {
                    readFile("C:\\Users\\omerf\\Desktop\\LibraryApplication\\Gönderilen LibraryApplication\\LibraryApplication\\src\\BookList.txt");
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
