cd %~dp0
del java8-okhttp-gson\pom.xml
del java8-okhttp-gson\build.gradle
rmdir java8-okhttp-gson\src\main  /s /q

call mvn -Pjava8-okhttp-gson clean install
