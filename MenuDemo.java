//JMenu
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuDemo implements ActionListener
{
JFrame f;
JMenuBar mb;
JMenu file, edit, help;
JMenuItem New, Open;
JMenuItem Cut, Copy, Paste, SelectAll;
JTextArea ta;

MenuDemo()
{
f=new JFrame();
New=new JMenuItem("New");
Open=new JMenuItem("Open");
Cut=new JMenuItem("Cut");
Copy=new JMenuItem("Copy");
Paste=new JMenuItem("Paste");
SelectAll=new JMenuItem("SelectAll");

New.addActionListener(this);
Open.addActionListener(this);
Cut.addActionListener(this);
Copy.addActionListener(this);
Paste.addActionListener(this);
SelectAll.addActionListener(this);

mb=new JMenuBar();
file=new JMenu("File");
edit=new JMenu("Edit");
help=new JMenu("Help");

file.add(New);
file.add(Open);
edit.add(Cut);
edit.add(Copy);
edit.add(Paste);
edit.add(SelectAll);
mb.add(file);
mb.add(edit);
mb.add(help);

ta=new JTextArea();
ta.setBounds(5, 5, 360, 320);
f.add(mb);
f.add(ta);
f.setJMenuBar(mb);
f.setLayout(null);
f.setSize(400, 400);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==Cut)
ta.cut();
if(e.getSource()==Paste)
ta.paste();
if(e.getSource()==Copy)
ta.copy();
if(e.getSource()==SelectAll)
ta.selectAll();
}

public static void main(String[] args)
{
new MenuDemo();
}
}




//ArrayList Iterators
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterators
{
public static void main(String[] args)
{
ArrayList<Integer> a=new ArrayList<Integer>();

for(int i=0;i<10;i++)
a.add(i);
System.out.println(a);

//At beginning itr(cursor) will point to index just before the first element in a
Iterator itr=a.iterator();

//Checking the next element availability
while(itr.hasNext())
{
//Moving cursor to next element
int i=(Integer)itr.next();

//Getting even elements one by on
System.out.print(i+" ");

//Removing odd elements
if (i%2!=0)
itr.remove();
}

System.out.println();
System.out.println(a);
}
}
