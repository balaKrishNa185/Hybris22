 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      <html>
      <head>
      <title>Manufacturer</title>
      </head>
      <br/>
      <h1 align="center" >Student Details</h1>
      <hr/>
      <br/>
      <body>
          <div align="center">
              <table border="2" cellpadding="20" cellspacing="0" width="30">
                  <tr>
                      <th><marquee direction="right" scrolldelay="1"> ID </marquee></th>
                      <th><marquee direction="right" scrolldelay="1">NAME</marquee></th>
                      <th><marquee direction="right" scrolldelay="1">standard</marquee></th>
                          <th><marquee direction="right" scrolldelay="1">Address</marquee></th>
                  </tr>
                  <c:forEach items="${datas}"   var = "manufacturerDetails" >
                      <tr>
                          <td>${manufacturerDetails.id} </td>
                          <td>${manufacturerDetails.name} </td>
                          <td>${manufacturerDetails.standard}</td>
                          <td>${manufacturerDetails.address}</td>
                      </tr>
                   </c:forEach>
              </table>
          </div>
      </body>
      </html>