---
published: true
title: builder, singleton
layout: post
---
O exercício desenvolvido envolve a utilização dos padrões: Método Fabrica, Fabrica abstrata,  Protótipo, o Singleton e  Builder, ou seja, todos os padrões criativos ensinados na sala de aula. O problema envolve a criação de um sistema que constrói pizzas. Os tipos são requisitados numa fabrica de pizza, aonde foi aplicado o singleton para ser instanciada apenas uma vez, ela sera responsável por abstrair a implementação que é contituida por um hashMap que retorna a Fabricabuilder do tipo para criar a pizza e cada builder chama uma fabrica de pizza diferente. O metodo criarPizza dentro da fabrica chama um cozinheiro que nada mais é que uma implementação do director que vai definir os passos para montar uma pizza.  [Link do Repositório](https://github.com/GrimaG/GrimaG.github.io/tree/master/piazzaria)

<img src="https://raw.githubusercontent.com/GrimaG/GrimaG.github.io/master/piazzaria/Class%20Diagram0.png">