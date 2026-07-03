package OOPS.STATIC;

public class InnerClasses {
     static class TestClass{
        String name;

         public TestClass(String name) {
             this.name = name;
         }
     }

    public static void main(String[] args) {
         InnerClasses cla = new InnerClasses();

        TestClass a = new TestClass("dhanush");
        TestClass b = new TestClass("raj");
    }


}


