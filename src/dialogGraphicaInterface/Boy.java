package dialogGraphicaInterface;

public class Boy extends Human{

    public  Boy(double w,double h, String name){
        super(w,h,name);
    }

    public String flower(){
        return (name+":"+"Give floer");
    }

    public String cinema(){
        return (name+":"+"Let's go to the cinema");
    }
}
