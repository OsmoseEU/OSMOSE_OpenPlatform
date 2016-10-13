
For OSMOSE project 3 different components have been used to implement the Communication Channel.
The WSO2 ESB to implement a prxy services and connect RESTful web services and RabbitMQ queue.
For more detauils, please chech the official site of the WSO2 ESB in the URL: http://wso2.com/products/enterprise-service-bus/

RabbitMQ as a message exchange Broker. This SW have been used becouse it have perfectly documented API and could work easyly
in any enviromnent.
For more detailed description on this component please refer to the official web site of the RabbitMQ https://www.rabbitmq.com/
We integrate RabbitMQ with ESB, RESTful services and Esper.
RabbitMQ instantiates different exchanges, which are boud to message queues for the listeners, to which messages can be 
sent and from which messages can be received. These exchanges can be configured in the rabbitmq.properties file 
in <wildfly_home>/conf/ContextManager/. 
Each world has an exchange for applications to send and receive messages in this particular world. 
A general Exchange named ‘EXCHANGE’ AMQP default is created for general purposes. The ‘ContextManagerExchange’ can be used 
to communicate with the Context Manager. REALWORLD, VIRTULAWORLD and DIGITALWORLD exchanges are created to communicate messages 
between worlds.  Users of the OSMOSE Open Platform can instantiate new exchanges or bind new queues to existing exchanges 
via the RabbitMQ Management console  or programmatically inside their applications. For the latter case, the Java client 
eu.osmose.cm.amqp provided with the platform. It can be used and extended (for examples on how to use it, please refer to the 
Context Manager – eu.osmose.cm.web). The MessageEndpoint allows to register new MessageConsumers, wheras the MessagePublisher 
allows applications to publish messages on the existing exchanges.

In order to enable complex event processing on the whole platform and make it accessible and configurable by users and 
applications, Esper has been wrapped into a webservice and published as war file (eu.osmose.esper.client.war) on the application 
server. It can be accessed via messages (see next section) or the webservice. The latter provides functionalities to publish 
events and EPL statements for reasoning. 

Although Esper and RabbitMQ can be used separately, the components are interacting on the middleware. Messages that are send to 
the ContextManagerExchange are also delivered to the esper client on the platform. The messages are transformed to esper events 
to allow reasing over the event stream. If a listener, that is instantiated by adding an EPL over the esper client of the platform,
is activated, a new message is sent to the ContextManagerExchange that can be received by other listeners or in turn produce a 
new esper event via message to event transformation.
