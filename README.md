# Research Paper Pattern Search System

## Project Description

This project is a searchable research-paper repository.

The system stores research papers as text documents in a corpus and allows users to search for keywords or patterns inside those documents.

The Knuth-Morris-Pratt (KMP) algorithm is used for efficient pattern searching.

## Project Objectives

- Store research papers as text documents.
- Search for keywords inside the research-paper corpus.
- Use KMP for pattern searching.
- Display matching documents.
- Display the number of occurrences.
- Display the positions where the pattern occurs.
- Maintain search history.

## Data Structure

The corpus contains text documents:

- paper1.txt
- paper2.txt
- paper3.txt
- paper4.txt
- paper5.txt

## Algorithm

### KMP Pattern Matching

KMP stands for Knuth-Morris-Pratt.

It searches for a pattern in a text using an LPS (Longest Prefix Suffix) array.

### Time Complexity

Preprocessing: O(m)

Searching: O(n)

Where:

- n = length of text
- m = length of pattern

Overall complexity: O(n + m)

## Project Structure

Research_Paper_Search

    corpus
        research-papers
            paper1.txt
            paper2.txt
            paper3.txt
            paper4.txt
            paper5.txt

    results

    src
        algorithms
            KMP.java
            KMPTest.java
            CorpusLoader.java
            SearchHistory.java
            Main.java

    README.md

## How to Compile

Open the terminal in the project folder and run:

```bash
javac -d out src/algorithms/*.java