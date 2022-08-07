build:
	mvn clean install

package: build
	docker build . --tag trixter1394/jniexample-snapshot

release: package
	docker push trixter1394/jniexample-snapshot