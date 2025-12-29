# Algorithms

This repository contains my Java solutions for various algorithm problems.  
It is designed to demonstrate clean code, problem-solving skills, and algorithmic thinking.

## Project Structure

- `algorithms/` ← Java project folder
  - `src/main/java/algorithms/` ← package root
    - `warmup/`: Basic problems
      - `plusminus/`
        - `problem.txt` - problem description
        - `Solution.java` - solution code
    - `implementation/` - more complex problems can be added here
  - (IDE and build files)

- `.gitignore` - ignores IDE, build, and OS files
- `README.md` - this file

## Purpose

- Practice Java and algorithmic problem-solving
- Improve code readability and maintainability
- Build a portfolio demonstrating understanding of common algorithm patterns
- Showcase ability to structure projects professionally

## How to Run

Each problem folder contains a `Solution.java` file.  
You can compile and run it from the project root using:

```bash
javac -d bin src/main/java/algorithms/warmup/plusminus/Solution.java
java -cp bin algorithms.warmup.plusminus.Solution

