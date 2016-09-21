<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleContextManagerWebServiceProxyid" scope="session" class="eu.osmose.cm.webservice.ContextManagerWebServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleContextManagerWebServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleContextManagerWebServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleContextManagerWebServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        eu.osmose.cm.webservice.ContextManagerWebService getContextManagerWebService10mtemp = sampleContextManagerWebServiceProxyid.getContextManagerWebService();
if(getContextManagerWebService10mtemp == null){
%>
<%=getContextManagerWebService10mtemp %>
<%
}else{
        if(getContextManagerWebService10mtemp!= null){
        String tempreturnp11 = getContextManagerWebService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String ontologyName_1id=  request.getParameter("ontologyName16");
            java.lang.String ontologyName_1idTemp = null;
        if(!ontologyName_1id.equals("")){
         ontologyName_1idTemp  = ontologyName_1id;
        }
        String propertyUri_2id=  request.getParameter("propertyUri18");
            java.lang.String propertyUri_2idTemp = null;
        if(!propertyUri_2id.equals("")){
         propertyUri_2idTemp  = propertyUri_2id;
        }
        java.lang.String getProperty13mtemp = sampleContextManagerWebServiceProxyid.getProperty(ontologyName_1idTemp,propertyUri_2idTemp);
if(getProperty13mtemp == null){
%>
<%=getProperty13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getProperty13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String ontologyName_3id=  request.getParameter("ontologyName23");
            java.lang.String ontologyName_3idTemp = null;
        if(!ontologyName_3id.equals("")){
         ontologyName_3idTemp  = ontologyName_3id;
        }
        String propertyUri_4id=  request.getParameter("propertyUri25");
            java.lang.String propertyUri_4idTemp = null;
        if(!propertyUri_4id.equals("")){
         propertyUri_4idTemp  = propertyUri_4id;
        }
        java.lang.String getResource20mtemp = sampleContextManagerWebServiceProxyid.getResource(ontologyName_3idTemp,propertyUri_4idTemp);
if(getResource20mtemp == null){
%>
<%=getResource20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getResource20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
case 27:
        gotMethod = true;
        sampleContextManagerWebServiceProxyid.test();
break;
case 30:
        gotMethod = true;
        String ontologyName_5id=  request.getParameter("ontologyName33");
            java.lang.String ontologyName_5idTemp = null;
        if(!ontologyName_5id.equals("")){
         ontologyName_5idTemp  = ontologyName_5id;
        }
        String resourceUri_6id=  request.getParameter("resourceUri35");
            java.lang.String resourceUri_6idTemp = null;
        if(!resourceUri_6id.equals("")){
         resourceUri_6idTemp  = resourceUri_6id;
        }
        sampleContextManagerWebServiceProxyid.createResource(ontologyName_5idTemp,resourceUri_6idTemp);
break;
case 37:
        gotMethod = true;
        String ontologyName_7id=  request.getParameter("ontologyName40");
            java.lang.String ontologyName_7idTemp = null;
        if(!ontologyName_7id.equals("")){
         ontologyName_7idTemp  = ontologyName_7id;
        }
        String ontologyClassName_8id=  request.getParameter("ontologyClassName42");
            java.lang.String ontologyClassName_8idTemp = null;
        if(!ontologyClassName_8id.equals("")){
         ontologyClassName_8idTemp  = ontologyClassName_8id;
        }
        String individualName_9id=  request.getParameter("individualName44");
            java.lang.String individualName_9idTemp = null;
        if(!individualName_9id.equals("")){
         individualName_9idTemp  = individualName_9id;
        }
        java.lang.String createIndividual37mtemp = sampleContextManagerWebServiceProxyid.createIndividual(ontologyName_7idTemp,ontologyClassName_8idTemp,individualName_9idTemp);
if(createIndividual37mtemp == null){
%>
<%=createIndividual37mtemp %>
<%
}else{
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createIndividual37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
}
break;
case 46:
        gotMethod = true;
        String ontologyName_10id=  request.getParameter("ontologyName49");
            java.lang.String ontologyName_10idTemp = null;
        if(!ontologyName_10id.equals("")){
         ontologyName_10idTemp  = ontologyName_10id;
        }
        String propertyUri_11id=  request.getParameter("propertyUri51");
            java.lang.String propertyUri_11idTemp = null;
        if(!propertyUri_11id.equals("")){
         propertyUri_11idTemp  = propertyUri_11id;
        }
        java.lang.String createProperty46mtemp = sampleContextManagerWebServiceProxyid.createProperty(ontologyName_10idTemp,propertyUri_11idTemp);
if(createProperty46mtemp == null){
%>
<%=createProperty46mtemp %>
<%
}else{
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createProperty46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
}
break;
case 53:
        gotMethod = true;
        String queryString_12id=  request.getParameter("queryString56");
            java.lang.String queryString_12idTemp = null;
        if(!queryString_12id.equals("")){
         queryString_12idTemp  = queryString_12id;
        }
        String ontologyName_13id=  request.getParameter("ontologyName58");
            java.lang.String ontologyName_13idTemp = null;
        if(!ontologyName_13id.equals("")){
         ontologyName_13idTemp  = ontologyName_13id;
        }
        java.lang.String executeQuery53mtemp = sampleContextManagerWebServiceProxyid.executeQuery(queryString_12idTemp,ontologyName_13idTemp);
if(executeQuery53mtemp == null){
%>
<%=executeQuery53mtemp %>
<%
}else{
        String tempResultreturnp54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(executeQuery53mtemp));
        %>
        <%= tempResultreturnp54 %>
        <%
}
break;
case 60:
        gotMethod = true;
        String ontologyName_14id=  request.getParameter("ontologyName63");
            java.lang.String ontologyName_14idTemp = null;
        if(!ontologyName_14id.equals("")){
         ontologyName_14idTemp  = ontologyName_14id;
        }
        String resourceUri_15id=  request.getParameter("resourceUri65");
            java.lang.String resourceUri_15idTemp = null;
        if(!resourceUri_15id.equals("")){
         resourceUri_15idTemp  = resourceUri_15id;
        }
        String propertyUri_16id=  request.getParameter("propertyUri67");
            java.lang.String propertyUri_16idTemp = null;
        if(!propertyUri_16id.equals("")){
         propertyUri_16idTemp  = propertyUri_16id;
        }
        String literal_17id=  request.getParameter("literal69");
            java.lang.String literal_17idTemp = null;
        if(!literal_17id.equals("")){
         literal_17idTemp  = literal_17id;
        }
        sampleContextManagerWebServiceProxyid.addLiteral(ontologyName_14idTemp,resourceUri_15idTemp,propertyUri_16idTemp,literal_17idTemp);
break;
case 71:
        gotMethod = true;
        sampleContextManagerWebServiceProxyid.testMessage();
break;
case 74:
        gotMethod = true;
        String ontologyName_18id=  request.getParameter("ontologyName77");
            java.lang.String ontologyName_18idTemp = null;
        if(!ontologyName_18id.equals("")){
         ontologyName_18idTemp  = ontologyName_18id;
        }
        String subjectUri_19id=  request.getParameter("subjectUri79");
            java.lang.String subjectUri_19idTemp = null;
        if(!subjectUri_19id.equals("")){
         subjectUri_19idTemp  = subjectUri_19id;
        }
        String predicateUri_20id=  request.getParameter("predicateUri81");
            java.lang.String predicateUri_20idTemp = null;
        if(!predicateUri_20id.equals("")){
         predicateUri_20idTemp  = predicateUri_20id;
        }
        String object_21id=  request.getParameter("object83");
            java.lang.String object_21idTemp = null;
        if(!object_21id.equals("")){
         object_21idTemp  = object_21id;
        }
        java.lang.String createStatement74mtemp = sampleContextManagerWebServiceProxyid.createStatement(ontologyName_18idTemp,subjectUri_19idTemp,predicateUri_20idTemp,object_21idTemp);
if(createStatement74mtemp == null){
%>
<%=createStatement74mtemp %>
<%
}else{
        String tempResultreturnp75 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createStatement74mtemp));
        %>
        <%= tempResultreturnp75 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>