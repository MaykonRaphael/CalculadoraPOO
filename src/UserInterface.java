import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private Calculator calculator;

  public UserInterface(Scanner scanner, Calculator calculator) {
    this.scanner = scanner;
    this.calculator = calculator;
  }

  public void run() {
    while (true) {
      int option = getOption();

      switch (option) {
        case 1:
          int num1 = getNumber("Digite o primeiro número:");
          int num2 = getNumber("Digite o segundo número:");
          int result = calculator.performCalculation(scanner, num1, num2);
          System.out.println("Resultado: " + result);
          break;
        case 2:
          calculator.displayHistory();
          break;
        case 3:
          System.out.println("Até mais!");
          scanner.close();
          return;
        default:
          System.out.println("Operação Invalida. Por favor tente novamente.");
      }
    }
  }

  private int getOption() {
    System.out.println("Escolha uma Opção:");
    System.out.println("1. Calcular");
    System.out.println("2. Histórico");
    System.out.println("3. Sair");
    System.out.println("Opção => ");

    return scanner.nextInt();
  }

  private int getNumber(String prompt) {
    System.out.println(prompt);
    return scanner.nextInt();
  }
}
