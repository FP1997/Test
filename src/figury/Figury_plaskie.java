package figury;

public class Figury_plaskie {
    
    protected double a;
    protected double b;
    protected double h;
    protected String nazwa_figury;
    protected double pole;
    protected double obwod;

    public Figury_plaskie() {
        this.a = 0; 
        this.b = 0;
        this.h = 0;
        this.nazwa_figury = "Brak";
        this.pole = 0;
        this.obwod = 0;
    }

    public Figury_plaskie(double a, double b, double h, String nazwa_figury) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.nazwa_figury = nazwa_figury;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double dane_figury(String nazwa_figury){
        
        if("kwadrat".equals(nazwa_figury))
        {
            this.pole = this.a * this.a;
            this.obwod = this.a * 4;
        }
        else if("prostokat".equals(nazwa_figury))
        {
            this.pole = this.a * this.b;
            this.obwod = this.a * 2 + this.b * 2;
        }
        else if("rownoleglobok".equals(nazwa_figury))
        {
            this.pole = this.a * this.h;
            this.obwod = this.a * 2 + this.b * 2;
        }
        else if("romb".equals(nazwa_figury))
        {
            this.pole = this.a * this.h;
            this.obwod = this.a * 4;
        }
        return this.pole;
    }

    
    @Override
    public String toString() {
        return " Podstawa - Figura_plaska: " + " a= " + a + ", b= " + b + ", h= " + h + ", nazwa_figury= " + nazwa_figury + ", pole= " + pole + ", obwod= " + obwod;
    }

   public void details(){
        
        System.out.println(this);
    }
    
    
}
