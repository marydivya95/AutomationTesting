package LoopsConcept;

import org.junit.Test;

public class Elseif {

    @Test
    public void elseifmethod()

    {
        String Browser="Chrome";
        if(Browser.equalsIgnoreCase("FireFox")) {
            System.out.println("Ff");
        }
        else if(Browser.equalsIgnoreCase("Chrome"))
        {
            System.out.println(Browser);
        }
        else if(Browser.equalsIgnoreCase("ie"))
        {
            System.out.println("ie");
        }
        else{
            System.out.println("no internet");
        }


    }

}
