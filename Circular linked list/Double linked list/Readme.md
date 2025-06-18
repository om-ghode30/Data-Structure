
# 🔁 Doubly Linked List in Java

---

## 📌 Description

This project implements a **Doubly Linked List (DLL)** in Java — a fundamental and versatile data structure. The list supports:

* **Insertion**: At the beginning, end, or a specific position.
* **Deletion**: From the beginning, end, or a specific position.
* **Traversal**: In both forward and backward directions.
* **Search**: Element search and index-based search.

---

## 🧠 What is a Doubly Linked List?

A **Doubly Linked List** is a linear data structure where each node contains three parts:

* **Data**: The actual value to store (here, a `String`).
* **Next**: A reference to the next node.
* **Previous**: A reference to the previous node.

### Example Representation:

`null ← [ A ] ⇄ [ B ] ⇄ [ C ] → null`

Unlike a singly linked list, DLL allows **bidirectional traversal** and makes insertions/deletions at both ends more efficient.

---

## 🌍 Real-Life Analogy

Imagine navigating through your browser history:

* Pressing **forward** and **backward** buttons behaves like traversing a doubly linked list.
* Each web page is a node, with links to the **previous** and **next** pages.

---

## 🏗️ Class Structure

### 🔹 `Node` Class

Represents one node of the DLL:
* `data`: Stores the value.
* `pre_node`: Pointer to the previous node.
* `next_node`: Pointer to the next node.

### 🔹 `Double_linked_list` Class

Implements operations on the DLL:
* `insert_at_begning(String data)`
* `insert_at_last(String data)`
* `insert_at_Position(String data, int position)`
* `Delete_at_begning()`
* `Delete_at_last()`
* `Delete_at_position(int position)`
* `traverse_forward()`
* `traverse_backward()`
* `Search(String data)`
* `SearchIndex(String data)`

### 🔹 `double_linked` Class

The **driver class** with the `main()` method. It demonstrates and tests all core linked list operations.

---

## 🧪 Sample Output

```

A-->B-->C-->D-->E
E<--D<--C<--B<--A
D Element Found.
D Element Found at position 4
C is deleted sucessfully!
A-->B-->D-->E
E is deleted sucessfully!
A is deleted sucessfully!
B-->D

```

---

## ✅ Key Features

* **Two-way traversal** using `next` and `prev` references.
* **Dynamic memory management**.
* **Position-based insertion and deletion**.
* **Robust edge case handling** for empty list and invalid positions.
* **Search and index lookup** functionality.
* **Object-Oriented** design principles with encapsulation and abstraction.

---

## 🔧 Suggestions for Enhancement

* **Follow Java Naming Conventions**:
  - Rename methods to `camelCase` (e.g., `setData()`, `deleteAtBeginning()`).
* **Use Java Generics**:
  - Generalize the data type of the node from `String` to `T`.
* **Add Exception Handling**:
  - For invalid positions or null dereferences.
* **Implement Length Tracking**:
  - Keep a `size` variable to improve performance for certain operations.
* **Add Update Feature**:
  - Update the value at a specific index.
* **Create a GUI**:
  - Optional visual representation using Java Swing or JavaFX.

---

## 🚀 Applications of Doubly Linked List

* Browser history navigation (forward/backward).
* Undo/redo functionality in editors.
* Music playlists or slideshows (previous/next control).
* MRU/LRU caches in memory management.

```

Let me know if you'd like:

* UML diagram or ASCII visualization.
* Complexity analysis (time/space).
* JUnit test cases.
* Enhanced menu-based console application.


