# Info 1: Test und Ausführungsscript

Dieses Skript soll Ihnen den Umgang mit den Info1 Aufgaben erleichtern. Wir werden Ihnen für die Abgaben in der Anfangszeit in der Regel eine Javaklasse mit Tests und eine leere Lösungsklasse  zur Verfügung stellen. Kopieren Sie die Testklasse in den Ordner src/test/java/info1 und das Lösungsskelett in den Ordner src/main/java/info1

Sie können die Tests mit dem Kommando ```./gradlew test``` bzw. ```./gradlew.bat test``` (Windows) ausführen.

Ihr Programm können Sie mit  ```./gradlew run -Dmain=info1.<Klassenname>``` starten.

Wenn die Lösungsdatei also den Namen FooBar.java hat, ist der korrekte Aufruf: 
```./gradlew run -Dmain=info1.FooBar```

Beim ersten Start kann es etwas länger dauern, da einige Dateien heruntergeladen werden. Sie können das Build-Werkzeug gradle (http://gradle.org/) auch auf Ihrem Computer installieren. 

Wenn Sie die Tests laufen lassen und diese fehlschlagen wird eine HTML Datei mit einem Report generiert. Der Ordner in dem die Reportdatei liegt wird auf der Konsole ausgegeben.
