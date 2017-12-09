<%@include file="../includes/header.jsp" %>
<%@page import="tp.data.Library"%>
<%@page import="tp.data.Book"%>
<%
Library lib = Library.getInstance();
Book book = lib.getById( Integer.parseInt(request.getParameter("bookid")) );

String desc = book.getDescription();
if (desc == null) {
	desc = "Pas de description disponible pour ce livre.";
}

String keywords = "";
String comma = "";
for(String k : book.getKeywords()) {
	keywords += comma + k;
	comma = ", ";
}

%>
<h1>Titre : <%= book.getTitle() %></h1>
<p>
Id : <%= book.getId() %>
</p>
<p>
Nombre de pages : <%= book.getNbPages() %>
</p>
<p>
Description : <br/>
<%= desc %>
</p>
<p>
Keywords : <%= keywords %>
</p>
<%@include file="../includes/footer.jsp" %>