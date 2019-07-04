package lt.bta;

public class Main {
    public static void main(String[] args) {

        new Main().start();
    }

    public void start(){
        System.out.println("Hello world");
        PersonKt.printHello();
        System.out.println();
        try{
        double n1 = calculator("^",2,4);
        System.out.println(n1);}
        catch (ArithmeticException e){
            System.out.println("kazkas negerai " + e.getMessage());
        }
    }

    /**
     * Calculator
     * @param op operation
     * @param a first operand
     * @param b second operand
     * @return returns result
     */
    public double calculator(String op, double a, double b){
        if (op.equals("+")) return a+b;
        else if (op.equals("-")) return a-b;
        else if (op.equals("*")) return a*b;
        else if (op.equals("/")) return a/b;
        else if (op.equals("**")) return Math.pow(a,b);
        else throw new ArithmeticException("Unknown operation");
    }
}
