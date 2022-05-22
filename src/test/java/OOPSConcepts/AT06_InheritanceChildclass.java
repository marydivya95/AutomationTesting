package OOPSConcepts;

import org.junit.Test;

public class AT06_InheritanceChildclass extends AT05_Inheritance
{
    // Here we are inheriting parent class methods into child class
    //we use Extends keysword to inherit parent class
    //if we inherits parent methods will exicute and child methods will execute
    @Test
    public void ChildMethod()
    {
        System.out.println("I am child ");

    }

    // this method i am overiding in AT07
    //but if i need to use exact this method then create obj for this class and use it
    @Test
    public void childmethod2()
    {
        System.out.println("i am child 2");
    }
}
