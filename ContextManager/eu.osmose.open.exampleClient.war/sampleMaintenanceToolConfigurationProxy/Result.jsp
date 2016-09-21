<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMaintenanceToolConfigurationProxyid" scope="session" class="eu.osmose.open.example.MaintenanceToolConfigurationProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMaintenanceToolConfigurationProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleMaintenanceToolConfigurationProxyid.getEndpoint();
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
        sampleMaintenanceToolConfigurationProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        eu.osmose.open.example.MaintenanceToolConfiguration getMaintenanceToolConfiguration10mtemp = sampleMaintenanceToolConfigurationProxyid.getMaintenanceToolConfiguration();
if(getMaintenanceToolConfiguration10mtemp == null){
%>
<%=getMaintenanceToolConfiguration10mtemp %>
<%
}else{
        if(getMaintenanceToolConfiguration10mtemp!= null){
        String tempreturnp11 = getMaintenanceToolConfiguration10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String toolId_1id=  request.getParameter("toolId16");
            java.lang.String toolId_1idTemp = null;
        if(!toolId_1id.equals("")){
         toolId_1idTemp  = toolId_1id;
        }
        String numberOfProductions_2id=  request.getParameter("numberOfProductions18");
        int numberOfProductions_2idTemp  = Integer.parseInt(numberOfProductions_2id);
        java.lang.String increaseProduction13mtemp = sampleMaintenanceToolConfigurationProxyid.increaseProduction(toolId_1idTemp,numberOfProductions_2idTemp);
if(increaseProduction13mtemp == null){
%>
<%=increaseProduction13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseProduction13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String toolId_3id=  request.getParameter("toolId23");
            java.lang.String toolId_3idTemp = null;
        if(!toolId_3id.equals("")){
         toolId_3idTemp  = toolId_3id;
        }
        String lifetime_4id=  request.getParameter("lifetime25");
            java.lang.String lifetime_4idTemp = null;
        if(!lifetime_4id.equals("")){
         lifetime_4idTemp  = lifetime_4id;
        }
        java.lang.String setMaintenanceToolLifetime20mtemp = sampleMaintenanceToolConfigurationProxyid.setMaintenanceToolLifetime(toolId_3idTemp,lifetime_4idTemp);
if(setMaintenanceToolLifetime20mtemp == null){
%>
<%=setMaintenanceToolLifetime20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(setMaintenanceToolLifetime20mtemp));
        %>
        <%= tempResultreturnp21 %>
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