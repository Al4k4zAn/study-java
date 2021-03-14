# ENTENDENDO A ESTRURURA DO CODIGO JAVA

## Estrutura básica 

1- Arquivo fonte;
2- Classes;
3- Métodos;
4- Método main

## Anatomia das estruturas básicas

### 1 - Arquivo fonte (Source File)

- Em java cada classe está contida em um arquivo source;
- Os arquivos Source são gerados com a extensão .java;
- Ou podem ser criados em qualquer editor de texto, porém salvos como .java
- Esses arquivos devem possuir o memso nome da classe;

### 2- Classe (Class)

- Em uma classe Java são colocados os metodos, funções, ou procedimentos;
- Todo código esta contido em uma classe;
- Quando executamos um aplicativo java, estamos executando uma classe;
- Uma classe pode conter vários métodos;
- A clase deve ser escrita com um par de chaves "{}";
- Entre as chaves são colocados os métodos;
- Uma classe sempre se inicia com uma letra maiúscula;

```java
public class MyClass{
  //código vai aqui
}
```

### 3 - Métodos (Methods)

- Dentro dos métodos, funções ou procedimentos, estão todo código da aplicação java;
- Assim cmo nas classes, o método deve ser escrito com um par de chaves no final "{}";
- Métodos sempre iniciam com letra minúscula;
- Exemplo de um método em uma classe, abaixo:

```java
public class MyClass{
  public void meuMetodo(/*argumentos*/){
    //codigo do método
  }
}
```

## Anatomia da estrutura

- **Anatomia de uma classe:**

```java
public class MyClass{
}
```

- public = referencia a visibilidade da classe;
- Quando dizemos que é "public" significa que ela poderá ser acessada por outras classes;
- class = Demonstra que estamos criando uma classe;
- MyClass = Nome da classe que estamos criando
- {} = utilizada para indicar até onde a classe ou método se extende;

- **Anatomia de um método**

```java
public  class MyClass{
  public void meuMetodo(/*argumentos*/){
  }
}
```

- public = refere-se a visibilidade do método, quando dizemos que é "public", significa que poderá ser acessado por outras classes;

- void = Tipo de retorno do método. Nesse caso retornará vazio;

- meuMetodo = Refere-se ao nome do método seguindo a conferencia de escrita camelCase;

- (/*argumentos*/) = São os argumentos que será passados para esse método, sendo opcional. Para o caso de não precisarmos passar argumento, deixamos vazio "()". E ao precisar informar um argumento, precisa passar o tipo da variável e o nome da variável ex: "(int valor)";

- {} = As chaves indicam até onde certa classe ou método se extende. O código do método é contido dentro das chaves.

## O método main

- Utilizado pela JVM para executar o código;
- Método especifico  chamado "main";
- Uma aplicação Java deverá contem obrigatóeiamente ao menos uma classe e um método main;
- O método padrão main segue algumas regras: 
  - Publico;
  - Estático;
  - Sem retorno (void);
  - nome será "main"
  - Deve receber como argumento um array do tipo String;

```java
public class MyClass{
  public static void main(String[] args){
    //codigo
  }
}
```

- **Anatomia do método main**

- public = refere-se a visibilidade do método;
- static = garantia que haverá apenas uma referencia para nosso método main;
  - Todas as instâncias da classe irão compartilhar a mesma cópia do metodo main.
- void = o retorno do método será vazio, não retornando nenhum valor;
- (String[] args) = Refere-se aos argumentos que serão passado para esse método, no caso do main, são obrigatórios;
- {} = Indica a extensão da classe ou método, onde estará contido o código;
