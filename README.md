## About

This was a code challenge I coded during a job interview. 
I had the challenge prior to the interview but could not code anything before.
The challenge should be coded in Java with a mock database.
It was used mostly to analyse how I dealt with pair programming with a junior developer and how I structured and designed the solution.

## Challenge

A hotel network in miami wishes to offer a reservation service on the internet.
The network is composed by three hotels:
Lakewood (3 stars): for 'reward' clients charges R$80 for weekdays and R$80 during weekends. Regular clients are charged R$110 during weekdays and R$90 on weekends; 
Bridgewood (4 stars): for 'reward' clients charges R$110 during weekdays and R$50 during weekends. Regular clients are charged R$160 during weekdays and R$60 on weekends; 
Ridgewood (4 stars): for 'reward' clients charges R$100 during weekdays and R$40 during weekends. Regular clients are charged R$220 during weekdays and R$150 on weekends; 

Price table result:
|            |           | **Regular**  |              | **Rewards**  |              |
|------------|-----------|--------------|--------------|--------------|--------------|
| **Hotel**  | **Stars** | **Weekdays** | **Weekends** | **Weekdays** | **Weekends** |
| Lakewood   | 3         | 110          | 90           | 80           | 80           |
| Bridgewood | 4         | 160          | 60           | 110          | 50           |
| Ridgewood  | 5         | 220          | 150          | 100          | 40           |

Write an algorithm that finds the cheapest hotel. 
The input is a sequence of dates for a regular or rewarded client. 
In case of draw for prices, the best hotel (stars) should be chosen.

Input format: <client_type>: <date1>, <date2>, <date3>, …

Samples:

Input 1: Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
Output 1: Lakewood

Input 2: Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)
Output 2: Bridgewood

Input 3: Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)
Output 3: Ridgewood

## Desafio (ptBR)

Uma rede de hotéis em Miami gostaria de oferecer um serviço de reservas pela internet. A rede é composta por três hotéis: Lakewood, Bridgewood e Ridgewood. Cada hotel tem taxas diferenciadas para dia de semana ou final de semana, incluindo taxas específicas para participantes do programa de fidelidade. Adicionalmente, cada hotel tem uma classificação, indicando a excelência do serviço.

Lakewood possui uma classificação 3 e suas taxas de dia de semana são R$110 para clientes normais e R$80 para participantes do programa de fidelidade. As taxas de final de semana são respectivamente R$90 e R$80 para clientes normais e participantes do programa de fidelidade.
Bridgewood possui uma classificação 4 e suas taxas de dia de semana são R$160 para clientes normais e R$110 para participantes do programa de fidelidade. As taxas de final de semana são respectivamente R$60 e R$50 para clientes normais e participantes do programa de fidelidade.
Ridgewood possui uma classificação 5 e suas taxas de dia de semana são R$220 para clientes normais e R$100 para participantes do programa de fidelidade. As taxas de final de semana são respectivamente R$150 e R$40 para clientes normais e participantes do programa de fidelidade.

Escreva um programa para encontrar o hotel mais barato. 
A entrada do programa será uma sequência de datas para um cliente participante ou não do programa de fidelidade. 
Utilize "Regular" para denominar um cliente normal e "Reward" para um cliente participante do programa de fidelidade. 
A saída deverá ser o hotel disponível mais barato e em caso de empate, o hotel com a maior classificação deverá ser retornado.

**Formato da entrada**:  <tipo_do_cliente>: <data1>, <data2>, <data3>, …

Formato da saída:  <nome_do_hotel_mais_barato>

**Exemplos**:

Entrada 1: Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
Saída 1: Lakewood

Entrada 2: Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)
Saída 2: Bridgewood

Entrada 3: Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)
Saída 3: Ridgewood