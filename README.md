# exemplo5-Interface-DefaultMethods

Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. Informar o valor a ser pago depois de decorrido o prazo do empréstimo, conforme regras de juros do Brasil. A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.

Veja o exemplo.

Quantia: 200,00

Meses: 3

O empréstimo é no (1)Brasil ou (2)USE? 1

Pagamento apos 3 meses:

212,24


Cálculos: 

pagamento =  200 * 1.02 * 1.02 * 1.02 = 200 * 1.023 = 212,2416

Pagamento = valor * (1 + taxaJuro / 100)N


*** E se existisse outro serviço de juros de outro pais, por exemplo, USE?

Veja o exemplo.

Quantia: 200.00

Meses: 3

O empréstimo é no (1)Brasil ou (2)USE? 2

Pagamento apos 3 meses:

206.06


Cálculos:

pagamento =  200 * 1.01 * 1.01 * 1.01 = 200 * 1.013 = 206,0602

Pagamento = valor * (1 + taxaJuro / 100)N

