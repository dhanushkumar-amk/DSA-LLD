# DSA & LLD Study Repository

## Overview
A Java-based personal study repository for Data Structures, Algorithms (DSA), and Low-Level Design (LLD) — focused on technical interview preparation.

## Project Structure
- **DSA/LEARN/** — Topic-wise algorithm implementations (Arrays, Binary Search, Graphs, Trees, Recursion, etc.)
- **DSA/PRATICE/** — Platform-specific problem solutions (LeetCode, GeeksForGeeks, Coding Ninja)
- **LLD/DESIGN_PRINCIPLES/** — SOLID principles with good/bad examples
- **LLD/MULTITHREADING/** — Thread and Runnable examples
- **LLD/OOPS/** — OOP concepts and design scenarios

## Tech Stack
- **Language:** Java (GraalVM 22.3 / OpenJDK 19)
- **Build:** No build tool — files are compiled individually with `javac`

## How to Run a Java File
To compile and run any individual file:
```bash
javac path/to/File.java && java -cp path/to File
```

Example:
```bash
javac DSA/LEARN/ARRAY/LargestElement.java && java -cp DSA/LEARN/ARRAY LargestElement
```

## User Preferences
- Java files are standalone and meant to be compiled/run individually
