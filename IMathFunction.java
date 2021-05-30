package lambdaexpression;

@FunctionalInterface
interface IMathFunction{
    int calculate(int a,int b);
    static void printResult(int a, int b, String function, IMathFunction fobj) {
        System.out.println("Result of "+function+" is"+fobj.calculate(a, b));
    }
}
public class MathOperation {
    public static void main(String[] args) {
        //This method implements "IMathFunction" interface
        IMathFunction add =  Integer::sum;
        //This expression implements 'IMathFunction'
        IMathFunction multiply = (x,y) -> x * y;
        IMathFunction divide = (int x , int y) -> x/y;

        //Add & Divide two numbers using lambda expression
        System.out.println("Addition is " + add.calculate(6,3));
        System.out.println("Multiplication is " + multiply.calculate(2,3));
        System.out.println("Division is " + divide.calculate(9,3));

        //Passing lambda expression as function parameter to print using static function
        IMathFunction.printResult(6, 3, "Addtion", add);
        IMathFunction.printResult(4, 2, "Multiplication", multiply);
        IMathFunction.printResult(9, 3, "Division", divide);
    }
}
