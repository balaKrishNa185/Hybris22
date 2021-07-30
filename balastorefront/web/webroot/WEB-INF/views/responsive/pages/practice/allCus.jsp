 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      <html>
      <head>
      <title>Customers</title>
      </head>
      <br/>
      <h1 align="center" >Student Details</h1>
      <hr/>
      <br/>
      <body>
          <div align="center">
              <table border="2" cellpadding="20" cellspacing="0" width="30">
                  <tr>
                      <th> CustomerCreated </th>
                      <th>NAME</th>
                      <th>PLACE</th>
                          <th>IS NEW OR OLD</th>
                  </tr>
                  <c:forEach items="${datas}"   var = "manufacturerDetails" >
                      <tr>
                          <td>${manufacturerDetails.customerCreated} </td>
                          <td>${manufacturerDetails.name} </td>
                          <td>${manufacturerDetails.place}</td>
                          <td>NEW</td>
                      </tr>
                   </c:forEach>
              </table>
          </div>
      </body>
      </html>