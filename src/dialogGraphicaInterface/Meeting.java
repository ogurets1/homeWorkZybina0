package dialogGraphicaInterface;
import java.io.IOException;
public class Meeting {
    public String dialog;
    private  static final  String TEXT ="Vot eto vstrecha";
    public static void main(String[] args) throws IOException{
        String dialog;
        Girl liza = new Girl(40,150,"Liza");
        Boy ivan =new Boy(50,150,"Ivan");
        System.out.println(TEXT);
        dialog = liza.hello()+'\n'+ivan.hello(liza.name)+'\n'+ivan.flower()+'\n'+ivan.cinema()+'\n'+liza.yes();
        System.out.println(dialog);
    }
}
