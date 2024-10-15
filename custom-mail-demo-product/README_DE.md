# Custom Mail Demo

Axon Ivy's Custom Mail Demo zeigt dir, wie du die Task-Benachrichtigungs-E-Mails und täglichen Aufgabenübersichten anpassen kannst, indem du deine eigenen Mail-Prozesse bereitstellst

![Mail](mail.png)

Erfahre mehr über benutzerdefinierte Mail-Prozesse in unserer [Dokumentation](https://developer.axonivy.com/doc/dev/designer-guide/user-interface/email-notifications/index.html)

## Demo

Der Demo-Prozess `mail` hat zwei Prozessstarts: Einen für die neue Aufgabenbenachrichtigung per E-Mail und einen für die tägliche Aufgabenübersicht per E-Mail. Du kannst diese Demo gerne als Vorlage verwenden, um deine eigenen E-Mail-Prozesse zu implementieren.

![Mail Processes](processes.png)

## Setup

Deploye dieses Demo-Projekt auf eine Axon Ivy Engine und triggere die Erstellung einer Aufgabe. Alle verantwortlichen Benutzer erhalten eine neue Aufgabenbenachrichtigung per E-Mail mit dem Inhalt dieses Standardprozesses.
