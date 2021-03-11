# FaturaCartaoCreditoJob - Spring Batch
Projeto Java utilizando Spring Boot.

## Objetivo
Ler 10 mil transações no banco de dados, e informações de clientes em uma API REST externa.

*Esse dados são ficticios!*

Após a leitura o programa gera em arquivo.txt referente a fatura de cartão de crédito de cada cliente.

## Reader
Através de conexão JDBC com BD via leitura de cursor, é efetuada a leitura das 10 mil transações.

Finalizada a leitura de transações, é feita uma segunda leitura para que seja armazenadas as transações dentro do dompinio de Fatura de Cartão de crédito.

## Processor
O procesamento foi implementado para carregarmos via uma api rest externa as informações do cliente, e agrupa-las em nossa lógica da Fatura.

## Writer
#### arquivosFaturaCartaoCredito
A nossa escrira foi preciso da seguinte lógica: escrever vários arquivos, porém uma escrita fatura por cliente.
Para a escrita de múltiplos arquivos, foi utilizado o *MultiResourceItemWriter*.
E para a escrita do arquivo, foi utilizado o *FlatFileItemWriter*.

Para o __corpo__ do nosso arquivo foi utilizado a função de agregador*(lineAggregator)* ou seja, para cada transação a função retorna os dados da transação, nome, data, valor.

Para os __cabeçalhos e rodapé__, foram utilizados as funções de *'Callback'*.

O __rodapé__ precisa ser um listener para que um momento antes do fechamento do arquivo, ele faça o cálculo correto do total da fatura.


## Utilização
Após realizar o 'fork/clone', executar o arquivo __/files/scripts.sql__ para criação do banco, tabelas e registros.

Não esqueça de configurar usuário e senha do banco no arquivo de properties do projeto.
Mas caso queira mudar a implementação da base, ou o tipo do BD, bastas mudar os apontamentos:
- pom.xml
- application.properties
- DataSourceConfig.java

