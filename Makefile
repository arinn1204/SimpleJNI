build:
	mvn clean install

package: build
	docker build . --tag trixter1394/jniexample

release: package
	docker push trixter1394/jniexample

run:
	docker run -d -p 9001:9001 --name jniexample trixter1394/jniexample-snapshot

destroy:
	docker rm --force jniexample

stop:
	docker stop jniexample