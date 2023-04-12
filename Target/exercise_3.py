# 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
# • O menor valor de faturamento ocorrido em um dia do mês;
# • O maior valor de faturamento ocorrido em um dia do mês;
# • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

# IMPORTANTE:
# a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
# b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

import json

# Exemplo faturamento diário
faturamento_diario = [1000, 1500, 1200, 800, 1700, 2280.98, 1400, 1800, 1300, 1900, 1600, 1100, 0, 0, 0, 0]

# Função calcular menor faturamento
def calcular_menor_faturamento(faturamento_diario):
    return min(faturamento_diario)

# Função calcular maior faturamento
def calcular_maior_faturamento(faturamento_diario):
    return max(faturamento_diario)

# Função calcular dias com faturamento acima da média
def calcular_dias_acima_media(faturamento_diario):
    dias_com_faturamento = [valor for valor in faturamento_diario if valor > 0] # Exclui os dias sem faturamento
    media_mensal = sum(dias_com_faturamento) / len(dias_com_faturamento)
    dias_acima_media = sum(1 for valor in dias_com_faturamento if valor > media_mensal)
    return dias_acima_media

# Função carregar os dados em formato JSON
def carregar_faturamento_mensal_json(file_path):
    with open(file_path, 'r') as file:
        dados_faturamento = json.load(file)
    return dados_faturamento['faturamento_diario']

#faturamento_diario = carregar_faturamento_mensal_json('dados_faturamento.json')

# Calcular e imprimir os resultados
print("\nMenor valor de faturamento: R$", calcular_menor_faturamento(faturamento_diario),
"\nMaior valor de faturamento: R$", calcular_maior_faturamento(faturamento_diario),
"\nNumero de dias com faturamento acima da media: ", calcular_dias_acima_media(faturamento_diario))