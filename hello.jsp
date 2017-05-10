<HTML>
<BODY>
<%
System.out.println("Test1");
java.util.Date dt= new java.util.Date();
%>

Hello, world ...The time is now:
<%
out.println(String.valueOf( dt ));
out.println("<BR> Your machine adress is");
out.println(request.getRemoteHost());
%>
<TABLE BORDER =6>
<%
int n = 6;
for(int i = 0; i<n; i++){ %>
<TR>
<TD>Number<TD>
<TD><%=i+1 %></TD>
<TD><% System.getProperty("user.dir"); %></TD>
</TR>
<%
}
%>
</TABLE>

</BODY>
</HTML>


