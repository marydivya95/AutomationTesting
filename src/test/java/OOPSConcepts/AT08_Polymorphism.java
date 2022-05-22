package OOPSConcepts;

import org.junit.Test;

public class AT08_Polymorphism {
    @Test
    public int PolyMethod(int k)
    {
        int i=10;

        int j=i+k;
        return j;
    }
    @Test
    public void polymethod1()
    {

        System.out.println("This is polymethod1");
    }

    @Test
    public void polymethod2(int i, int j)
    {
        int k=i+j;
        System.out.println(k);
        //creating obj of class using methods

    }





}
