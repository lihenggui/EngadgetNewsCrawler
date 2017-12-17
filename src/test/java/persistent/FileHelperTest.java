package persistent;


import controller.Controller;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class FileHelperTest {

    private FileHelper helper;

    @After
    public void tearDown() throws Exception {
    }



    @Before
    void setUp() throws Exception{
        helper = new FileHelper(Controller.crawlStorageFolder);
    }

    @Test
    public void testFileHelper(){

    }

}