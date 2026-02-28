#!/bin/sh

# Lo hago para no tener que escribir los comandos cada rato y asi no perder tiempo

mvn package
java -cp target/classes/ edu.dosw.parcial.App
