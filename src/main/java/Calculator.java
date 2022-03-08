import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Calculator {



    //add
    public double add(double a, double b){
        return a+b;
    }

    public double addList(List<Double> allNumsToAdd){
        double total = 0;

        for(int i=0; i < allNumsToAdd.size(); i++){
            total = total+allNumsToAdd.get(i);
        }

        return total;
    }

    //subtract
    public double subtract(double a, double b){
        return a-b;
    }

    //multiply
    public double multiply(double a, double b){
        return a*b;
    }

    //divide
    public double divide(double a, double b){
        return a/b;
    }

    //squareroot
    public double squareRoot(double a){
        return Math.sqrt(a);
    }


}


