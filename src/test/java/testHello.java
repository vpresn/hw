import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vpresniakov on 06.06.2016.
 */
public class testHello {
    @Test
    public void test1(){
        Hello h = new Hello();
        assert h.st.equals("Hello");
    }
    @Test
    public void test2(){
        Hello h = new Hello();
        assertEquals("Error text not Equals", h.getStr(), "Hello world");
    }
}
