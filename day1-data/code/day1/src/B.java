class A {
    public static void main(String[] args) {
        System.out.println("In A's main...");
    }
}

public class B {
    public static void main(String[] args) {
        int data;// data : un initialized
        System.out.println(data);// javac err : does not allow accesing un-inited data members
    }
}

class C {

}
