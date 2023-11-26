import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
  private ArrayList<String> history = new ArrayList<>();

  public int performCalculation(Scanner scanner, int num1, int num2) {
    System.out.println("Escolha uma operação:");
    System.out.println("1. Somar");
    System.out.println("2. Subtrair");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("Opção => ");

    int operation = scanner.nextInt();
    scanner.nextLine();
    
    String operationStr = convertOperation(operation);

    int result = calculate(operation, num1, num2);

    if (result != -1) {
      history.add("Resultado da operação " + num1 + " " + operationStr + " " + num2 + " = " + result);
    }

    return result;
  }

  private int calculate(int operation, int num1, int num2) {
    switch (operation) {
      case 1:
        return num1 + num2;
      case 2:
        return num1 - num2;
      case 3:
        return num1 * num2;
      case 4:
        if (num2 == 0) {
          System.out.println("Error: Divisão por zero não é permitida.");
          return -1;
        } else {
          return num1 / num2;
        }
      default:
        System.out.println("Operação Invalida. Por favor tente novamente.");
        return -1;
    }
  }
  
  private String convertOperation(int operation) {
	switch(operation) {
		case 1:
			return "+";
		case 2:
			return "-";
		case 3:
			return "*";
		case 4:
			return "/";
		default:
			return "Erro na operação!";
	}
  }

  public void displayHistory() {
    for (String h : history) {
      System.out.println(h);
    }
  }
}