default:
	@echo "make target"
	@echo "targets: clean, compile, demo"

clean:
	rm bin/**/*.class

compile:
	javac -d bin -sourcepath src src/**/**/*.java

demo:
	make compile
	java -cp bin client.Demo
