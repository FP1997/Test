package figury;


public class Figury {

   
    public static void main(String[] args) {
        Figury_plaskie prostokat = new Figury_plaskie(5.2, 8.3, 7.7, "prostokat");
        prostokat.dane_figury("prostokat");
        prostokat.details();
        
        Figury_przestrzenne szescian = new Figury_przestrzenne(7.7, 7.7, 7.7, 7.7, "kwadrat");
        szescian.objetosc();
        szescian.details();
        //System.out.println(pole);
    }
    
}
