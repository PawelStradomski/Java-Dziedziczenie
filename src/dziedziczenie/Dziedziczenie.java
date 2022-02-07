
package dziedziczenie;

import dziedziczenie.Potwory.Pajak;
import dziedziczenie.Potwory.Potwor;


public class Dziedziczenie
{

    
    public static void main(String[] args) {
        Potwor p = new Potwor();
//        System.out.println(p.predkoscChodzenia);//dzialanie "protected double predkoscChodzenia"
        System.out.println(p.zywotnosc);
        
        Pajak x = new Pajak(20,20);
//        System.out.println(x.predkoscChodzenia);//tak dziala "protected"
        System.out.println(x.zywotnosc);
//        x.Atakuj();                             //tak dziala protected
        
        //Polimorfizm:
        Potwor p2 = new Pajak();
//        p2.Atakuj();                            //tak dziala protected
        
        
        
        
        
    }
    
}
