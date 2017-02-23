We know that Queue follows First-In-First-Out model but sometimes we need to process the objects in the queue based on the priority. That is when JavaPriorityQueue is used.

For example, let’s say we have an application that generates stocks reports for daily trading session. This application processes a lot of data and takes time to process it. So customers are sending request to the application that is actually getting queued but we want to process premium customers first and standard customers after them. So in this case PriorityQueue implementation in java can be really helpful.

PriorityQueue is an unbounded queue based on a priority heap and the elements of the priority queue are ordered by default in natural order. We can provide a Comparator for ordering at the time of instantiation of priority queue.

Java Priority Queue doesn’t allow null values and we can’t create PriorityQueue of Objects that are non-comparable. We use java Comparable and Comparator for sorting Objects and Priority Queue use them for priority processing of it’s elements.

The simplest way to implement a priority queue data type is to keep an associative array mapping each priority to a list of elements with that priority. If association lists or hash tables are used to implement the associative array, adding an element takes constant time but removing or peeking at the element of highest priority takes linear (O(n)) time, because we must search all keys for the largest one. If a self-balancing binary search tree is used, all three operations take O(log n) time; this is a popular solution in environments that already provide balanced trees but nothing more sophisticated.

There are a number of specialized heap data structures that either supply additional operations or outperform the above approaches. The binary heap uses O(log n) time for both operations, but allows peeking at the element of highest priority without removing it in constant time. Binomial heaps add several more operations, but require O(log n) time for peeking. Fibonacci heaps can insert elements, peek at the maximum priority element, and decrease an element’s priority in amortized constant time (deletions are still O(log n)).


