# Uebung 1 - Hibernate

Maven-Projekt fuer Jakarta Persistence mit Hibernate ORM 7.3.1.Final und PostgreSQL JDBC 42.7.10.

## Start

1. PostgreSQL-Datenbank anlegen, zum Beispiel `jpa_uebung1`.
2. Zugangsdaten in `src/main/resources/META-INF/persistence.xml` anpassen.
3. Projekt in Eclipse oder IntelliJ als Maven-Projekt importieren.
4. Ausfuehren:

```bash
mvn clean compile exec:java
```

Die Main-Klasse ist `model.Main`.
