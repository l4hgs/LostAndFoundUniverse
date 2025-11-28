# 🌌 Lost & Found Universe  
*A cosmic tool for navigating forgotten memories, missing items, and emotional gaps.*

---

## 🪐 Overview  
Lost & Found Universe is an interactive journaling-inspired system designed to help users map out their memories and emotions from the past. It serves as a reflective space to help users travel through the memories they've made with people they’ve crossed paths with, the moments that shaped them, and the items or connections that may no longer be present in their lives. Through simple prompts, the program brings awareness to “lost memories” within their personal universe, making it easier to revisit moments that may have faded over time and bring clarity to what may otherwise remain unnoticed.

</br>

## 🌠 Purpose  
Lost & Found Universe is designed to create a supportive, organized environment where users can:

- 🌟 **Revisit memories from the past** through categorized entries  
- 🧭 **Identify emotional or memory gaps** through simple reflection prompts  
- 🕰️ **Visualize patterns across personal timelines**  
- 💫 **Reconnect with meaningful people, events, or objects** from different stages of life  
- 📘 **Maintain an organized archive of thoughts, experiences, and reflections**  
- ✨ **Use insights from past memories to support personal growth and self-awareness**  

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

## 🌌 Who Is It For?  
Lost & Found Universe is ideal for:

- Students navigating overwhelming schedules and emotional phases  
- Individuals who enjoy journaling, self-reflection, or personal growth  
- Users who wish to reconnect with past experiences  
- Anyone wanting an organized way to document moments, people, or feelings

</br>

## ⭐ Why Use Lost & Found Universe?  
Exploring one’s inner world should be an empowering experience.  
Every person carries a universe within, filled with people who shaped them, moments that strengthened them, and memories that taught them. Lost & Found Universe turns these scattered fragments into a guided, meaningful journey, helping users explore the galaxies of their past with clarity and intention.

✨ *Rediscover your universe, one star at a time.* ✨

*Created by Bay, Cantos, & Larga* 
