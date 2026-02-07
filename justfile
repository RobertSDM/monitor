run: gen-sources build
    java -ea -cp build FileMonitor

build:
    javac -d build @sources.txt

gen-sources:
    find -name "*.java*" > sources.txt