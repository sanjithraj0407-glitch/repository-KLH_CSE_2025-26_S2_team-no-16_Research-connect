# Research Paper Pattern Search System

## 1. Project Overview

The Research Paper Pattern Search System is a Java-based application that searches for keywords and patterns in a collection of research-paper text documents.

The project uses string-matching algorithms to locate patterns, identify occurrences, and demonstrate different approaches to text processing. It also includes additional algorithm demonstrations covering network flow, approximation algorithms, and randomized sampling.

The system stores research papers in an organised corpus and saves search results in a results folder.

## 2. Objectives

- Search for keywords and patterns in research papers.
- Implement and demonstrate multiple string-matching algorithms.
- Identify all occurrences of a pattern in a text.
- Explore edit distance for comparing strings.
- Demonstrate network-flow and graph approximation algorithms.
- Demonstrate randomized sampling on a collection of text documents.
- Practise algorithm design, implementation, and testing using Java.

## 3. Technologies Used

- **Programming Language:** Java
- **IDE:** Visual Studio Code
- **Version Control:** Git and GitHub
- **Data Storage:** Text files
- **Algorithms:** String Matching, Dynamic Programming, Network Flow, Graph Approximation, and Randomized Sampling

## 4. Project Structure

```text
research_content/
├── corpus/
│   └── research-papers/
│       ├── batch1/
│       ├── batch2/
│       ├── batch3/
│       ├── batch4/
│       ├── batch5/
│       ├── batch6/
│       └── batch7/
├── results/
│   └── search_results.txt
├── src/
│   └── algorithms/
│       ├── Main.java
│       ├── CorpusLoader.java
│       ├── SearchHistory.java
│       ├── KMP.java
│       ├── KMPTest.java
│       ├── ZAlgorithm.java
│       ├── ZAlgorithmTest.java
│       ├── SuffixArray.java
│       ├── SuffixArrayTest.java
│       ├── EditDistance.java
│       ├── EditDistanceTest.java
│       ├── AhoCorasick.java
│       ├── AhoCorasickTest.java
│       ├── EdmondsKarp.java
│       ├── EdmondsKarpTest.java
│       ├── VertexCover.java
│       ├── VertexCoverTest.java
│       ├── MonteCarloSearch.java
│       └── MonteCarloSearchTest.java
├── bin/
├── README.md
└── .gitignore
```

The `bin/` folder contains compiled Java classes and should not be committed to GitHub.

## 5. Algorithms Implemented

### 5.1 Knuth–Morris–Pratt (KMP)

KMP searches for a pattern in a text using a Longest Prefix Suffix (LPS) array to avoid unnecessary comparisons.

**Application:** Finds keywords in research-paper documents.

### 5.2 Z Algorithm

The Z Algorithm constructs a Z-array to determine the length of the longest substring starting at each position that matches the prefix of the text.

**Application:** Demonstrates efficient pattern matching.

### 5.3 Suffix Array

A suffix array stores the starting positions of all suffixes of a string in lexicographically sorted order.

**Application:** Demonstrates suffix-based text processing and searching structures.

### 5.4 Edit Distance

Edit Distance calculates the minimum number of insertions, deletions, and substitutions needed to transform one string into another.

**Application:** Compares similar words and demonstrates dynamic programming.

### 5.5 Aho–Corasick Algorithm

Aho–Corasick searches for multiple patterns in a text using a trie and failure links.

**Application:** Demonstrates multi-pattern searching.

### 5.6 Edmonds–Karp Algorithm — CO4

Edmonds–Karp calculates the maximum flow in a flow network by repeatedly using Breadth-First Search (BFS) to find augmenting paths.

**Application:** Demonstrates capacity-constrained connections between nodes.

### 5.7 Vertex Cover 2-Approximation — CO5

The Vertex Cover approximation algorithm selects vertices so that every edge in a graph has at least one selected endpoint.

**Application:** Demonstrates graph coverage and approximation algorithms using relationships between vertices.

### 5.8 Monte Carlo Search Demonstration — CO6

The Monte Carlo search demonstration randomly samples documents and checks the sampled documents for a keyword.

**Application:** Demonstrates randomized sampling in a text-search context.

**Note:** The current Monte Carlo module is a randomized sampling demonstration. It is not a formal Monte Carlo algorithm with a proven probability-of-error bound, and it may miss matches outside the sampled documents.

## 6. Research Paper Corpus

The project contains 20 research-paper text files organised into seven batches.

The corpus includes topics such as:

- Machine Learning
- Artificial Intelligence
- Cybersecurity
- Cloud Computing
- Internet of Things
- Database Systems
- Computer Networks
- Data Science
- Pattern Searching
- Information Retrieval

The corpus is used by the main application to demonstrate keyword searching.

## 7. Installation and Execution

### Prerequisites

- Java Development Kit (JDK) installed.
- Visual Studio Code or another Java-compatible editor.
- Git installed if you want to clone or update the repository.

### Step 1: Open the project folder

Open the project directory in VS Code.

### Step 2: Compile the Java files

Run the following commands in the terminal from the project root:

```powershell
javac -d bin src\algorithms\*.java
```

### Step 3: Run the main application

```powershell
java -cp bin algorithms.Main
```

Enter a keyword or phrase when prompted to search the research-paper corpus.

### Step 4: Run individual algorithm demonstrations

**KMP**

```powershell
java -cp bin algorithms.KMPTest
```

**Z Algorithm**

```powershell
java -cp bin algorithms.ZAlgorithmTest
```

**Suffix Array**

```powershell
java -cp bin algorithms.SuffixArrayTest
```

**Edit Distance**

```powershell
java -cp bin algorithms.EditDistanceTest
```

**Aho–Corasick**

```powershell
java -cp bin algorithms.AhoCorasickTest
```

**CO4 — Edmonds–Karp**

```powershell
java -cp bin algorithms.EdmondsKarpTest
```

Expected maximum flow for the included sample network: `23`.

**CO5 — Vertex Cover Approximation**

```powershell
java -cp bin algorithms.VertexCoverTest
```

Enter the number of vertices, the number of edges, and the endpoints of each edge when prompted.

**CO6 — Monte Carlo Search Demonstration**

```powershell
java -cp bin algorithms.MonteCarloSearchTest
```

Enter a keyword and the number of documents to sample when prompted.

## 8. Output and Results

The main application searches the corpus and reports matching documents, occurrence counts, and pattern positions.

Search results are saved in:

```text
results/search_results.txt
```

Individual algorithm test programs display their results in the terminal.

## 9. Course Outcome Mapping

| Course Outcome | Algorithm | Demonstration |
|---|---|---|
| CO1–CO2 | KMP, Z Algorithm, Suffix Array, Aho–Corasick | Pattern matching and text processing |
| CO3 | Edit Distance | Dynamic programming and string comparison |
| CO4 | Edmonds–Karp | Maximum flow in a network |
| CO5 | Vertex Cover 2-Approximation | Graph approximation |
| CO6 | Monte Carlo Search Demonstration | Randomized sampling |

This table represents the project's selected algorithm demonstrations; it does not imply that every topic in each course outcome has been implemented.

## 10. Future Enhancements

- Add Rabin–Karp pattern matching.
- Add LCP Array and Suffix Automaton implementations.
- Connect the randomized sampling demonstration to the complete research-paper corpus.
- Improve search performance for larger collections.
- Add filters by research topic, title, or author.
- Build a graphical user interface for easier interaction.
- Add automated tests for algorithm correctness and edge cases.

## 11. Conclusion

The Research Paper Pattern Search System demonstrates how different algorithms can be implemented in Java to process text documents and solve related computational problems.

It combines a searchable research-paper corpus with string-matching algorithms and additional demonstrations of network flow, graph approximation, and randomized sampling. The project provides a foundation for further exploration of Data Structures and Algorithms.

## 12. Author and Repository

**Project:** Research Paper Pattern Search System

**Language:** Java

**Repository:** [Research Connect — GitHub](https://github.com/sanjithraj0407-glitch/repository-KLH_CSE_2025-26_S2_team-no-16_Research-connect)

## Contributors

This project was developed collaboratively by:

1. **T. Sai Akshaya**
2. **R. Juhit Naidu**
3. **M. Sanjith Raj**

All contributors participated in the development and documentation of the Research Paper Pattern Search System.
