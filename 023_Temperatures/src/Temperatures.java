
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        //BEGIN SOLUTION
        while (true){
        System.out.println("Enter a number: ");
        double number = Double.parseDouble(reader.nextLine());
        
        if(number>-30 && number < 40)
            Graph.addNumber(number);
        }
        //END SOLUTION
        //STUB: //while the number are betwen -29 and 39 add the numbre to graphic whith Graph class
        //STUB: Graph is used as follows:
        //STUB: Graph.addNumber(7);
        //STUB: double value = 13.5;
        //STUB: Graph.addNumber(value);
        //STUB: value = 3;
        //STUB: Graph.addNumber(value);
        //STUB: Remove or comment out these lines above before trying to run the tests.
    }
}