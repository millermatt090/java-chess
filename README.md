# Java Chess Application ♟️

A minimal Java-based chess engine (console) built with Maven and Docker.

---

## 🚀 Features
- Turn-based console gameplay
- Basic chess mechanics (Pawn, Rook)
- Dockerized build and run
- CI with GitHub Actions

---

## 🛠️ Local Development

### Build
mvn clean package

### Run
java -jar target/chess-1.0-SNAPSHOT.jar

---

## 🐳 Docker

### Build Image
docker build -t java-chess .

### Run Container
docker run -it java-chess

---

## 🔄 CI/CD
This repo includes a GitHub Actions workflow that:
- Builds the project on every push/PR to `main`
- Uses JDK 17 + Maven

---

## 📦 Versioning
Current version: `1.0-SNAPSHOT`

You can update this in `pom.xml`.

---

## 📁 Project Structure
src/
 └── main/java/com/example/chess/

---

## 🧠 Future Improvements
- Full chess rules (check, mate, castling)
- AI opponent
- GUI (JavaFX or Web)

---

## 📄 License
MIT (you can add this if publishing)