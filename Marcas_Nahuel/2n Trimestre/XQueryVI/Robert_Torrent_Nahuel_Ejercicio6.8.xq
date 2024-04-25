(:Mostrar los títulos de los libros y al final una etiqueta con el número total de libros:)
let $libro := count (/bookdtore/book)
return <total>{$libro}</total>