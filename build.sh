#!/bin/bash -eu

[[ -e value-2.5.4.jar ]] || curl -O http://central.maven.org/maven2/org/immutables/value/2.5.4/value-2.5.4.jar
mkdir -p gen
javac -cp .:src:gen:value-2.5.4.jar -s gen src/example/ValueWithGenerics.java src/example/ValueWithBadReference.java
