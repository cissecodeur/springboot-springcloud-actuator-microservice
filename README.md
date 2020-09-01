# springboot-springcloud-actuator-microservice

Cette application montre comment mettre en place une architecture Hautement distribuée en utilisant des Microservices.
- Toutes les configurations sont federées dans un microservice (service-configGeneralMS) avec SpringCloud server .

- Toutes les identités de nos microservices sont gerés dans un microservices servant d'annuaire et de load-Balancer (service-enregistrementMS) geré avec Eureka-server.

- En frontal de notre load-Balancer, il ya un serveur proxy chargé du routage des urls venant des clients et cela est geré par le microservice (service-proxyMs) geré avec le proxy Zuul.
