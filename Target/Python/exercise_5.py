# 5) Escreva um programa que inverta os caracteres de um string.

# IMPORTANTE:
# a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
# b) Evite usar funções prontas, como, por exemplo, reverse;

# Inverter os caracteres
def inverter_string(string):
    # Converter a string em uma lista
    caracteres = list(string)
    # Definir os índices inicial e final para inverter os caracteres
    inicio = 0
    fim = len(caracteres) - 1
    # Loop para inverter os caracteres
    while inicio < fim:
        # Trocar os caracteres de posição
        caracteres[inicio], caracteres[fim] = caracteres[fim], caracteres[inicio]
        # Atualizar os índices
        inicio += 1
        fim -= 1
    # Converter a lista para string
    string_invertida = ''.join(caracteres)
    return string_invertida

# Exemplo de uso
string_original = input("Escreva uma palavra ou frase: ")
string_invertida = inverter_string(string_original)
print("Original:", string_original,"\nInvertida:", string_invertida)
