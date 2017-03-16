import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*
 * Created by Ria on 2017.03.02..
 */
public class HatekonyLeghosszabb3Test  {
    HatekonyLeghosszabb3 hatekonyLeghosszabb3 = new HatekonyLeghosszabb3();


    @Test
    public void testMain() throws Exception {
        assertEquals("AA",hatekonyLeghosszabb3.leghosszabb("almafaa"));

    }

    @Test
    public void testMain2() throws Exception {
        assertEquals("LLLLLL",hatekonyLeghosszabb3.leghosszabb("AABBBCCCCDDXDDDDDNJKLLLLLL"));
    }

    @Test
    public void testMain3() throws Exception {
        assertNotEquals("F",hatekonyLeghosszabb3.leghosszabb("almafaa"));
    }


    @Test
    public void testMain4() throws Exception {
        assertEquals("CCCC",hatekonyLeghosszabb3.leghosszabb("AABBBCCCCDD"));
    }

    @Test
    public void testMain5() throws Exception {
        assertNotEquals("BBB",hatekonyLeghosszabb3.leghosszabb("AABBBCCCCDD"));
    }

    @Test
    public void testMain6() throws Exception {
        assertNotEquals("BB",hatekonyLeghosszabb3.leghosszabb("AABBCCDD"));
        assertEquals("DD",hatekonyLeghosszabb3.leghosszabb("AABBCCDD"));
    }


    @Test
    public void testMain7() throws Exception {
        assertEquals("",hatekonyLeghosszabb3.leghosszabb(""));

    }

}






