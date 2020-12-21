# rabbit
project spring boot with rabbitMQ

1.download project, install rabbit and run;
 
 DOCKER:
 docker run -d -p 15672:15672  -p 5672:5672 --name rabbitmy -e RABBITMQ_ERLANG_COOKIE='secret cookie here' rabbitmq:3-management
 
 
 CREDENTIALS:
 user=guest
 password=guest

2.run project;

3.USE postman 
POST go to http://localhost:9090/order/admiral;
Body
raw JSON
{"name":"John",
"quantity":"1",
"price":"121"}


4.check console


5.tgo to rabbit dashboard http://localhost:15672 and check;
