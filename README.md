<div align="center">

<img src="https://raw.githubusercontent.com/CodeWithOmsai77/Java-Learning/main/assets/java-learning-banner.svg" width="100%" alt="Java Learning Journey — Core Java and OOP" />

<p>
  <img src="https://img.shields.io/badge/Java-Core%20Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Core Java" />
  <img src="https://img.shields.io/badge/Roadmap-10%20Topics-6D28D9?style=for-the-badge" alt="10 topic roadmap" />
  <img src="https://img.shields.io/badge/Practice-Console%20Projects-0F766E?style=for-the-badge" alt="Console projects" />
</p>

**A practical Java path from fundamentals and loops to OOP, inheritance, exception handling, and file I/O.**

</div>

---

## 👋 About This Repository

This repository follows a **small-program-first learning pattern**: one focused Java example per file, familiar input through `Scanner`, visible output, and gradual progression toward object-oriented programming and console projects.

I am keeping the exercises at beginner to early-intermediate level. The aim is to understand each example, run it, modify it, and gradually combine concepts into small applications.

## 🗺️ Learning Roadmap

<table>
  <thead>
    <tr><th>Topic</th><th>What you practise</th><th>Examples</th></tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>01 · Basics</strong></td>
      <td>Variables, data types, operators, type conversion, keyboard input</td>
      <td><a href="Java-Learning/01_Basics/JavaFundamentals.java">JavaFundamentals.java</a></td>
    </tr>
    <tr>
      <td><strong>02 · Conditionals</strong></td>
      <td>Conditions, digit logic, quadratic equation cases</td>
      <td><a href="Java-Learning/02_Conditionals/ConditionalLoops.java">ConditionalLoops.java</a> · <a href="Java-Learning/02_Conditionals/QuadraticEquationSolver.java">QuadraticEquationSolver.java</a></td>
    </tr>
    <tr>
      <td><strong>03 · Loops</strong></td>
      <td>Iteration, summation, multiplication tables, prime checks, reversing digits, Fibonacci</td>
      <td><a href="Java-Learning/03_Loops/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>04 · Arrays</strong></td>
      <td>Arrays, bubble sort, two-dimensional arrays and matrix addition</td>
      <td><a href="Java-Learning/04_Arrays/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>05 · Strings</strong></td>
      <td>String length, case conversion, character access and palindrome checks</td>
      <td><a href="Java-Learning/05_Strings/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>06 · Methods</strong></td>
      <td>Parameters, return values, reusable logic and number utilities</td>
      <td><a href="Java-Learning/06_Methods/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>07 · Object-Oriented Programming</strong></td>
      <td>Classes, objects, constructors, constructor overloading, method overloading and encapsulation basics</td>
      <td><a href="Java-Learning/07_Object_Oriented_Programming/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>08 · Inheritance</strong></td>
      <td>Single and multilevel inheritance, `extends`, `super`, and method overriding</td>
      <td><a href="Java-Learning/08_Inheritance/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>09 · Exception Handling</strong></td>
      <td>`try`, `catch`, `finally`, multiple catch blocks and a simple custom exception</td>
      <td><a href="Java-Learning/09_Exception_Handling/">Open lessons</a></td>
    </tr>
    <tr>
      <td><strong>10 · File Handling</strong></td>
      <td>Writing, reading, and appending text using Java I/O classes</td>
      <td><a href="Java-Learning/10_File_Handling/">Open lessons</a></td>
    </tr>
  </tbody>
</table>

## 🚀 Compile and Run

Install a JDK and check that both commands are available:

```bash
java -version
javac -version
```

Compile one lesson from the repository root:

```bash
javac Java-Learning/01_Basics/JavaFundamentals.java
java -cp Java-Learning/01_Basics JavaFundamentals
```

Compile a standalone project into a separate output folder:

```bash
mkdir -p out
javac -d out Java-Projects/NumberGuessingGame.java
java -cp out NumberGuessingGame
```

Each lesson and project is a standalone console program unless the file itself explains otherwise. Compile one program at a time to avoid mixing unrelated classes.

## 🧩 Java Projects

The repository contains **eight console projects**: the original Calculator, Bank Management System, and Hospital Management System, plus five smaller projects aimed at practising the topics in order.

See the [Java Projects README](Java-Projects/README.md) for project summaries and compile/run commands.

<table>
  <tr>
    <td width="50%" valign="top">
      <h3>🧮 Calculator</h3>
      <p>Menu-driven arithmetic including division, remainder, powers and square root.</p>
    </td>
    <td width="50%" valign="top">
      <h3>🎯 Number Guessing Game</h3>
      <p>Random numbers, loops, conditions and attempts.</p>
    </td>
  </tr>
  <tr>
    <td width="50%" valign="top">
      <h3>🎓 Student Grade Manager</h3>
      <p>Input validation, marks, averages and grade classification.</p>
    </td>
    <td width="50%" valign="top">
      <h3>🧠 Quiz Application</h3>
      <p>Question arrays, answer checking and score tracking.</p>
    </td>
  </tr>
</table>

## 📚 How I Practise

1. Read the program name and predict its behaviour.
2. Type or adapt the code myself rather than relying only on copying.
3. Compile and run one file at a time.
4. Try normal, boundary, and invalid inputs.
5. Explain the logic, then make one small change independently.
6. Apply the concepts in a project when the lesson feels clear.

## 📁 Repository Layout

```text
Java-Learning/
├── README.md
├── assets/
│   └── java-learning-banner.svg
├── Java-Learning/
│   ├── 01_Basics/
│   ├── 02_Conditionals/
│   ├── 03_Loops/
│   ├── 04_Arrays/
│   ├── 05_Strings/
│   ├── 06_Methods/
│   ├── 07_Object_Oriented_Programming/
│   ├── 08_Inheritance/
│   ├── 09_Exception_Handling/
│   └── 10_File_Handling/
└── Java-Projects/
    ├── README.md
    └── standalone project programs
```

Only the root README and `Java-Projects/README.md` are used as documentation pages. Learning folders and individual project files intentionally do not have separate README files.

---

<div align="center">

**Understand the example · Run it · Change it · Build something with it**

</div>
