<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>
    <html lang="fr">

    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>

    <body>
        <a href="/">Retour<a />
            <p>Bonjour ${email} et ton numéro est le ${tel} </p>
            <p><a href="/personne?name=${personne}">Personne<a /> </p>
            <thead>
                <tr>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${people}" var="person">
                    <tr>
                        <td>${person.lastName}</td>
                    </tr>
                </c:forEach>
            </tbody>
    </body>

    </html>