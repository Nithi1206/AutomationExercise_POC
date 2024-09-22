package Hooks;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

    @Before
    public void starUp(){
        launchBrowser();
        launchurl();
        maximize();
        implicitWait();
    }

    @After
    public void last(){
        quiteBrowswer();
    }
}
