package Basicsofjava;

import org.junit.Test;

public class AT04_GlobalVariables {
    int i=2;
    int j=20;
    @Test
    public void GlobalVariables()
    {
        int k=3;
        int q=i*k;
        System.out.println(q);
    }
    @Test
    public void variables()
    {
        int l=i+j;

        System.out.println(l);
    }
}
