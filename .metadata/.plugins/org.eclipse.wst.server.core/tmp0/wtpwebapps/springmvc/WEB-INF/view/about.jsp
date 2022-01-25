<html>
<body>
	<%@page isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<h2>locations are</h2>
	<c:forEach items="${location }" var="l">
		<h1>
			<c:out value="${l}"></c:out>
		</h1>
	</c:forEach>

</body>
</html>
