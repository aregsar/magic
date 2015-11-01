<@layout title="Movies">

        <p><a href="/movies/add">Add Movie</a></p>

        <ul>
            <#list movies as movie>
                <li><a href="/movies/detail/${movie.id}">${movie.title}</a></li>
            </#list>
        </ul>
</@layout>
