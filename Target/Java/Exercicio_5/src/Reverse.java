// # Inverter os caracteres
// def inverter_string(string):
//     # Converter a string em uma lista
//     caracteres = list(string)
//     # Definir os índices inicial e final para inverter os caracteres
//     inicio = 0
//     fim = len(caracteres) - 1
//     # Loop para inverter os caracteres
//     while inicio < fim:
//         # Trocar os caracteres de posição
//         caracteres[inicio], caracteres[fim] = caracteres[fim], caracteres[inicio]
//         # Atualizar os índices
//         inicio += 1
//         fim -= 1
//     # Converter a lista para string
//     string_invertida = ''.join(caracteres)
//     return string_invertida

// # Exemplo de uso
// string_original = input("Escreva uma palavra ou frase: ")
// string_invertida = inverter_string(string_original)
// print("Original:", string_original)
// print("Invertida:", string_invertida)
import java.util.Scanner;

public class Reverse {

    private String strInvertida;
    // Método para inverter os caracteres
    public void  inverterString(String string) {
        // Converter a string em uma array de caracteres
        char[] caracteres = string.toCharArray();
        // Definir os índices inicial e final para inverter os caracteres
        int inicio = 0;
        int fim = caracteres.length - 1;
        // Loop para inverter os caracteres
        while (inicio < fim) {
            // Trocar os caracteres de posição
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            // Atualizar os índices
            inicio++;
            fim--;
        }
        // Converter o array de caracteres de volta para string
        String stringInvertida = new String(caracteres);
        String finalizadoReverse= stringInvertida;

        this.setStrInvertida(finalizadoReverse);
    }
    public String getStrInvertida() {
      return strInvertida;
    }
    public void setStrInvertida(String strInvertida) {
      this.strInvertida = strInvertida;
    }
    
}
