
package dziedziczenie.Potwory;
/**
 * 
 * @author pawelstradomski
 */

public class Potwor {
    protected double predkoscChodzenia = 90;
    public double zywotnosc = 90;
    
    protected void Atakuj()
    {
        System.out.println("Metoda atakuj z klasy Potwor");
    }
    public Potwor()
    {
        System.out.println("domyslny konstruktor klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Nie domyslny konstruktor z klasy Potwor");
    }
}
