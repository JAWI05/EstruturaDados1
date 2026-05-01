# 📚 Estrutura de Dados I - Engenharia de Computação

Este repositório contém os materiais de estudo e implementações práticas da disciplina de **Estrutura de Dados I** da **ESEG - Faculdade do Grupo Etapa**, ministrada pelo **Prof. Victor Lattari**[cite: 11].

---

## 🔬 Análise de Algoritmos e Complexidade

A análise de algoritmos permite determinar o custo de resolução de um problema em termos de tempo e memória, independentemente do hardware ou compilador utilizado[cite: 12].

### 📉 Notações Assintóticas
*   **Notação $O$ (Big O):** Descreve o limite superior do crescimento de uma função. Representa o **pior caso** de um algoritmo[cite: 12].
*   **Notação $\Omega$ (Omega):** Descreve o limite inferior do crescimento. Representa o **melhor caso**[cite: 12].
*   **Notação $\Theta$ (Theta):** Descreve o crescimento exato, indicando que a função cresce dentro de limites superior e inferior proporcionais[cite: 12].



### 📊 Inventário de Funções (Melhor → Pior)
1.  **$O(1)$**: Constante[cite: 12].
2.  **$O(\log n)$**: Logarítmico[cite: 12].
3.  **$O(n)$**: Linear[cite: 12].
4.  **$O(n \log n)$**: Linear-logarítmico (limite de muitos problemas práticos)[cite: 12].
5.  **$O(n^2)$**: Quadrático[cite: 12].
6.  **$O(k^n)$ ou $O(n!)$**: Exponencial (devem ser evitados)[cite: 12].

---

## 🔍 Algoritmos de Busca e Ordenação

### 1. Algoritmos de Busca[cite: 11]
*   **Busca Sequencial**: Percorre os elementos um a um. Em vetores ordenados, pode ser interrompida precocemente se o elemento atual for maior que o buscado[cite: 11].
*   **Busca Binária**: Aplicável apenas a **vetores ordenados**. Divide o vetor ao meio sucessivamente, reduzindo drasticamente o tempo de busca para $O(\log n)$[cite: 11].



### 2. Quick Sort[cite: 11]
É um dos algoritmos de ordenação mais eficientes, baseado na estratégia de **Dividir e Conquistar**:
1.  Escolha de um **pivô**[cite: 11].
2.  **Partição**: Elementos menores que o pivô vão para a esquerda; maiores para a direita[cite: 11].
3.  **Recursão**: Aplica-se o processo nas sublistas resultantes[cite: 11].

---

## 🛠️ Estruturas de Dados Dinâmicas

### 📋 Listas[cite: 13]
*   **Lista Sequencial (Estática)**: Elementos em posições consecutivas da memória. Vantagem: Acesso direto $O(1)$ via índice. Desvantagem: Tamanho fixo e inserções ineficientes $O(n)$[cite: 13].
*   **Lista Encadeada (Dinâmica)**: Nós conectados por ponteiros. Vantagem: Tamanho dinâmico e inserções/remoções eficientes no início $O(1)$. Desvantagem: Acesso sequencial $O(n)$[cite: 13].



### 🚶 Filas (Queue)[cite: 13]
*   **Conceito**: **FIFO** (*First In, First Out*) — O primeiro a entrar é o primeiro a ser atendido[cite: 13].
*   **Operações**: `enqueue` (inserir no fim) e `dequeue` (remover do início)[cite: 13].
*   **Uso Real**: Filas de impressão e gestão de processos em sistemas operacionais[cite: 13].

### 📚 Pilhas (Stack)[cite: 13]
*   **Conceito**: **LIFO** (*Last In, First Out*) — O último a entrar é o primeiro a sair[cite: 13].
*   **Operações**: `push` (inserir no topo) e `pop` (remover do topo)[cite: 13].
*   **Uso Real**: Histórico de navegadores, funções de "desfazer" (undo/redo) e recursão em compiladores[cite: 13].
<div align="center">
  <sub>Repositório de estudos - Engenharia de Computação @ ESEG</sub>
</div>
