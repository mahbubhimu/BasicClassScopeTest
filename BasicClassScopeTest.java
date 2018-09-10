//There is two things in a class one is Member Variable and Another is Member Method
//Member Variable store data
//All work performed in a class must be inside a method.
class Test{
    int a;
    void display(){
        System.out.println("Display");
    }
}
class ClassScopeTest{
    void print(){
        Test obj_test = new Test();
        obj_test.display();
    }
    //(wrong)obj_test.display(); Must be inside a method
}
public class Demo{
    public static void main(String[] args) {
        //Any work performed by a class must be inside a method
        ClassScopeTest objClassScopeTest = new ClassScopeTest();
        objClassScopeTest.print();
    }
}
