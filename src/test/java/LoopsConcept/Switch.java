package LoopsConcept;

import org.junit.Test;

public class Switch {
    @Test
      public void SwitchMethod()
    {
        switch(4)
        {
            case 1:
            System.out.println(("switch one"));
            case 2:
            System.out.println(("switch two"));
            case 3:
            System.out.println(("switch three"));
            case 4:
            System.out.println(("switch four"));
            break;
            default:System.out.println("defalt value");
        }

    }
}
