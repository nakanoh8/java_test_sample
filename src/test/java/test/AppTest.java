package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // @Mock
    // App2 aap2 = new App2();
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        // assertTrue( true );
        
        assertEquals("Hello Mikkiii", new App().hello());
    }
}
