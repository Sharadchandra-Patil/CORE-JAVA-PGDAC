import java.util.Scanner;

class TestBox {
    public static void main(String[] args) {
        // create a scanner to wrap console i/p
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Box dims : w d h");
        Box b1;// b1 : reference type (class type of ref),method local var
        // stack (stack frm of main method) :how many bytes : as per JVM spec.
        // System.out.println(b1);// javac err : trying to access un-inted var
        b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        // display box dims
        System.out.println(b1.getBoxDimensions());
        // display computed volume
        System.out.println("Volume " + b1.getBoxVolume());
        // close scanner
        sc.close();
    }
}
