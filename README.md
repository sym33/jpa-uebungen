# JPA-Uebungen

Dieser Ordner enthaelt vier Maven-Projekte:

| Ordner | Provider | Main-Klasse |
| --- | --- | --- |
| `Uebung 1` | EclipseLink 5.0.0 | `model.Main` |
| `Uebung 2` | EclipseLink 5.0.0 | `ch.bfh.btx8053.jpa.family.Application` |
| `Uebung 1 Hibernate` | Hibernate ORM 7.3.1.Final | `model.Main` |
| `Uebung 2 Hibernate` | Hibernate ORM 7.3.1.Final | `ch.bfh.btx8053.jpa.family.Application` |

Alle Projekte verwenden Jakarta Persistence 3.2, PostgreSQL JDBC 42.7.10 und Java 17.

## In Eclipse importieren

1. `File > Import > Maven > Existing Maven Projects` waehlen.
2. Einen der vier Projektordner auswaehlen.
3. Eclipse erkennt die `pom.xml` und richtet Classpath sowie Dependencies ein.
4. Die jeweilige Main-Klasse starten oder im Terminal `mvn clean compile exec:java` ausfuehren.

## In IntelliJ IDEA importieren

1. `File > Open` waehlen.
2. Einen der vier Projektordner auswaehlen.
3. Als Maven-Projekt laden lassen.
4. Die jeweilige Main-Klasse starten oder im Terminal `mvn clean compile exec:java` ausfuehren.

## PostgreSQL

Die Datenbankverbindung steht jeweils in:

```text
src/main/resources/META-INF/persistence.xml
```

Voreingestellt sind lokale Datenbanken:

```text
jdbc:postgresql://localhost:5432/jpa_uebung1
jdbc:postgresql://localhost:5432/jpa_uebung2
```

Benutzer und Passwort sind aktuell als `postgres` / `postgres` gesetzt. Fuer Unterrichts- oder Laborserver muessen `jakarta.persistence.jdbc.url`, `jakarta.persistence.jdbc.user` und `jakarta.persistence.jdbc.password` angepasst werden.

## Hinweis zu den Provider-Varianten

Die EclipseLink- und Hibernate-Ordner enthalten denselben Uebungscode, aber unterschiedliche JPA-Provider in `persistence.xml` und unterschiedliche Maven-Dependencies in `pom.xml`. Dadurch kann man die Provider vergleichen, ohne das IDE-Projekt umbauen zu muessen.
