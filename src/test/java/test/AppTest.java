package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.Console;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Spy
    private App2 app2;
    @InjectMocks
    private App app;
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        MockitoAnnotations.initMocks(this);
        // assertTrue( true );
        when(app2.helloApp2()).thenReturn("333");
        // App3 app3 = mock(App3.class);
        assertEquals("333", app.hello());
    }
}
