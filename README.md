# Final Exam - Programming Questions

Your name:  `INSERT YOUR NAME HERE`

## Getting Started

Clone the code from this repository.  The repository contains a `build.gradle` and some test code for each of the three programming questions (found in `TestCode.java`).  You can run this test code using `gradle run`, but you may wish to comment out some of this test code during development (so that you don't get errors for the parts you haven't finished, yet).  Be sure to fully test your code before you submit, including trying alternative data.

## Programming Question 1 (25 marks)

Create a Java class with a function (`maxDivideAndConquer`), which uses the divide and conquer strategy to search for the maximum value within an (unsorted) array (of type int).

Note: Failure to use the divide and conquer strategy, even if your algorithm works otherwise, will not result in full marks for this question.

Hint: A binary search-like strategy would not be appropriate for this question, since the elements are not sorted.

Test code:
```
int[] list1 = {1,-1,6,3,-4,14,-20};
System.out.println("maxDivideAndConquer({1,-1,6,3,-4,14,-20}): " + MaxDC.maxDivideAndConquer(list1));
// 14

int[] list2 = {-32,6,11,-17,2,-12,30,-8,27};
System.out.println("maxDivideAndConquer({-32,6,11,-17,2,-12,30,-8,27}): " + MaxDC.maxDivideAndConquer(list2));
// 30    
```

Test code output:
```
maxDivideAndConquer({1,-1,6,3,-4,14,-20}): 14
maxDivideAndConquer({-32,6,11,-17,2,-12,30,-8,27}): 30
```

Commit and push your code, and ensure that the file `MaxDC.java` has been updated on GitHub.

## Programming Question 2 (40 marks)

Create a Java class (`ChainingHashTable`), which implements a hash table using separate chaining.

Your class will use an array to implement a hash table that uses separate chaining to resolve collisions.  The required functions you must include are listed, below:

- `Student get(String key)` - returns the `Student` associated with the key `key`
- `Student put(String key, Student newValue)` - if the key `key` already exists in the hash table, then replace its value with `newValue`.  If the key does not exist in the hash table, add `key` and its corresponding value `newValue`
 - `Collection<String> keySet()` - returns a `Collection` (which could be an `ArrayList`) which contains all of the keys
 - `print()` - prints the contents of the hash table in two columns:
	- `index` - the index within the hash table
	- `values` - the `Student` values stored at that index

Separate chaining involves using a list to store all of the elements at a given index, rather than finding another index for an element when a collision is found.  Your implementation can use an `ArrayList` or any other list/array structure for the chains.

Test code:
```
ChainingHashTable table = new ChainingHashTable(13);

table.put("100426001", new Student("100426001", "First", "Student", 0.5f));
table.put("100809002", new Student("100809002", "Second", "Student", 1.0f));
table.put("100113004", new Student("100113003", "Third", "Student", 1.5f));
table.put("100725003", new Student("100725004", "Fourth", "Student", 2.0f));
table.put("100603005", new Student("100603005", "Fifth", "Student", 2.5f));
table.put("100399006", new Student("100426006", "Sixth", "Student", 3.0f));

table.print();
```

Test code output:
```
index   values
    0
    1   First Student (100426001, 0.5)
    2
    3   Sixth Student (100426006, 3.0)
    4
    5
    6   Second Student (100809002, 1.0) Fifth Student (100603005, 2.5)
    7
    8   Third Student (100113003, 1.5)
    9
   10
   11
   12   Fourth Student (100725004, 2.0)
```

Commit and push your code, and ensure that the file `ChainingHashTable.java` has been updated on GitHub.

## Programming Question 3 (30 marks)

Create a Java class (`LinkedListQueue`), which uses a doubly-linked list structure to implement a queue. The class will take a type parameter `T`, which is the data type of the value in the queue nodes.  The required functions you must include are listed, below:

- `enqueue()` - adds a new element to the back of the queue
- `dequeue()` - removes the front element of the queue
- `size()` - returns the number of elements in the queue
- `isEmpty()` - return `true` if the queue is empty, `false` otherwise

Test code:
```
LinkedListQueue<String> queue = new LinkedListQueue<>();

queue.enqueue("A");
queue.enqueue("B");
queue.enqueue("C");
queue.enqueue("D");

System.out.printf("Size: %d\n", queue.size());

while (!queue.isEmpty()) {
	System.out.println(queue.dequeue());
}
```

Test code output:
```
Size: 4
A
B
C
D
```

Commit and push your code, and ensure that the file `LinkedListQueue.java` has been updated on GitHub.

## Academic Integrity
This is exam is an individual assessment.  You are not permitted to seek help from anyone when solving these questions (even technical support with your environment).  The invigilators (the TAs and the instructor) will be available to clarify questions, but will not help you fix your errors.  Communicating with anyone other than the invigilators is prohibited.

Students found to be copying code from one another will be reported to the academic dishonesty committee.  This includes both the student who copied the code, but also the student who made their code visible to other students (whether intentionally or accidentally).