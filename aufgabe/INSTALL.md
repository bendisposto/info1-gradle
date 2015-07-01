# tl/dr;
```./gradlew test``` (Linux Mac)
```./gradlew.bat test``` (Windows)

# Grundlagen der praktischen Informatik - Test und Ausführungsscript
Dieses Skript soll Ihnen den Umgang mit den Info1 Aufgaben erleichtern. Es enthält ein Lösungsskelett für die Programmieraufgabe und verschiedene Testfälle, die Ihnen die Überprüfung Ihrer Lösung erleichtern sollen.

# Virtuelle Maschine der Fachschaft
Wir empfehlen die Verwendung der virtuellen Maschine, die Ihnen von der Fachschaft zur Verfügung gestellt wird. Dort ist das benutzte Werkzeug bereits installiert und konfiguriert. Wenn Sie die VM verwenden, können Sie im Folgenden  ```./gradlew``` durch ```gradle``` ersetzen. 

# Verzeichnis-Layout

Wir werden Ihnen für die Abgaben in der Anfangszeit in der Regel Javaklassen mit Tests (im Ordner ```test/info1```)  und Skelette von Lösungsklassen (im Ordner ```src/info1```) zur Verfügung stellen. Soweit es nicht anders in der Aufgabenstellung beschrieben ist, sollten Sie nur die Lösungsklassen ändern/ergänzen.  

Sie können die Tests mit dem Kommando ```./gradlew test``` bzw. ```./gradlew.bat test``` (Windows) ausführen.

Ihr Programm können Sie mit  ```./gradlew run -Dmain=info1.<Klassenname>``` starten.

Wenn die Lösungsdatei also den Namen FooBar.java hat, ist der korrekte Aufruf:
```./gradlew run -Dmain=info1.FooBar```

Die Ergebnisse der Tests werden  auf der Kommandozeile ausgegeben. Zusätzlich wird eine HTML Datei mit einem Report generiert. Der Report wird unter ./build/reports/tests/index.html gespeichert.


## Gradle installieren

<b> Wenn Sie die Fachschafts-VM nutzen können Sie den folgenden Teil ignorieren! </b>

Beim ersten Start mit gradlew kann es etwas länger dauern, da einige Dateien heruntergeladen werden. Wir haben gradlew hinzugefügt, damit das script auf jedem Rechner einfach ausführbar ist.  

Wir empfehlen allerdings, das Build-Werkzeug gradle (http://gradle.org/) auf Ihrem Computer zu installieren. Auf Linux und Mac OS Systemen funktioniert die Installation normalerweise problemlos über den regulären Paketmanager bzw.  auf Mac OS über homebrew (http://brew.sh/). Ansonsten verweisen wir auf die Installationsanleitung (http://docs.gradle.org/current/userguide/installation.html).

Gradle ist leider von Hause aus etwas langsam, Sie können es aber sigifikant durch Verwendung des Daemon features beschleunigen. Genaue Instruktionen finden Sie unter: https://docs.gradle.org/2.4/userguide/gradle_daemon.html

Die Kurzfassung:
Auf Windows führen Sie in der Eingabeaufforderung folgendes aus:
```(if not exist "%HOMEPATH%/.gradle" mkdir "%HOMEPATH%/.gradle") && (echo foo >> "%HOMEPATH%/.gradle/gradle.properties")```

Unter Linux und Mac OS:
```touch ~/.gradle/gradle.properties && echo "org.gradle.daemon=true" >> ~/.gradle/gradle.properties```
