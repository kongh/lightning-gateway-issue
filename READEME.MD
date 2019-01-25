# build
mvn clean install -Dmaven.test.skip=true

# image
docker build -f Dockerfile -t lightning/lightning-component:1.0 .

# Docker swarm 
I am using portainer for swarm , so make sure you have portainer

# kong
Install kong using docker stack by Portainer .

1. install postgres

docker-compose-kong-postgres-prod.yml

2. kong postgres init

docker run --rm \
     -e "KONG_DATABASE=postgres" \
     -e "KONG_PG_HOST=your host ip" \
     -e "KONG_PG_PASSWORD=123456" \
     kong:0.14.1 kong migrations up  
     
3. install kong and dashboard

docker-compose-kong-prodJp.yml

# install sample demo
docker-compose.yml

# config kong service and routes



