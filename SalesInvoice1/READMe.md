
# SalesInvoice1

Simple Java console application demonstrating a basic Sales Invoice system. This project contains a minimal program (entry point `src/Main.java`) used for educational purposes in an OOP class.

**Table of Contents**
- **Description:** What the project does
- **Requirements:** Java version
- **Project Structure:** Key files and folders
- **Build & Run:** Commands to compile and execute
- **Usage:** Typical program flow
- **Notes & Contribution:** Extra info

**Description:**
- A small Java application that demonstrates invoice creation and output to the console. Intended as a classroom/example project for OOP concepts (classes, objects, basic I/O).

**Requirements:**
- Java JDK 8 or later installed and available on your PATH.

**Project Structure:**
- `src/` : Java source files. The main entry point is `src/Main.java`.
- `Invoice.iml`, project metadata files used by the IDE.

**Build & Run (Windows PowerShell):**
1. Open a PowerShell terminal and change directory into the project:

```
cd "c:\Users\USER\Desktop\Bsc. Computer Science\Year2\2.2\OOP\GITHUB\SalesInvoice1"
```

2. Compile the Java sources:

```
javac -d out -sourcepath src src\Main.java
```

3. Run the program:

```
java -cp out Main
```

If your `Main` class is in a package, adjust the `javac`/`java` commands to include the package path (for example `src\com\example\Main.java` and run `java com.example.Main`).

**Usage:**
- The program runs in the console. Follow on-screen prompts (if any) to create invoices and view outputs. For a classroom submission, keep input and output simple as per assignment instructions.

**Notes & Contribution:**
- This is a small educational project — feel free to extend it by adding classes for `Customer`, `InvoiceItem`, persistent storage (files/DB), or a simple GUI.
- If you want me to expand the README with example input/output, UML diagrams, or instructions to run in an IDE (IntelliJ/NetBeans/Eclipse), tell me which format you prefer.

---
Generated/updated by assistant — let me know if you want changes.
