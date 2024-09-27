> dsaf
> fdas

# Primeiros passos

Para a criaçao do ciruito primeiro é necessario definir sua funcionalidade. O circuito apresentado aqui tem como funcao acender os leds
de um display de 7 segmentos, indicando qual botao foi pressionado b1, b2, b3 ... b9, e caso 2 botoes forem presionados o display
desliga, com a funcionalidade definida nos podemos começar a criação do circuito.

# Criação

Para facilitar o desenvolvimento o logsim tem a função de criar um circuito baseado em uma tabela verdade, para acessar esse menu, vá
para o canto superior esquerdo clique em projeto, depois em analisar circuito como mostardo na imagem abaixo

... _Imagegm_

Sera aberto um menu onde nos podemos dizer ao logsim o funcinamento do circuito, A primeira etapa é fazer a definição das entradas, na aba de entradas, nos podemos adicionar as entradas basta apenas dar um nome a ela e dps presionar o botão acresentar, faça isso para
todos os 10 botoes (0 à 9), para adicionar as saidas o procedimento é o mesmo vá na aba de saídas de o nome para a saida e presione
o botão de acresentar

**Imagem do painel das entrada**

# Tabela verdade

A proxima etapa é a construção da tabela verdade, vá para a aba tabela, a primeira etapa é modificar os valores de todas as saidas para zero, a maneira mais
rapida de se fazer isso é: coloque todos os valores da primeira linha em zero (basta clicar no x ) dps copie essa linha e cole na
debaixo, selecione as duas, copie e cole, depois selecione as 4 copie e cole, assim por diante. Apos ter colocado todos os valores da
tabela em zero podemos alterar as linha que os botoes são presionados, na parte esquerda da estão os valores das entradas temos que
modificar apenas as linhas onde apenas uma entrada é ativa, na parte de cima esta o botão que corresponde ao digito presncha os valores
da esquerda usando a tabela abaixo como guia, apos isso presione o botão criar circuito, de um nome ao circuito, e pronto o circuito
esta feito.

| Botao presionado | A   | B   | C   | D   | E   | F   | G   | PD  |
| ---------------- | --- | --- | --- | --- | --- | --- | --- | --- |
| 0                | 1   | 1   | 0   | 1   | 1   | 1   | 0   | 0   |
| 1                | 0   | 1   | 1   | 0   | 0   | 0   | 0   | 0   |
| 2                | 1   | 1   | 0   | 1   | 1   | 0   | 1   | 0   |
| 3                | 1   | 1   | 1   | 1   | 0   | 0   | 1   | 0   |
| 4                | 0   | 1   | 1   | 0   | 0   | 1   | 1   | 0   |
| 5                | 1   | 0   | 1   | 1   | 0   | 1   | 1   | 0   |
| 6                | 1   | 0   | 1   | 1   | 1   | 1   | 1   | 0   |
| 7                | 1   | 1   | 1   | 0   | 0   | 0   | 0   | 0   |
| 8                | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 0   |
| 9                | 1   | 1   | 1   | 1   | 0   | 1   | 1   | 0   |

# Finalizando

Selecione o circuito main e adicione o circuito que vc acabou de criar Adicione os botoes e o display como abaixo e o circuito esta finalizado
