# 📘 Lista de Exercícios – Estruturas de Dados (Heap & Priority Queue)

### **Aluno:** Murilo Sambrana Sabença

### **RA:** 2403111

### **Professor:** Odair Gabriel

### **Matéria:** Algoritmos e Estruturas de Dados

---

## 📚 Sobre o Projeto

Este repositório contém **as implementações completas dos 5 exercícios de Lista de Prioridade (Heap)** propostos pelo professor Odair Gabriel.
Todos os códigos foram desenvolvidos em **Java**, utilizando **PriorityQueue**, **Heaps**, e técnicas de manipulação eficiente de estruturas de dados.

O arquivo `Principal.java` executa automaticamente testes para cada exercício, exibindo exemplos e saídas esperadas.

---

## 🧩 Exercícios Implementados

---

## **✅ Exercício 1 – Encontrar os K Maiores Elementos**

**Arquivo:** `KMaioresElementos.java`
**Descrição:**
Implementa um algoritmo eficiente (`O(N log K)`) para encontrar os **K maiores valores** dentro de um array desordenado usando um **Min-Heap**.

**Funções:**

* `encontrarKMaiores(int[] arr, int k)` → retorna lista com os K maiores
* `encontrarKesimoMaior(int[] arr, int k)` → retorna o K-ésimo maior elemento

---

## **✅ Exercício 2 – Mesclagem de K Listas Ordenadas**

**Arquivo:** `MescladorKListas.java`
**Descrição:**
Mescla **K listas ordenadas** em uma única lista ordenada.
Utiliza um Min-Heap que armazena objetos contendo valor + origem da lista.

---

## **✅ Exercício 3 – Lista de Prioridade Dupla**

**Arquivo:** `FilaPrioridadeDupla.java`
**Descrição:**
Implementação de uma estrutura capaz de retornar e remover **o menor e o maior elemento em O(log N)** utilizando:

* Um Max-Heap
* Um Min-Heap
* Um mapa de frequência para sincronização

**Métodos principais:**

* `inserir(int valor)`
* `obterMaximo()` / `obterMinimo()`
* `removerMaximo()` / `removerMinimo()`

---

## **✅ Exercício 4 – Verificação e Construção de Min-Heap**

**Arquivo:** `ValidadorMinHeap.java`
**Descrição:**
Inclui:

* Função para validar se um array é um **Min-Heap**
* Função recursiva para validação
* Função `organizarHeap()` que transforma um array em Min-Heap usando Heapify

---

## **✅ Exercício 5 – Encontrar a Mediana de um Fluxo de Dados**

**Arquivo:** `BuscadorMediana.java`
**Descrição:**
Mantém um fluxo de números e retorna a mediana em tempo eficiente usando:

* Max-Heap para metade inferior
* Min-Heap para metade superior

**Métodos:**

* `adicionarNumero(int num)`
* `encontrarMediana()`
* `obterContagem()`

---

## ▶️ Execução dos Testes

O arquivo **Principal.java** contém testes automáticos para todos os exercícios.

Para rodar:

```bash
javac *.java
java Principal
```

O console exibirá os resultados esperados e obtidos, incluindo listas, medianas, validações de heap e comportamento da fila dupla.

---

## 📁 Estrutura dos Arquivos

```
├── Principal.java
├── KMaioresElementos.java
├── MescladorKListas.java
├── FilaPrioridadeDupla.java
├── ValidadorMinHeap.java
└── BuscadorMediana.java
```

---

## 🎓 Observação Final

Todos os exercícios foram implementados seguindo as boas práticas de uso de PriorityQueue e conceitos de Heap, cumprindo todos os requisitos da atividade proposta pelo professor Odair Gabriel.

