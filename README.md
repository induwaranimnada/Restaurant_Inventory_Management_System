# Restaurant Inventory Management System

## Project Overview

The Restaurant Inventory Management System is a Command Line Interface (CLI) application developed using Java. This system helps restaurant staff manage ingredients efficiently by providing basic inventory management functions such as adding, viewing, searching, deleting, and updating stock levels.

The project demonstrates the practical application of Data Structures and Algorithms to solve a real-world inventory management problem.

---

## Features

- Secure Admin Login
- Add New Ingredients
- View All Ingredients
- Search Ingredients
- Delete Ingredients
- Undo Delete Operation
- Stock In
- Stock Out
- Kitchen Request Queue
- Low Stock Report
- Inventory Summary Report

---

## Data Structures Used

### 1. LinkedList
Used to store all ingredient records dynamically.

### 2. Stack
Used to implement the Undo Delete feature.

### 3. Queue
Used to manage kitchen ingredient requests using FIFO.

---

## Algorithms Used

- Linear Search
- LinkedList Traversal
- FIFO (First In First Out)
- LIFO (Last In First Out)

---

## Technologies

- Java
- Java Collections Framework
- Visual Studio Code
- Command Line Interface (CLI)

---

## Project Structure

```
RestaurantInventorySystem
│
├── src
│   ├── Main.java
│   ├── Ingredient.java
│   ├── Inventory.java
│   ├── UndoStack.java
│   ├── KitchenQueue.java
│   └── Report.java
│
└── README.md
```

---

## How to Run

### Step 1

Open the project using Visual Studio Code.

### Step 2

Open the terminal.

### Step 3

Compile the project.

```bash
javac src/*.java
```

### Step 4

Run the project.

```bash
java -cp src Main
```

---

## Default Login

Username

```
admin
```

Password

```
1234
```

---

## Sample Menu

```
1. Add Ingredient
2. View Ingredients
3. Search Ingredient
4. Delete Ingredient
5. Stock In
6. Stock Out
7. Add Kitchen Request
8. Process Kitchen Request
9. View Kitchen Requests
10. Undo Delete
11. Low Stock Report
12. Inventory Report
13. Exit
```

---

## Learning Outcomes

This project demonstrates:

- Object-Oriented Programming (OOP)
- LinkedList Operations
- Stack Operations
- Queue Operations
- Searching Algorithms
- Inventory Management Concepts
- Java Console Application Development

---

## Future Improvements

- Database Integration
- Graphical User Interface (GUI)
- File Handling
- Barcode Scanner Support
- Supplier Management
- Expiry Date Management
- Sales Module

---

## Author

Name : Induwara Nimnada

Course : ICT 143-2 – Data Structures and Algorithms

Faculty : Faculty of Technological Studies

University : Uva Wellassa University of Sri Lanka

---

## License

This project was developed for academic purposes only.
