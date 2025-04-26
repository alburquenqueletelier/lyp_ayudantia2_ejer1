CC = javac
SRC = Account/*.java App.java 

all: App

App: $(SRC)
	$(CC) $(SRC)

clean: 
	find . -type f -name "*.class" -exec rm -f {} \;