# binary-search-tree

Example of a binary search tree.

## Run

```bash
task run
```

## Advantages

- Efficient Searching: BSTs provide efficient searching operations. On average,
  the time complexity for searching, inserting, and deleting operations is
  O(log n), where n is the number of nodes in the tree. This makes BSTs suitable
  for applications where fast searching is required.
- Ordered Data Structure: BSTs maintain elements in a sorted order, which makes
  it easy to perform operations like finding the minimum and maximum elements in
  the tree, finding the successor or predecessor of a given element, and
  traversing elements in sorted order.
- Dynamic Structure: BSTs are dynamic data structures that allow for efficient
  insertion and deletion of elements while maintaining the binary search tree
  properties. This makes BSTs suitable for applications where the data is
  frequently changing.
- Space Efficiency: BSTs consume memory space proportional to the number of
  elements in the tree. Unlike other data structures like arrays, BSTs do not
  require a fixed amount of memory space, which can be advantageous when dealing
  with dynamic data.

## Disadvantages

- Unbalanced Trees: If elements are inserted in a sorted or nearly sorted order,
  the BST may become unbalanced, leading to degradation in performance. In the
  worst-case scenario, where the tree becomes skewed, the time complexity for
  operations can degrade to O(n), making the BST similar to a linked list.
- Complexity of Operations: While searching, inserting, and deleting operations
  have an average time complexity of O(log n), they can have a worst-case time
  complexity of O(n) if the tree is unbalanced. Balancing operations like AVL
  trees or Red-Black trees can mitigate this issue but add complexity to the
  implementation.
- Memory Overhead: BSTs require additional memory overhead to store
  pointers/references for each node, which can be significant for large
  datasets. This overhead increases memory consumption compared to other data
  structures like arrays.
- Sensitive to Input Order: The performance of BST operations heavily depends on
  the order in which elements are inserted. If elements are inserted in a
  specific order that leads to an unbalanced tree, the performance can degrade
  significantly.
