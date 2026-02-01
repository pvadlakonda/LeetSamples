# LeetCode & Interview Practice Solutions

A comprehensive collection of Java solutions for LeetCode problems and classic coding interview questions from "Cracking the Coding Interview".

## 📁 Repository Structure

```
src/
├── main/java/
│   ├── com/leetcode/samples/          # LeetCode problem solutions
│   └── com/interview/code/cracking/   # Cracking the Coding Interview solutions
└── test/java/                         # JUnit test cases
    ├── com/leetcode/samples/
    └── com/interview/code/cracking/
```

## 🧩 LeetCode Problems (15 Solutions)

### Array & String Problems
- **Two Sum** - Find indices of two numbers that add up to target
- **Two Sum II (Sorted Array)** - Two sum variant for sorted arrays
- **Rotate Array** - Rotate array elements by k positions
- **Majority Element** - Find the majority element in an array
- **Reverse String** - Reverse a string in-place
- **First Unique Character** - Find first non-repeating character
- **Longest Substring Without Repeating Characters** - Sliding window approach
- **Longest Palindromic Substring** - Dynamic programming solution
- **GCD of Strings** - Greatest common divisor of two strings
- **Decode String** - Stack-based string decoding
- **String Compression** - Compress strings using character counts

### Linked List Problems
- **Add Two Numbers** - Add numbers represented as linked lists
- **Linked List Cycle** - Detect cycles in linked lists
- **Merge Two Sorted Lists** - Merge two sorted linked lists

### Design Problems
- **Insert Delete GetRandom O(1)** - Randomized set data structure

### Graph/Tree Problems
- **Minimum Cost to Connect Ropes** - Priority queue/heap problem
- **Palindrome Number** - Check if number is palindrome

## 📚 Cracking the Coding Interview (5 Solutions)

Classic problems from the renowned interview preparation book:

- **Unique Characters** - Check if string has all unique characters
- **String Permutation** - Check if one string is permutation of another
- **String Compression** - Compress strings (aabcccccaaa → a2b1c5a3)
- **Merge Two Linked Lists** - Merge two sorted linked lists
- **Hello World** - Basic setup example

## 🛠️ Technology Stack

- **Language**: Java
- **Testing Framework**: JUnit 5
- **Build Tool**: IntelliJ IDEA project structure
- **Java Version**: Compatible with Java 8+

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE
- JUnit 5 dependencies (included in `lib/` directory)

### Running the Code

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd LeetSamples
   ```

2. **Open in IntelliJ IDEA**
   - Open the project directory in IntelliJ IDEA
   - The IDE will automatically detect the project structure

3. **Run individual solutions**
   - Navigate to any class in `src/main/java/`
   - Right-click and select "Run" to execute main methods (where available)

4. **Run tests**
   - Navigate to test classes in `src/test/java/`
   - Right-click on test classes and select "Run Tests"
   - Or run all tests using your IDE's test runner

### Example Usage

```java
// Two Sum example
TwoSum solution = new TwoSum();
int[] nums = {2, 7, 11, 15};
int[] result = solution.twoSum(nums, 9);
// Returns [0, 1]

// Unique Characters example
UniqueChars checker = new UniqueChars();
boolean isUnique = checker.hasUniqueChars("abcdef"); // true
boolean hasDuplicates = checker.hasUniqueChars("hello"); // false
```

## 🧪 Testing

Each solution includes comprehensive JUnit test cases covering:
- Basic functionality
- Edge cases
- Multiple test scenarios
- Expected vs actual result validation

Run tests to verify solution correctness:
```bash
# In your IDE, right-click on test packages and select "Run All Tests"
```

## 📈 Problem Difficulty Distribution

- **Easy**: 8 problems (Two Sum, Palindrome Number, etc.)
- **Medium**: 6 problems (Add Two Numbers, Longest Substring, etc.)
- **Hard**: 1 problem (Median of Two Sorted Arrays)

## 🎯 Key Algorithms & Data Structures

- **Hash Maps/Sets** - Two Sum, First Unique Character
- **Two Pointers** - Two Sum II, Linked List Cycle
- **Sliding Window** - Longest Substring
- **Dynamic Programming** - Longest Palindrome
- **Stack** - Decode String
- **Priority Queue/Heap** - Min Cost Connect Ropes
- **Linked List Manipulation** - Add Two Numbers, Merge Lists
- **String Processing** - Various string problems

## 🤝 Contributing

Feel free to contribute by:
1. Adding new problem solutions
2. Improving existing solutions
3. Adding more comprehensive test cases
4. Optimizing algorithms for better time/space complexity

## 📝 Notes

- All solutions include detailed comments explaining the approach
- Time and space complexity analysis provided where applicable
- Multiple solution approaches included for some problems
- Test cases cover various scenarios including edge cases

## 📄 License

This project is for educational purposes and interview preparation.

---

**Happy Coding!** 🚀

*This repository serves as a comprehensive resource for technical interview preparation, covering essential algorithms and data structures through practical problem-solving.*