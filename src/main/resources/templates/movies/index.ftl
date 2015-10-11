<html>
    <head>
        <title>Movies</title>
    </head>

    <body>
        <h1>Movies</h1>

        <p><a href="/movies/add">Add Movie</a></p>

        <ul>
            <#list movies as movie>
                <li><a href="/movies/detail/${movie.id}">${movie.title}</a></li>
            </#list>
        </ul>
    </body>
</html>
