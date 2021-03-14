# INTRODUÇÃO JAVA

> Esse é um curso que estou estudando da devmedia.

- Java é uma linguagem de programação Orientada a Objetos

- Principalmente utilizada na programação:

  - Web | Backend | android

## Pré requisitos para a aprender a linguagem Java

- São eles:
  - Algoritimos e lógica de programação
  - Orientação a Objetos

## No objetivo da aula teremos que imprimir Hello World na tela

- Sempre trabalhando com dois passos fundamentais do Java
  - Criar uma classe
  - Instanciar um objeto

- Para o desenvolvimento em Java precisamos de :
- SDK (JDK) - O kit de desenvolvimento do Java
- IDE - Ambiente de desenvolvimento que nos auxilia na escrita do codigo, e se comunica com o SDK para compilar nosso programa.

## Estrutura inicial do projeto

- Todo código da aplicação fica dentro da pasta src

## Criando uma classe Java

- Código está contido em pelo menos uma classe.

- Uma classe Java deve ser escrita dentro um arquivo com extensão .java

- Tanto o arquivo .Java e a classe, devem possuir o mesmo nome;

> O nome da classe deve ser escrito numa notação chamada Pascal Case

- Na notação Pacal case, utiliza-se a primeira letra de cada palavra em Maiusculo.

- Uma classe pode possuir um ou mais métodos
  - Exemplo: HUMAN -> talk() walk()

- Método é como uma função e é chamada no Java

- Os métodos de uma classe, dizem o que os objetos dessa classe são capazes de fazer

- Nomes de métodos são escritos na notação camelCase
  - coma primeira letra da primeira palavra, minuscula, e cada primeira letra das demais palavras em maiúsculo.

## Instanciando um objeto

- [Classe.java][Bicicleta.java] <-> Instância <-> [OBJETO][bicicleta]

- A partir de uma instância que invocamos os métodos da classe

- Utilizamos a seguinte sintaxe:

  - objeto.metodo()
  - Exemplo: bicicleta.frear()
  - bicicleta.pedalar()

- Metodo especial do Java é chamado Main
  - Pois é o primeiro a ser executado quando executamos o programa.

- Em java os objetos são criados em dois passos:
  - Primeiro criar uma referência
  - Referencia = Nome do objeto
  - Exemplo: HelloWorld helloWorld
    - HelloWorld (Tipo da referencia)
    - helloWorld (nome da referência)
  - Para conectar essa referncia ao novo objeto
    - Exemplo: HelloWorld helloWorld = new HelloWorld();
  - Temos  da sintaxe: **HelloWorld helloWorld = new HelloWorld();**
    - **HelloWorld** = Tipo do objeto que vai ser sempre o nome da classe
    - **helloWorld** = Nome do objeto, poderia ser qualquer nome, porém seguindo  convensão Java, camelCase
    - **HelloWorld** = Nome da classe, com a chamada do construtor da classe, que é um outro método especial.