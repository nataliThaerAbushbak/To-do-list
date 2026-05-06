# Java To-Do List

This project is a console-based To-Do List application developed using Java. The main objective of the project is to demonstrate the implementation of fundamental object-oriented programming concepts and custom data structures through a practical task management system.

The application allows users to create and manage tasks dynamically using a custom singly linked list implementation rather than Java’s built-in collection classes. Each task is assigned a unique identifier and can be searched, updated, displayed, or removed from the list.

The project was developed as an academic programming exercise to strengthen understanding of linked lists, node manipulation, object-oriented design, and basic data management operations. :contentReference[oaicite:0]{index=0}

---

## Features

- Add new tasks dynamically
- Assign a unique ID to each task
- Search for tasks by ID
- Mark tasks as completed or uncompleted
- Display completed tasks
- Display uncompleted tasks
- Delete tasks from the list
- Clear all tasks from memory

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Custom Singly Linked List
- Console-Based User Interaction

---

## Project Structure

The project consists of two main classes:

### `ToDoList.java`
Implements the core logic of the application using a custom linked list structure.  
This class contains:

- Task node definition
- Task insertion
- Task deletion
- Search operations
- Status management
- Traversal operations

### `ToDoListDemo.java`
Contains the `main` method used to test and demonstrate the functionality of the application by creating tasks and performing different operations on the list. :contentReference[oaicite:1]{index=1}

---

## Concepts Demonstrated

This project applies several important programming concepts, including:

- Classes and objects
- Nested classes
- Generic programming
- Encapsulation
- Dynamic memory allocation
- Linked list traversal
- Conditional logic
- Data organization and manipulation

---

## How the System Works

Each task is represented as a node in a singly linked list.  
Every node stores:

- Task name
- Task ID
- Completion status
- Reference to the next task

When a new task is added, the application automatically generates an incremental ID and inserts the task at the end of the list.

The system also allows tasks to be searched using their ID and enables the user to update the completion status of any task. Completed and uncompleted tasks can be displayed separately through traversal operations.

---

## Sample Operations

The application demonstrates operations such as:

```java
list.addTask("Go to work");
```text
## Purpose of the Project

The purpose of this project is to provide practical experience in implementing data structures manually and applying object-oriented programming principles in Java.

Instead of relying on Java collection frameworks, the project focuses on building a custom linked list from scratch in order to better understand how dynamic data structures operate internally.

The project also demonstrates how basic task management functionality can be implemented using traversal, insertion, deletion, and search algorithms.

## How to Run

1. Download or clone the repository.
2. Open the project in a Java IDE such as NetBeans, IntelliJ IDEA, or Eclipse.
3. Compile and run `ToDoListDemo.java`.
4. The console will display the output of the implemented operations.

## Academic Context

This project was developed as part of academic practice in Java programming and data structures. It focuses on strengthening understanding of linked list implementation, algorithmic thinking, and object-oriented software design through a simple real-world application.
```
list.search(3);
list.changeStat(3, false);
list.completedTasks();
