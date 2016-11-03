
The OSMOSE Context Manager is a .war file that can be deployed on the application server. 
Additionally, the EAR project eu.osmose.cm is provided that includes the Context Manager .war (eu.osmose.cm.web) 
and a client to test the Context Manager’s functionality and integration (eu.osmose.cm.webClient). 
It is pre-installed on the virtual machine. Configuration is done in the property files cm.properties and rabbitmq.properties 
in the configuration folder <wildfly_home>/conf/ContextManager/. Each ontology used by the middleware need to be referenced in 
the cm.properties file.
