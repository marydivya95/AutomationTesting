package OOPSConcepts;

import org.junit.Test;

public class AT09_polyoverloading {
    @Test
            public void polymethods() {
        AT08_Polymorphism obj = new AT08_Polymorphism();
       int l= obj.PolyMethod(4);
       System.out.println(l);
        obj.polymethod1();
        obj.polymethod2(3,6);

    }
}
