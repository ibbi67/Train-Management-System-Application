<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<c:forEach items="${data}" var="item">
${item}
</c:forEach>
</body>
</html>