package OOPSConcepts;

public class AT07_InheritanceOverridding extends AT06_InheritanceChildclass {
    //we are overriding a method from AT06_Inheritance child calss
    //here Override means method name will be same but logic will be different
    //what ever we override that method will execute if we inherite that class
    public void childmethod2()
    {
        System.out.println("I am using this class method");
        AT06_InheritanceChildclass obj=new AT06_InheritanceChildclass();
        obj.childmethod2();
    }



}

