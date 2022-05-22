package OOPSConcepts;

import org.junit.Test;

public class AT04_Encapsulation04 {
    @Test
    public void Encap04()
    {
        AT03_Encapsulation03 AT03=new AT03_Encapsulation03();
                int i =AT03.Encapsulation(10,20);
                System.out.println((i+10));
                AT03.Encapsulationmethod(11,12);
    }

}
