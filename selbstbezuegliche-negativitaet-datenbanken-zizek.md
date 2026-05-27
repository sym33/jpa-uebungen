# Selbstbezuegliche Negativitaet, Negation der Negation und dialektische Bewegung in der Kritik am Fach Datenbanken nach Zizek

## Ausgangspunkt

Eine Kritik am Fach Datenbanken kann leicht banal werden: Man beklagt SQL-Syntax, Normalformen, ER-Diagramme, Transaktionen oder die technische Trockenheit des Stoffes. Eine dialektische Kritik im Sinne Slavoj Zizeks beginnt jedoch nicht dort, wo man dem Fach von aussen vorwirft, es sei zu formal, zu abstrakt oder zu praxisfern. Sie beginnt dort, wo die innere Logik des Faches selbst einen Widerspruch produziert.

Der interessante Punkt ist also nicht: Datenbanken sind trocken. Der interessante Punkt ist: Gerade weil Datenbanken Ordnung, Konsistenz und Eindeutigkeit versprechen, machen sie sichtbar, dass jede Ordnung auf Ausschluessen, Entscheidungen und Negationen beruht.

## Selbstbezuegliche Negativitaet

Bei Zizek ist Negativitaet nicht bloss ein Mangel, der irgendwann behoben werden koennte. Sie ist nicht einfach das, was noch fehlt, bevor ein System vollkommen wird. Negativitaet ist vielmehr eine produktive Kraft: Ein System wird erst dadurch bestimmt, dass es Grenzen zieht, unterscheidet, ausschliesst und sich gegen etwas anderes setzt.

Auf das Fach Datenbanken bezogen bedeutet das: Eine Datenbank erscheint zunaechst als Technik der positiven Speicherung. Sie sammelt Daten, ordnet sie in Tabellen, definiert Beziehungen und erlaubt Abfragen. Aber diese positive Ordnung funktioniert nur durch Negationen:

- Eine Tabelle ist nicht einfach eine Sammlung von Daten, sondern das Ergebnis der Entscheidung, was zu ihr gehoert und was nicht.
- Ein Primaerschluessel identifiziert nicht nur einen Datensatz, sondern negiert die Moeglichkeit, dass zwei Entitaeten in derselben Hinsicht ununterscheidbar bleiben.
- Eine Normalform beseitigt Redundanz, aber sie erzeugt zugleich neue Abhaengigkeiten, neue Joins und neue Formen der Komplexitaet.
- Eine Transaktion verspricht Konsistenz, aber sie zeigt gerade dadurch, dass Konsistenz nicht naturgegeben ist, sondern gegen Inkonsistenz abgesichert werden muss.

Die Negativitaet ist also selbstbezueglich, weil das Fach Datenbanken seine eigene Notwendigkeit aus dem Problem erzeugt, das es zugleich sichtbar macht. Es sagt: Die Welt ist unordentlich, also brauchen wir Ordnung. Aber indem es Ordnung herstellt, zeigt es, dass Ordnung nie unmittelbar gegeben ist.

## Negation der Negation

Die erste Negation besteht darin, die rohe, chaotische Wirklichkeit zu verwerfen. Die Welt der konkreten Dinge, Personen, Prozesse und Ereignisse wird negiert, indem sie in Datenmodelle uebersetzt wird. Aus Patientinnen, Familien, Kursen, Bestellungen oder Personen werden Tabellen, Attribute, Relationen und Schluessel.

Diese erste Negation ist die Abstraktion:

> Die konkrete Welt wird zur strukturierten Datenwelt.

Doch die Negation der Negation tritt ein, wenn diese abstrakte Datenwelt selbst wieder problematisch wird. Das Modell, das die Wirklichkeit ordnen sollte, erzeugt eigene Widersprueche:

- Das ER-Modell ist klar, aber die reale Fachlichkeit passt nicht sauber hinein.
- Die Normalisierung reduziert Redundanz, aber die Anwendung braucht performante Abfragen.
- SQL ist deklarativ, aber die konkrete Anfrage wird schwer lesbar.
- Das Schema garantiert Struktur, aber jede neue Anforderung stellt diese Struktur wieder infrage.

Die Negation der Negation ist daher nicht einfach die Rueckkehr zur konkreten Welt. Sie ist eine neue Stufe: Man erkennt, dass weder die rohe Wirklichkeit noch das reine Modell genuegen. Die Wahrheit liegt nicht in der Welt vor dem Modell und auch nicht im Modell als solchem, sondern in der Bewegung zwischen Wirklichkeit, Modellierung, Scheitern des Modells und erneuter Modellierung.

## Dialektische Bewegung

Die dialektische Bewegung im Fach Datenbanken laesst sich als dreifache Bewegung beschreiben:

1. **Unmittelbarkeit:** Es gibt scheinbar konkrete Informationen: Namen, Adressen, Geburtsdaten, Bestellungen, Beziehungen.
2. **Negation:** Diese Informationen werden formalisiert: Tabellen, Datentypen, Schluessel, Constraints, SQL.
3. **Negation der Negation:** Die Formalisierung zeigt ihre eigenen Grenzen: Ausnahmen, Migrationen, Performance-Probleme, veraenderte Anforderungen, widerspruechliche Fachlogiken.

Im Sinne Zizeks ist der Widerspruch nicht ein Fehler, der das System von aussen stoert. Er ist der Motor des Systems selbst. Datenbankunterricht ist deshalb nicht nur die Vermittlung technischer Werkzeuge, sondern die Einuebung in eine bestimmte Form des Denkens: Man lernt, dass jede Ordnung kontingent ist, aber nicht beliebig; dass jede Struktur notwendig ist, aber nie endgueltig; dass jedes Modell die Welt verfehlt, aber gerade durch dieses Verfehlen produktiv wird.

## Kritik am Fach Datenbanken

Eine zizeksche Kritik am Fach Datenbanken wuerde also nicht einfach fordern, das Fach solle weniger formal, weniger technisch oder weniger abstrakt sein. Das waere eine zu einfache Kritik. Sie wuerde vielmehr fragen, ob das Fach seinen eigenen dialektischen Charakter offenlegt.

Oft wird Datenbankunterricht so praesentiert, als gehe es um korrekte Loesungen:

- richtiges Schema,
- richtige Normalform,
- richtige SQL-Abfrage,
- richtige Transaktion.

Das ist didaktisch notwendig, aber ideologisch gefaehrlich, wenn es den Eindruck erzeugt, die Datenbank sei ein neutraler Spiegel der Wirklichkeit. Aus zizekscher Perspektive liegt genau hier die Ideologie: Nicht darin, dass Datenbanken falsch waeren, sondern darin, dass ihre Konstruktionsleistung unsichtbar wird.

Die eigentliche Kritik lautet daher:

> Das Fach Datenbanken lehrt Ordnung, aber es muss zugleich lehren, dass Ordnung immer durch Negation entsteht.

Eine Datenbank ist nicht neutral. Sie entscheidet, was zaehlt, was identifizierbar ist, was verknuepfbar ist, was geloescht werden darf, was historisiert wird und was unsichtbar bleibt. Jede Datenbank ist eine kleine Ontologie: Sie sagt, welche Dinge es in einer bestimmten Welt gibt und in welchen Beziehungen sie stehen koennen.

## Beispiel: Patientendaten

Nimmt man etwa eine Tabelle `Patient`, dann scheint sie zunaechst harmlos:

```text
patientnb, name, firstname, gender, birthdate, street, zip, city, phone, insurancenb
```

Doch bereits diese Spalten zeigen die Negativitaet der Modellierung. Die Person wird nicht als lebendige Person erfasst, sondern als Menge relevanter Attribute. Alles, was nicht in diesen Attributen erscheint, existiert fuer das System nicht. Die Datenbank negiert die konkrete Fuelle der Person, um sie verwaltbar zu machen.

Die Negation der Negation tritt ein, sobald diese Reduktion problematisch wird:

- Was passiert, wenn `gender` nicht binaer modelliert werden soll?
- Was passiert, wenn eine Person mehrere Adressen hat?
- Was passiert, wenn eine Telefonnummer historisiert werden muss?
- Was passiert, wenn Datenschutz verlangt, dass bestimmte Daten geloescht, andere aber aufbewahrt werden muessen?

Das Modell scheitert nicht zufaellig. Es scheitert, weil jedes Modell durch seine eigenen Unterscheidungen neue Konflikte erzeugt.

## Pointe nach Zizek

Nach Zizek besteht Dialektik nicht darin, Gegensaetze harmonisch zu versoehnen. Sie besteht darin, zu zeigen, dass der Gegensatz bereits im Inneren der Sache selbst liegt. Fuer Datenbanken bedeutet das: Der Widerspruch zwischen Ordnung und Unordnung, Modell und Wirklichkeit, Konsistenz und Ausnahme ist nicht ein Nebenthema. Er ist der Kern des Faches.

Eine gute Kritik am Fach Datenbanken sollte deshalb nicht gegen Formalisierung sein. Sie sollte vielmehr die Formalisierung radikalisieren, indem sie zeigt:

- Jede Tabelle ist eine Entscheidung.
- Jeder Schluessel ist eine Setzung von Identitaet.
- Jede Normalisierung ist eine Negation bestimmter Wiederholungen.
- Jede Query ist eine Perspektive auf Daten, nicht die Daten selbst.
- Jede Datenbankordnung produziert ihre eigenen blinden Flecken.

## Schluss

Die selbstbezuegliche Negativitaet des Faches Datenbanken besteht darin, dass es den Mangel, den es beheben will, selbst sichtbar macht: Ohne Datenbanken erscheint die Welt unstrukturiert; durch Datenbanken erkennen wir aber erst, wie viel Gewalt, Auswahl und Ausschluss in jeder Struktur steckt.

Die Negation der Negation fuehrt nicht zur Abschaffung von Datenbanken, sondern zu einem reflektierteren Umgang mit ihnen. Man lernt nicht nur, Datenbanken zu bauen, sondern auch, die Bedingungen ihrer Moeglichkeit zu verstehen.

In diesem Sinne waere eine zizeksche Datenbankdidaktik keine Abkehr von SQL, Normalisierung oder Transaktionen. Sie waere deren dialektische Vertiefung: Das Fach wuerde zeigen, dass technische Modellierung immer auch philosophische Modellierung ist.
