<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

  <c:forEach items="${datas}"   var = "i" >
       ${ i.id }<br/>
       ${ i.name}<br/>
       ${ i.state}<br/>
       ${ i.country.name}<br/>
      </c:forEach>