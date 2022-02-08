
package dziedziczenie.Potwory;
/**
 * 
 * @author pawelstradomski
 */

public class Pajak extends Potwor
{
    public Pajak()
    {
        System.out.println("domyslny konstruktor z klasy Pajak");
        
    }
    public Pajak(double predkoscChodzenia, double zywotnosc)
    {
        super(predkoscChodzenia, zywotnosc);
        System.out.println("Nie domyslny konstruktor z klasy Pajak");    
    }

    
    @Override
    protected void Atakuj()
    {
        System.out.println("Metoda atakuj z klasy pajak");
        
    }
}
