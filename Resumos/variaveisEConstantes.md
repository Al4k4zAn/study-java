# Variaves e Constantes

A Variável

- é o recurso da linguagem de programação, utilizada para armazenar valores em memória.

- Assim sempre que precisamos acessar esse valor, podemos faze-lo através da variável.

- No Java podemos declarar variáveis e constantes.

- A diferença entre elas, a variável recebe o seu valor uma vez, e logo após ela pode ser modificada. No caso das constantes o valor é recebido uma vez e não pode mais ser modificada.

- Na declaração de constantes, utilizamos a palavra chave __final__ antes do seu tipo.

****

```java
  int numero
  String nome
  ```

- Nesse codigo acima número é uma variável do tipo inteiro, e nome é uma variável do tipo String.

>A Linguagem Java é fortemente tipada, então torna-se obrigatório a declaração do tpo da variável.

- Os tipos de dados em Java podem ser qualquer dos primitivos (int, float, boolean).

- Qualquer outra classe/interface, sendo nativa do Java (String, ArrayList), ou criada por terceiros (Produto, ProdutoDAO).

## Nomeaçõa de variáveis

- *Regras e convenções*
  
  - pode conter letras, números e o caracter sublinhado (_), não pode começar com um número.

  - declaradas em minusculo. Para nomes compostos a primeira letra de todas as palavras, menos da primeira. (Camel Case).

  - o Java é uma linguagem case sensitive. Logo __numeroUm__ é diferente de __numeroum__.

- Exemplos de declaração de variáveis:

```java
  int nome123;
  float _salarioBase;
  String 1erro; // Erro de compilador, não iniciar com número.
  ```

- *Variáveis de classe*

  - Quando declaramos a variável dentro de uma classe, podemos especificar o modificador de acesso.

  - Exemplo:

```java
  class Funcionario {
    private int matricula;
    private String nome;
  }
  ```

- O modificador informado dentro da classe, pode ser private, public ou protected.

****

## Constantes

- Utilizada quando temos dados que não devem sofrer alterações durante a execução do programa.

- Na linguagem JAVA existe a palavra-chave __const__ porém utilizamos a palavra __final__ .

- A diferença entre as duas formas de definir a constante, é que a __final__ faz com que a variável possa ser inicializada apenas uma vez, e o valor pode vir após sua declaração.

  - Exemplo:

```java
 final float PI = 3.1416F;
 final String NOME_PAGINA = "home";
```

- Por convenção utilizamos letras maiusculas para declarar constantes e assim distingui-las de variáveis.

- Exemplos de uso:

- demonstrando alguns exemplos de declaração de variáveis:

```java
 final float PI = 3.1416f;
 final double E = 1.234e2;
 String nome = "Estevão dias";
 String dataAniversário = "20/05/2000";
 int lote = 35456;
 boolean aprovado =  true;
 ```
