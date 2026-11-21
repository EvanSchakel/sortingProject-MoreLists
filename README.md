# Word Frequency Analyzer - More Lists

This project builds on Project 2 (`sortingProject`) by adding five new data structures to compare against the previous linked-list implementations on larger text files:

- **Skip List** (`SkipList` / `SLNode`)
- **Three 256-Bucket Hash Tables** (`Hash1`, `Hash2`, `Hash3`) using `List3` move-to-front chaining
- **Binary Search Tree** (`BST` / `BSTNode`)

Each structure tracks:

- Distinct words (vocabulary)
- Total word count
- Key comparisons
- Reference changes
- Run time
- Structure height (`h`, for Skip List and BST)

## Project Structure

- `src/Lab3.java`: Main driver (`main()` first) that runs `List3`, `SkipList`, `Hash1`, `Hash2`, `Hash3`, and `BST`
- `src/ListInterface.java`: Shared interface for all list, hash table, and tree structures
- `src/BaseList.java` & `src/LLNode.java`: Base linked list and node classes from Project 2
- `src/List1.java` – `src/List4.java`: Original five linked lists from Project 2 (`List3` kept active as baseline)
- `src/SLNode.java` & `src/SkipList.java`: Quad-linked node (`isSentinel` flag) and multi-lane skip list
- `src/Hash1.java`: 256-bucket hash table (ASCII character sum `% 256`)
- `src/Hash2.java`: 256-bucket hash table (first character ASCII value)
- `src/Hash3.java`: 256-bucket hash table (8-bit rolling polynomial hash)
- `src/BSTNode.java` & `src/BST.java`: Binary search tree node (`left`, `right`, `parent`) and iterative BST

## Running the Project

Compile the source files:

```bash
javac -d bin src/*.java
```

Run the analyzer with a text file:

```bash
java -cp bin Lab3 Hamlet.txt
```
