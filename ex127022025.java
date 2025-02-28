// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Yusef Gonzalez");
    System.out.println("Integer: " + 10 + 
                       "\n Double: " + 3.14 +
                       "\n Boolean: " + true);
    // Variables tipadas (declaradas)
    int numInt = 9;
    double numDouble = 8.4;
    boolean numBoolean = false;
    char numChar = 'A'; // single quotes for char
    String numString = "Yusef"; // String is a class
    byte edad = 23; 
    short numShort = 3; 
    long numLong = 3;
    // int[ ] numArray = {1, 2, 3, 4, 5}; 
    // String[ ] numArray2 = {"Yusef", "Gonzalez", "Triana"}; 
    
    
    System.out.println("tInteger: " + numInt + 
       "\n tDouble: " + numDouble +
       "\n tBoolean: " + numBoolean + 
       "\n tChar: " + numChar +
       "\n tString: " + numString +
       "\n tByte: " + edad +
       "\n tShort: " + numShort +
       "\n tLong: " + numLong );

    int num1 = 5;
    int num2 = 2;
    int suma = num1 + num2;
    int resta = num1 - num2; 
    int mult = num1 * num2;
    double div = 10 / 3;
    int mod = num1 % num2;
    System.out.println("Suma: " + 
                       suma + 
                       "\n Resta: " +  resta +
                       "\n Multiplicacion: " + mult +
                       "\n Division: " + div +
                       "\n Modulo: " + mod);
    
    
  }

  
}
