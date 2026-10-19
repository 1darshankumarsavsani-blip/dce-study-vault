# 📚 Dynamic Webpage Development (DWD) - Quick Revision Notes
**Semester:** 5th Semester DCE | **Platform:** PHP & MySQL

---

## 1. HTTP Architecture & Request Methods
- **GET Method:**
  - Data is passed via URL query parameters (`?key=value`).
  - Insecure for passwords/sensitive payloads; length limited by URL length restrictions.
  - Cached and bookmarked by default.
- **POST Method:**
  - Data is encapsulated securely inside the HTTP request body.
  - Not visible in the URL; supports file uploads (`multipart/form-data`).

---

## 2. Search Engine Mechanics
1. **Crawling:** Automated bots (spiders) traversing links across the web graph.
2. **Indexing:** Parsing HTML, extracting titles/meta-tags, and storing tokens into an Inverted Index.
3. **Ranking:** Calculating relevance using algorithms (TF-IDF, PageRank) based on query keywords.

---

## 3. PHP-MySQL Architecture (CRUD)
- `mysqli_connect($host, $user, $password, $database)` establishes a relational socket connection.
- Always sanitize input using prepared statements to prevent SQL Injections.
