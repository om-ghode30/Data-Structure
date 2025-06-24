### ✅ Code Review Summary

You've implemented the following sorting algorithms in Java:

* ✔️ **Merge Sort** (recursive, with correct merging logic)
* ✔️ **Selection Sort** (ascending and descending)
* ✔️ **Bubble Sort** (ascending, with debug prints)

These are **fundamental sorting techniques** and perfect for showcasing in a GitHub data structure project.

---

### 📌 Example Inputs for Testing (To Use in `main()`)

You should include these example arrays when testing:

```java
int[] a = {12, 34, 87, 2, 5, 63, 4, 9}; // General unsorted input
int[] b = {1, 2, 3, 4, 5};              // Already sorted
int[] c = {5, 4, 3, 2, 1};              // Reverse sorted
int[] d = {10};                         // Single element
int[] e = {};                           // Empty array
```


````markdown
# Sorting Algorithms in Java

This project implements fundamental sorting techniques in Java. These are basic and widely taught sorting algorithms useful for learning how data ordering works in computer science.

## 🔧 Implemented Algorithms

### 1. Merge Sort (Recursive)
- **Divide and Conquer**
- **Time Complexity:** O(n log n)
- **Stable:** Yes
- **Space:** O(n)
- **Example Input:** `[12, 34, 87, 2, 5, 63, 4, 9]`

### 2. Selection Sort
- **Approach:** Select the smallest (or largest) element and place it at the correct position.
- **Time Complexity:** O(n²)
- **Stable:** No
- **Space:** O(1)
- **Implemented Versions:**
  - Ascending
  - Descending

### 3. Bubble Sort
- **Approach:** Repeatedly swap adjacent elements if they are in the wrong order.
- **Time Complexity:** O(n²)
- **Stable:** Yes
- **Space:** O(1)
- **Implemented Version:** Ascending (with debug output)

---

## 💻 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Sorting-Algorithms-Java.git
   cd Sorting-Algorithms-Java
````

2. Compile the code:

   ```bash
   javac slection_sort.java
   ```

3. Run the code:

   ```bash
   java slection_sort
   ```

---

## 📚 Example Use-Cases

These sorting algorithms are great for:

* Learning basic algorithmic thinking
* Understanding in-place vs. stable sorting
* Coding interviews (especially Selection and Merge Sort)

---

## 📁 File Structure

```
├── slection_sort.java     // All sorting methods and main()
├── README.md              // Project description and usage
```

---

## 🤝 Contribution

Pull requests and issue reports are welcome. Feel free to contribute more sorting methods like:

* Insertion Sort
* Quick Sort
* Counting Sort
* Radix Sort

---
