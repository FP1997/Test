package figury;

public class Figury_przestrzenne extends Figury_plaskie{
    
    private double H;
    private double obj;
    private String nazwa_podstawy;

    public Figury_przestrzenne() {
        super();
        this.H = 0;
        this.obj = 0;
        nazwa_podstawy = "Brak";
    }

    public Figury_przestrzenne(double a, double b, double h, double H, String nazwa_figury) {
        super(a, b, h, nazwa_figury);
        this.nazwa_podstawy = super.nazwa_figury;
        this.H = H;
    }

    public String getNazwa_podstawy() {
        return nazwa_podstawy;
    }

    public void setNazwa_podstawy(String nazwa_podstawy) {
        this.nazwa_podstawy = nazwa_podstawy;
    }
    
    public double geth() {
        return H;
    }

    public void seth(double H) {
        this.H = H;
    }
    
    
    
    public double objetosc(){
         
    this.obj = super.dane_figury(this.nazwa_podstawy) * this.H;
    return this.obj;
    }

    
    @Override
    public String toString() {
        return "Figura_przestrzenna: " + "H: " + H + ", obj: " + obj + ", Dane_podstawy= " + super.toString();
    }

    public void details(){
        
        System.out.println(this);
    }
    
    
    
}
