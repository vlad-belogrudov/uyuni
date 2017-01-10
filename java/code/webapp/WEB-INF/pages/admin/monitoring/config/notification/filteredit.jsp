<%@ taglib uri="http://rhn.redhat.com/rhn" prefix="rhn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>


<html>
    <head>
    </head>
<body>
<rhn:toolbar base="h1" icon="header-system-groups"
	           helpUrl="/rhn/help/user/en-US/s2-sm-monitor-notif.jsp">
    <bean:message key="filteredit.jsp.header1" />
  </rhn:toolbar>

<h2><bean:message key="filteredit.jsp.header2"/></h2>

<html:form action="/monitoring/config/notification/FilterEdit" method="POST">
    <rhn:csrf />
    <rhn:submitted />
    <%@ include file="filter-form.jspf" %>
</html:form>

</body>
</html>