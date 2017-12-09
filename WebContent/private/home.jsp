<%@include file="../includes/header.jsp" %>

<%@page import="tp.user.UserBean"%>
<%@ page import="java.util.Date"%>
<%@page import="tp.data.Book"%>
<%@page import="java.util.List"%>
<%@page import="tp.data.Library"%>

<table border="1">
  <tr>
    <th>Book Id</th>
    <th>Title</th>
    <th>Pages number</th>
    <th>Details</th>
  </tr>
  <% 
  Library lib = Library.getInstance();
  List<Book> books = lib.getAll();
  
  for (Book b : books) {
  %>
  <tr>
    <td><%= b.getId() %></td>
    <td><%= b.getTitle() %></td>
    <td><%= b.getNbPages() %></td>
    <td><a href="./bookdetails.jsp?bookid=<%= b.getId() %>">Ici</a></td>
  </tr>
  <%
  }
  %>
</table>

<%@include file="../includes/footer.jsp" %>