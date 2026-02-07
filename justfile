run: gen-sources build del-sources
    java -ea -cp build FileMonitor

build:
    javac -d build @sources.txt

gen-sources:
    find -name "*.java*" > sources.txt

del-sources:
    rm sources.txt