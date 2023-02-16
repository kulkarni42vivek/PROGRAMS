package Basic;

/*main features-
multithreaded
oops
java-> compiler -> byte code*/

/*jdk jre jvm
jvm inside jre inside jdk*/

//jit compiler

public class BasicInfo {

    static int staticVariable = 12;

    void print(){
        int localVarible = 78 ;
    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        /*varibles types ->
        local varible,  static vairalbe , instance variable*/

        int instanceVarible = 10 ;

        // widening
        int value = 45;
        float a = value;

        // overflow of the variable value
        int b=130;
        byte c=(byte)b;

        // data types in the java
        // primitives - > int , byte, short , long , float , boolean , double , char
        // non primitive -> Integeer , string , objects


        // operators in java
        // example - > unary , arithmatic , logical , shift , relational , ternary , bitwise , assignment

        // operator precedence
        // unary > arithmatic > shift > relational > bitwise > logical > ternary > asignment

        // keyword - > default words by java


    }
}
