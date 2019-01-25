FROM maven:3.5.3-jdk-8

ENV WORK_PATH  /product/services/lightning-gateway-issue
RUN mkdir -p $WORK_PATH  && \
    mkdir -p /product/log
WORKDIR $WORK_PATH

# lightning cloud
COPY register/target/register-1.0-SNAPSHOT.jar $WORK_PATH
COPY gateway/target/gateway-1.0-SNAPSHOT.jar $WORK_PATH
COPY service/target/service-1.0-SNAPSHOT.jar $WORK_PATH
COPY zuul/target/zuul-1.0-SNAPSHOT.jar $WORK_PATH

ARG JVM_OPTS
ARG APPLICATION_JAR
ARG TZ
ARG SERVICE_NAME

CMD ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone && java ${JVM_OPTS} -jar ${APPLICATION_JAR}
