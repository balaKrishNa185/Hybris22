   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
            <html>
            <head>
            <title>Manufacturer</title>
            </head>
            <br/>
            <h1 align="center" >Teacher Details</h1>
            <hr/>
            <br/>
            <body>
                <div align="center">
                    <table border="2" cellpadding="20" cellspacing="0" width="30">
                        <tr>
                            <th> ID </marquee></th>
                            <th>NAME</marquee></th>
                            <th>Degree</marquee></th>
                                <th>Phone</marquee></th>
                        </tr>
                            <tr>
                                <td>${manufacturerDetails.id} </td>
                                <td>${manufacturerDetails.name} </td>
                                <td>${manufacturerDetails.degree}</td>
                                <td>${manufacturerDetails.phone}</td>
                            </tr>
                    </table>
                </div>
            </body>
            </html>