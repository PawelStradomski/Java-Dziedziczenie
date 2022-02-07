
package dziedziczenie;

import dziedziczenie.Potwory.Potwor;


public class Protected extends Potwor
{
    void przykladProtected()
    {
        //tak dziala protected: mamy dostep do this.predkoscChodzenia, this.Atakuj();
        this.Atakuj();
    }
}
