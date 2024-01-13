package assignment;

public class MathematicalOperation {
int num1;
int num2;

    public MathematicalOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition(){
        System.out.println("This addition is:="+ (this.num1+this.num2));
    }

    public void subtraction(){
        System.out.println("This subtraction is:="+ (this.num1-this.num2));
    }

    public void multiplication(){
        System.out.println("This multiplication is:="+ this.num1*this.num2);
    }
    public void division(){
        System.out.println("This division is:="+ this.num1/this.num2);
    }


    public static void main(String[] args) {
        MathematicalOperation math = new MathematicalOperation(24,6);
        math.addition();
        math.subtraction();
        math.multiplication();
        math.division();



//        //Variable
//
//        int num1 = 10;
//        int num2 = 5;
//
//        // Performing Subtraction
//
//        int subresult = num1 - num2;
//
//        // Display the result
//
//        System.out.println("Result of subtraction:" + subresult);
//
//        // perform multiplication
//
//        int multiresult = num1 * num2;
//        System.out.println("Result of multiplication:"+ multiresult);
//    }
//
//
////    public void setResult(int result) {
////       this.result = result;
////    }
    }
}








