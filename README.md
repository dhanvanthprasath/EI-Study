# EI-Study


---

# Virtual Classroom Manager & Design Patterns Examples

This repository contains two main projects:

1. **Virtual Classroom Manager** - A terminal-based system for managing classrooms, students, assignments, and assignment submissions.
2. **Six Different Use Cases** - Demonstrating various software design patterns in Java, categorized into behavioral, creational, and structural design patterns.

## Table of Contents

1. [Virtual Classroom Manager](#virtual-classroom-manager)
   - [Overview](#overview)
   - [Features](#features)
   - [How to Run](#how-to-run)
2. [Six Design Pattern Use Cases](#six-design-pattern-use-cases)
   - [Behavioral Design Patterns](#behavioral-design-patterns)
   - [Creational Design Patterns](#creational-design-patterns)
   - [Structural Design Patterns](#structural-design-patterns)
   - [How to Run](#how-to-run-1)

---

## Virtual Classroom Manager

### Overview
The **Virtual Classroom Manager** is a terminal-based application that allows you to manage classrooms, enroll students, schedule assignments, and record assignment submissions. It serves as a simple backend for an EdTech platform that hosts virtual classrooms.

### Features
- **Classroom Management**: Add, list, and remove classrooms.
- **Student Management**: Enroll students in classrooms, and list students in each classroom.
- **Assignment Management**: Schedule assignments for classrooms and allow students to submit them.
- **Error Handling**: Provides feedback for invalid commands, such as when trying to enroll students into non-existent classrooms.

### How to Run
1. Clone the repository.
   ```bash
   git clone https://github.com/yourusername/virtual-classroom-manager.git
   ```
2. Navigate to the project directory.
   ```bash
   cd virtual-classroom-manager
   ```
3. Compile and run the `VirtualClassroomManager` class.
   ```bash
   javac VirtualClassroomManager.java
   java VirtualClassroomManager
   ```
4. Use the commands listed in the problem statement (e.g., `add_classroom`, `add_student`, etc.) to interact with the system.

### Example Commands:
- `add_classroom Math101`
- `add_student S001 Math101`
- `schedule_assignment Math101 Homework 1`
- `submit_assignment S001 Math101 Homework 1`

---

## Six Design Pattern Use Cases

This section contains implementations of six different design patterns, demonstrating the power of common software design solutions.

### Behavioral Design Patterns

1. **Observer Pattern**
   - Used to notify multiple objects about changes to another object (e.g., a notification system).
   - Located in: `ObserverPatternDemo.java`
  
2. **Command Pattern**
   - Encapsulates a request as an object, allowing for parameterization and queuing of requests.
   - Located in: `CommandPatternDemo.java`

### Creational Design Patterns

1. **Singleton Pattern**
   - Ensures that a class has only one instance and provides a global point of access to it.
   - Located in: `SingletonPatternDemo.java`

2. **Factory Method Pattern**
   - Provides an interface for creating objects but allows subclasses to decide which class to instantiate.
   - Located in: `FactoryPatternDemo.java`

### Structural Design Patterns

1. **Adapter Pattern**
   - Allows incompatible interfaces to work together by wrapping one class inside another.
   - Located in: `AdapterPatternDemo.java`

2. **Decorator Pattern**
   - Dynamically adds behavior or responsibilities to an object without affecting other objects of the same class.
   - Located in: `DecoratorPatternDemo.java`

### How to Run

1. Clone the repository.
   ```bash
   git clone https://github.com/yourusername/design-pattern-examples.git
   ```
2. Navigate to the respective project directory and compile the Java files.
   ```bash
   cd design-pattern-examples
   javac *.java
   ```
3. Run any of the provided demos.
   ```bash
   java ObserverPatternDemo
   java CommandPatternDemo
   java SingletonPatternDemo
   java FactoryPatternDemo
   java AdapterPatternDemo
   java DecoratorPatternDemo
   ```

---

## Project Structure

```
.
├── VirtualClassroomManager.java     # Main class for the Virtual Classroom Manager
├── ObserverPatternDemo.java         # Demonstrates Observer Pattern
├── CommandPatternDemo.java          # Demonstrates Command Pattern
├── SingletonPatternDemo.java        # Demonstrates Singleton Pattern
├── FactoryPatternDemo.java          # Demonstrates Factory Method Pattern
├── AdapterPatternDemo.java          # Demonstrates Adapter Pattern
└── DecoratorPatternDemo.java        # Demonstrates Decorator Pattern
```

---

