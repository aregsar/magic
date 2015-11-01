<@layout title="New Movie">

        <form action="/movies/add" method="POST">
            <dl>
                <dt>Title</dt>
                <dd>
                    <input type="text" name="title">
                </dd>

                <dt>Content</dt>
                <dd>
                    <textarea type="text" name="content" rows="8" cols="80"></textarea>
                </dd>
                <dt><input type="submit" value="Create" /></dt>
            </dl>
        </form>
</@layout>
