# Uebung 1 - EclipseLink

Maven-Projekt fuer Jakarta Persistence mit EclipseLink 5.0.0 und PostgreSQL JDBC 42.7.10.

## Start

1. PostgreSQL-Datenbank anlegen, zum Beispiel `Übung1`.
2. Zugangsdaten in `src/main/resources/META-INF/persistence.xml` anpassen.
3. Projekt in Eclipse oder IntelliJ als Maven-Projekt importieren.
4. Ausfuehren:

```bash
mvn clean compile exec:java
```

Die Main-Klasse ist `model.Main`.
