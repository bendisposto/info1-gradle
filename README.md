# Info 1: Test und Ausführungsscript

Dieses Skript soll Ihnen den Umgang mit den Info1 Aufgaben erleichtern. Wir werden Ihnen für die Abgaben in der Anfangszeit in der Regel eine Javaklasse mit Tests und eine leere Lösungsklasse  zur Verfügung stellen. Kopieren Sie die Testklasse in den Ordner test/info1 und das Lösungsskelett in den Ordner src/info1

Sie können die Tests mit dem Kommando ```./gradlew test``` bzw. ```./gradlew.bat test``` (Windows) ausführen.

Ihr Programm können Sie mit  ```./gradlew run -Dmain=info1.<Klassenname>``` starten.

Wenn die Lösungsdatei also den Namen FooBar.java hat, ist der korrekte Aufruf:
```./gradlew run -Dmain=info1.FooBar```

Wenn Sie die Tests laufen lassen und diese fehlschlagen wird eine HTML Datei mit einem Report generiert. Der Ordner in dem die Reportdatei liegt wird auf der Konsole ausgegeben.

## Schneller machen

*Wenn Sie die von der Fachschaft Informatik herausgegebene virtuelle Maschine nutzen, können Sie den folgenden Teil ignorieren.*

Beim ersten Start mit gradlew kann es etwas länger dauern, da einige Dateien heruntergeladen werden. Wir haben gradlew hinzugefügt, damit das script auf jedem Rechner einfach ausführbar ist.  

Wir empfehlen allerdings, das Build-Werkzeug gradle (http://gradle.org/) auf Ihrem Computer zu installieren. Auf Linux und Mac OS Systemen funktioniert die Installation normalerweise problemlos über den regulären Paketmanager bzw.  auf Mac OS über homebrew (http://brew.sh/). Ansonsten verweisen wir auf die Installationsanleitung (http://docs.gradle.org/current/userguide/installation.html).

Gradle ist leider von Hause aus etwas langsam, Sie können es aber sigifikant durch Verwendung des Daemon features beschleunigen. Genaue Instruktionen finden Sie unter: https://docs.gradle.org/2.4/userguide/gradle_daemon.html

Die Kurzfassung:
Auf Windows führen Sie in der Eingabeaufforderung folgendes aus:
```(if not exist "%HOMEPATH%/.gradle" mkdir "%HOMEPATH%/.gradle") && (echo foo >> "%HOMEPATH%/.gradle/gradle.properties")```

Unter Linux und Mac OS:
```touch ~/.gradle/gradle.properties && echo "org.gradle.daemon=true" >> ~/.gradle/gradle.properties```
