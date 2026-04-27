# Uebung 2 - EclipseLink

Maven-Projekt fuer Jakarta Persistence mit EclipseLink 5.0.0 und PostgreSQL JDBC 42.7.10.

## Start

1. PostgreSQL-Datenbank anlegen, zum Beispiel `jpa_uebung2`.
2. Zugangsdaten in `src/main/resources/META-INF/persistence.xml` anpassen.
3. Projekt in Eclipse oder IntelliJ als Maven-Projekt importieren.
4. Ausfuehren:

```bash
mvn clean compile exec:java
```

Die Main-Klasse ist `ch.bfh.btx8053.jpa.family.Application`.
