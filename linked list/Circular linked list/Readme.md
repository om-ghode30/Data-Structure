Here's a detailed and well-structured `README.md` file for both **Circular Singly Linked List** and **Circular Doubly Linked 
# Circular Singly Linked List in Java

## 📌 What is a Circular Singly Linked List?

A **Circular Singly Linked List** is a variation of the singly linked list where the last node points back to the head node instead of pointing to `null`.

This creates a **circular loop** structure where you can traverse the list infinitely by moving through the `next` pointers.

## 🔗 Structure

Each node contains:
- `data`: The value/data stored in the node.
- `next`: A reference to the next node in the list.

```

head --> Node1 --> Node2 --> Node3 --+
^                        |
+------------------------+

````

## 🧠 Key Properties

- The `head` points to the first node.
- The `next` of the last node points to the `head`.
- There is no `null` in the list.

## ✅ Operations Implemented

- `insert_at_beginning(data)`: Add a new node at the beginning.
- `insert_at_last(data)`: Add a new node at the end.
- `insert_at_position(data, position)`: Add a new node at a specific position.
- `delete_at_beginning()`: Delete the first node.
- `delete_at_last()`: Delete the last node.
- `delete_at_position(position)`: Delete a node at a specific position.
- `traverse()`: Display the elements of the list.

## 💡 Use Cases

- Circular scheduling (e.g., round-robin in CPU scheduling)
- Multiplayer games (players arranged in a circular turn order)
- Buffer management in operating systems

## ⚙️ Example (Java)

```java
s.insert_at_begning("A");
s.insert_at_last("B");
s.insert_at_Position("C", 2);
s.traverse();
````

## 📁 File Structure

```
CircularSinglyLinkedList/
├── Node.java
├── Singly_linked_list.java
├── single_linked.java (main class)
└── README.md
```

## 🧪 Test Cases

```java
s.insert_at_last("X");
s.insert_at_last("Y");
s.delete_at_position(2); // Deletes "Y"
```

## 📚 Reference

* [GeeksForGeeks - Circular Linked List](https://www.geeksforgeeks.org/circular-linked-list/)
* [Java Documentation](https://docs.oracle.com/javase/)

---

````

---

## ✅ `README.md` for **Circular Doubly Linked List**

```markdown
# Circular Doubly Linked List in Java

## 📌 What is a Circular Doubly Linked List?

A **Circular Doubly Linked List** is a variation of a doubly linked list where:
- Each node has two pointers: `next` and `prev`.
- The `next` of the last node points to the `head`.
- The `prev` of the head points to the last node.

````

<--> Node1 <--> Node2 <--> Node3 <-->
^                              |
+------------------------------+

````

## 🔗 Structure

Each node contains:
- `data`: Value/data of the node
- `next`: Pointer to the next node
- `prev`: Pointer to the previous node

## 🧠 Key Properties

- Bidirectional traversal: Forward (`next`) and backward (`prev`)
- Circular: `last.next = head` and `head.prev = last`
- No `null` references

## ✅ Operations Implemented

- `insert_at_beginning(data)`
- `insert_at_last(data)`
- `insert_at_position(data, position)`
- `delete_at_beginning()`
- `delete_at_last()`
- `delete_at_position(position)`
- `traverse_forward()`
- `traverse_backward()`

## 💡 Use Cases

- Advanced memory management
- Navigation systems (backward and forward movement)
- MRU/LRU cache design

## ⚙️ Example (Java)

```java
d.insert_at_last(10);
d.insert_at_last(20);
d.insert_at_beginning(5);
d.traverse_forward(); // 5 -> 10 -> 20
d.traverse_backward(); // 20 -> 10 -> 5
````

## 📁 File Structure

```
CircularDoublyLinkedList/
├── DNode.java
├── Doubly_linked_list.java
├── double_linked.java (main class)
└── README.md
```

## 🧪 Test Cases

```java
d.insert_at_position(15, 2);
d.delete_at_position(1);
d.traverse_forward();
```

## 📚 Reference

* [GeeksForGeeks - Doubly Circular Linked List](https://www.geeksforgeeks.org/circular-doubly-linked-list/)
* [Java Collections Overview](https://docs.oracle.com/javase/)

