FROM alpine

ARG VERSION=0.0.1-SNAPSHOT
ENV VERSION ${VERSION}
COPY ./build/libs/spiritAi-$VERSION.jar spiritAi-$VERSION.jar
RUN apk update && \
    apk add openjdk8
EXPOSE 8080
ENTRYPOINT java -jar spiritAi-$VERSION.jar
