package Basicsofjava;

import org.junit.Test;

public class AT05_CreateObjectAndUseIt {

    @Test
    public void object()
    {
        AT05_CreateObjectAndUseIt obj1=new AT05_CreateObjectAndUseIt();
        obj1.object1();

    }
    public void object1()
    {
        int i=1;
        int j =2;
        int k= i+j;
        System.out.println(k);
    }
}
