package components;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TyresTest {

    private  Tyres tyres;
    @Before
    public void before(){
        tyres = new Tyres(20.00, "Summer");
    }
    @Test

    public void canGetTyresWidth(){
        assertEquals(20.00, tyres.getWidth(),0.00);
    }
    @Test

    public void canGetSeason(){
        assertEquals("Summer", tyres.getSeasons());
    }
}
