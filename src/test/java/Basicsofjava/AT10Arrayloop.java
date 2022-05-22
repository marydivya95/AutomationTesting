package Basicsofjava;

import org.junit.Test;

public class AT10Arrayloop {
    @Test
    public void ArrayLoop()
    {
        int[] age={ 10, 20, 30};
        int lengthofage =age.length;
        System.out.println(lengthofage);
        for(int i=0; i<lengthofage;i++)
        {
            System.out.println("array index age ["+i+"]=" +age[i]);
        }
    }
}
