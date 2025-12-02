<div align="center">

<b style="font-size: 32px;">✨🌌 L O S T &nbsp; &nbsp; &nbsp;  F O U N D &nbsp; U N I V E R S E 🌌✨</b><br>
<i>A cosmic tool for navigating forgotten memories, missing items, and emotional gaps.</i>

<br><br>

CS 2105 <br>
Claire Nicole Bay <br>
Alodivinno Ricco Cantos <br>
Erika Ysobelle Larga

</div>
</br>

## 🪐 **Overview**
Lost & Found Universe is an interactive journaling-inspired console system designed to help users map out meaningful parts of their past. It serves as a reflective space to help users document and revisit the memories they've made with people they’ve crossed paths with, the moments that shaped them, and the items or connections that may no longer be present in their lives.

Through guided prompts and categorized memory entries, the program encourages users to explore the “lost memories” within their personal universe, making it easier to revisit moments that may have faded over time and bring clarity to what may otherwise remain unnoticed.

</br>

## 🌠 Features Included
✔ Memory categorization
Lost items, people, and moments in time

Custom descriptions and contextual details

✔ Status tracking
Mark memories as Found

Delete specific entries

View universal statistics

✔ Prompt generator
Provides reflective questions such as:

"What is something small you lost but still remember clearly?"

"Who is a person you lost touch with and what is the last thing you remember them saying?"

</br>

## 💎 Object-oriented Principles for "Lost & Found Universe"

This project utilizes key **Object-Oriented Programming (OOP) principles** in Java to manage different types of "memories" (**Person**, **Item**, **Time**).

### 1. Encapsulation

Encapsulation is achieved by **bundling data and methods** within classes and protecting the internal state using the `private` access modifier.

  * In the **Memory** class (the parent class), properties like `name`, `description`, `tag`, and `status` are protected (e.g., set in the constructor and modified via public methods like `found()`).
  * In **MemoryManager**, the `memories` `ArrayList` is declared as **private**, meaning it can only be directly accessed and manipulated through the class's public methods such as `addMemory()`, `displayAll()`, `markAsFound()`, and `deleteMemory()`. This prevents unauthorized external modification of the core data collection.

### 2. Abstraction

Abstraction is implemented through the **Memory** class, which acts as a blueprint for all specific types of lost memories.

  * The **Memory** class defines a **common interface** and essential properties (name, description, tag, status) and abstract behaviors (`lost()`, `found()`, `display()`).
  * The **MemoryManager** only interacts with the **Memory** type, calling generic methods like `m.lost()` or `m.display()`. It abstracts away the category-specific complexity, meaning the manager doesn't need to know the specific details of how a `Person` is lost versus how an `Item` is lost.

### 3. Inheritance

Inheritance is extensively used to establish a **class hierarchy** and **reuse common code**.

  * The **Memory** class is the **parent class** (superclass).
  * **Person**, **Item**, and **Time** are **child classes** (subclasses) that `extend` **Memory**, inheriting its common properties (`name`, `description`, `tag`, `status`) and methods.
  * The child classes add their own unique properties (e.g., `relationship` in `Person`, `locationLost` in `Item`, `dateLost` in `Time`) while reusing the core memory structure.

### 4. Polymorphism

Polymorphism (meaning "many forms") is demonstrated in two main ways: **Method Overriding** and **Reference Type**.

  * **Method Overriding:** Each subclass (**Person**, **Item**, **Time**) **overrides** the generic `lost()`, `found()`, and `display()` methods inherited from the **Memory** parent class to provide **category-specific logic and output**. For example, `Item.lost()` prints the location, while `Person.lost()` prints the relationship.

  * **Polymorphic Collection:** The `memories` `ArrayList` in **MemoryManager** stores objects of the generic `Memory` type:

    ```java
    private ArrayList<Memory> memories = new ArrayList<>();
    ```

    This single collection can hold instances of any of the subclasses (`Person`, `Item`, or `Time`). When `manager.displayAll()` is called, the line `m.display()` executes the correct, overridden `display()` method for the *actual* type of the object at runtime, enabling flexible, dynamic behavior.

</br>

## ⚙️ System Requirements

To run the "Lost & Found Universe" console application, you will need the following:

### 💻 Environment

  * **Java Development Kit (JDK):** Version 8 or higher is required to compile and run the Java source files.
  * **Operating System:** Any major OS that supports the Java Virtual Machine (JVM), including Windows, macOS, or Linux.

### 🔧 Compilation and Execution

1.  **Compile:** Compile all `.java` files (`Main.java`, `MemoryManager.java`, `Memory.java`, `Person.java`, `Item.java`, `Time.java`) using the Java compiler:
    ```bash
    javac *.java
    ```
2.  **Run:** Execute the main class:
    ```bash
    java Main
    ```
</br>

## 📸 Sample Output
    ```bash
=========================================
   *       .    ____   ____   *     *      
     .        / ____| / ___|       .
             | |      \___ \          .
    .        | |___    ___) |          .
  *       .   \____|  |____/  .
     .          2  1  0  5 .         *
==========================================
 L O S T   &   F O U N D   U N I V E R S E
------------------------------------------ 
[1] Add Memory
[2] View All Memories
[3] Mark as Found
[4] Delete Memory
[5] Exit

Enter choice: 1

Select Memory Type:
[1] Person
[2] Item
[3] Time
Choice:

    ```

</br>

## 📁 Project Structure
```bash
│── Main.java
│── Memory.java
│── MemoryManager.java
│── Person.java
│── Item.java
│── Event.java
│── PromptGenerator.java
└── README.md
```
</br>

## ⭐ Why Use Lost & Found Universe?
Exploring one’s inner world should be an empowering experience.
Every person carries a universe within, filled with people who shaped them, moments that strengthened them, and memories that taught them. Lost & Found Universe turns these scattered fragments into a guided, meaningful journey, helping users explore the galaxies of their past with clarity and intention.

✨ *Rediscover your universe, one star at a time.* ✨


</br>

## 📜 Acknowledgement

This project was brought to life through a constellation of guidance, patience, and support that helped turn an idea into an entire universe.

We extend our deepest gratitude to our CS 211: Object‑Oriented Programming instructor, **Ma’am Fatima Marie Agdon*, whose steady encouragement and insightful lectures shaped the direction of this project. 

To our classmates and friends, thank you for the shared laughter, support, and encouragement throughout the journey. Your presence made this project feel less like a requirement and more like a collaborative exploration.

To our team, whose commitment to our growth and self-discovery made this project possible. Our efforts and dedication made us the brightest part of this project.

Finally, to all the people, memories, and moments that remind us how deeply human it is to lose, find, and rediscover—this project is for you.

**🌌 Thank you for helping us build a universe worth exploring**

</br>

<div align="center">
Created by Claire Nicole Bay, Alodivinno Ricco Cantos, & Erika Ysobelle Larga
🌟 BSCS Students — 2025 🌟

</div>
