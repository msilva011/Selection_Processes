/*def verifica_fibonacci(numero):
    a = 0
    b = 1

    while a <= numero:
        if a == numero:
            return True
        c = a + b
        a = b
        b = c

    return False

# Número a ser verificado se pertence à sequência de Fibonacci
numero_verificar = int(input("Digite um valor: "))

if verifica_fibonacci(numero_verificar):
    print(f"{numero_verificar} pertence à sequência de Fibonacci.")
else:
    print(f"{numero_verificar} não pertence à sequência de Fibonacci.")
 */

public class Fibonacci {


  private boolean verifica_fibonacci(int number){

     int a = 0;
     int b = 1;
     int c;

    while (a <= number){
      if(a == number){
        return true;
      }
    c = a + b;
    a = b;
    b = c;
    
    }
    return false;
  }

  public void verifica_number(int n){
    verifica_fibonacci(n);

    if(verifica_fibonacci(n) == true){
      System.out.println("O numero " + n + " digitado, pertence a sequencia Fibonacci!");
    }else{
      System.out.println("O numero " + n + " digitado, NAO pertence a sequencia Fibonacci!");
    }
  }

}

    

