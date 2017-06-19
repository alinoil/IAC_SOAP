<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBmrClassProxyid" scope="session" class="server.BmrClassProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBmrClassProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBmrClassProxyid.getEndpoint();
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
        sampleBmrClassProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        server.BmrClass getBmrClass10mtemp = sampleBmrClassProxyid.getBmrClass();
if(getBmrClass10mtemp == null){
%>
<%=getBmrClass10mtemp %>
<%
}else{
        if(getBmrClass10mtemp!= null){
        String tempreturnp11 = getBmrClass10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String weight_1id=  request.getParameter("weight16");
        double weight_1idTemp  = Double.parseDouble(weight_1id);
        String height_2id=  request.getParameter("height18");
        double height_2idTemp  = Double.parseDouble(height_2id);
        String gender_3id=  request.getParameter("gender20");
            java.lang.String gender_3idTemp = null;
        if(!gender_3id.equals("")){
         gender_3idTemp  = gender_3id;
        }
        String age_4id=  request.getParameter("age22");
        int age_4idTemp  = Integer.parseInt(age_4id);
        double generateBmr13mtemp = sampleBmrClassProxyid.generateBmr(weight_1idTemp,height_2idTemp,gender_3idTemp,age_4idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(generateBmr13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
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