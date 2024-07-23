# Projeto da Disciplina de Compiladores - 2024.1

- [Objetivo](#objetivo)
- [Comandos para Compilar](#comandos-para-compilar)
- [Como Usar](#como-usar)

## Objetivo
Criar um DSL para resolver derivadas com o intuito de ajudar pessoas que possuem dificuldade em resolvê-las.

## Comandos para Compilar
1. Compilar a descrição da linguagem fonte:

```
java -jar antlr.jar gramatica.g4 -o gen
```
O comando acima executa o gerador ANTLR que converte a descrição da gramática (gramatica.g4) em
programas Java (Analisadores léxicos e sintáticos).


2. Compilar programas em Java:


```
javac -cp antlr.jar:gen *.java gen/*.java -d gen
```
O comando acima executa o compilador Java. O arquivo antlr.jar, que contem as bibliotecas
runtime utilizadas pelo código gerado pelo antlr são adicionadas ao CLASSPATH.


3. Executar o programa:

```
java -cp antlr.jar:gen Derivadas
```

O comando acima executa a classe Derivadas do compilador. Para a classe poder ser executada é necessário também incluir os arquivos do runtime do antlr.jar.

## Como usar
1. Criar um codespaces do projeto

2. Dentro do codespaces, abrir o arquivo exemplo.derivada e nele escrever a expressão a ser derivada.

3. Executar o programa (escreva 'java -cp antlr.jar:gen Derivadas' no terminal)

4. A derivada da expressão escolhida vai ser gerada e pode ser visualizada no terminal.

# Desenvolvedores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/rjpgm">
        <img src="colaboradores/rodrigo-pascaretta.jpg" width="100px;"/><br>
        <sub>
          <b>Rodrigo Pascaretta</b>
        </sub>
      </a>
    </td>
     <td align="center">
      <a href="https://github.com/andreescorel">
        <img src="colaboradores/andre-escorel.jpg" width="100px;"/><br>
        <sub>
          <b>André Escorel</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
