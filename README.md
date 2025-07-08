A lightweight Java-based URL shortener with a minimal front-end, built without ORM 
— focusing on core logic, clean architecture, and testability with JUnit 5.

---

 Features

- Convert long URLs into short, shareable links
- Optional custom short codes
- Pure Java (No Spring, No Hibernate)
- Unit tested using JUnit 5
- Basic front-end (HTML + CSS )

---

## Project Structure

```
SimpleURLShortener/
├── src/
│   ├── controller/
│   ├── service/
│   ├── util/
│   └── Main.java
├── src/test/java/
│   ├── controller/
│   ├── service/
│   └── util/
├── web/
│   ├── index
├── assets/
├── README.md
├── .gitignore
└── pom.xml

---

## Running Tests

```bash
# If using Maven:
mvn test
```

All tests are written in `src/test/java` using JUnit 5.

---

## How to Run

1. Clone the repository
2. Compile and run `Main.java`
3. Or, open `web/index.html` in browser for front-end

---
