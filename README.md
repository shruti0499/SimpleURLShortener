# SimpleURLShortener

A simple URL shortener backend built using Java (without ORM) and plain HTML/CSS.

## Features
- Anonymous URL shortening
- Placeholder for user login and custom URL feature
- No frameworks (Angular/React)

## How to Run
```bash
javac -d out $(find ./src -name "*.java")
java -cp out Main
```

Then open `web/html/index.html` in a browser to test shortening.

## Project Structure
- `src/` – Java source files
- `web/html/` – Frontend HTML pages
- `web/css/` – Stylesheet

## GitHub Actions
CI is set up to build and test on pull requests and main branch pushes.
