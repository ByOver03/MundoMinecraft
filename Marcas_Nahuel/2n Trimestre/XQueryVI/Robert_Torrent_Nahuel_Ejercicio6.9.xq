let $libro:=count(/bookstore/book),
    $lib := (
        for $l in /boockstore/book/title
        return <titulo>{$l/text()}</titulo>
    )
return <resultado>{$lib}<total>{$libro}</total></resultado>