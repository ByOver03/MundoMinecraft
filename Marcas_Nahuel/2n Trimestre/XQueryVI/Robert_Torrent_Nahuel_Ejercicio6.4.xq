for $libro in /bookstore/book
where $libro/(year=2005)
return (<lib2005>{$libro/title, $libro/author}</lib2005>)