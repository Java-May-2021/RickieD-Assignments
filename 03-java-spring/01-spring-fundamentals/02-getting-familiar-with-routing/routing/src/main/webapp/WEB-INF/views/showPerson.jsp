<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>People Page</title>
</head>
<body>
    <p>
        <c:out value="${person.greeting()}"/>
    </p>
</body>
</html>
