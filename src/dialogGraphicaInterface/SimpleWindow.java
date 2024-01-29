package dialogGraphicaInterface;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow extends JFrame {
    public String dialog;
    private  static final  String TEXT ="Vot eto vstrecha";
    public SimpleWindow(){
        super("диалог");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        setContentPane(panel);


        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dialog;
                Girl liza = new Girl(40,150,"Liza");
                Boy ivan =new Boy(50,150,"Ivan");
                System.out.println(TEXT);
                dialog = liza.hello()+'\n'+ivan.hello(liza.name)+'\n'+ivan.flower()+'\n'+ivan.cinema()+'\n'+liza.yes();
                System.out.println(dialog);

                JOptionPane.showMessageDialog(null, TEXT +'\n'+ dialog);
            }
        });


        panel.add(button);

        setSize(250,100);
    }
}
