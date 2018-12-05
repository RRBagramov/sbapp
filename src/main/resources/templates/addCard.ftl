<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<@spring.url '/css/style.css'/>">
</head>
<body>

<h2>Add Card</h2>
<p>Resize the browser window to see the effect.</p>

<div>
    <fieldset>
        <legend>Add Person</legend>
        <form name="person" action="" method="POST">
            Board id: <@spring.formInput "cardForm.boardId" "" "text"/>    <br/>
            Column id: <@spring.formInput "cardForm.columnId" "" "text"/>    <br/>
            Card title: <@spring.formInput "cardForm.title" "" "text"/>    <br/>
            Card text: <@spring.formInput "cardForm.text" "" "text"/>    <br/>
            <input type="submit" value="Create" />
        </form>
    </fieldset>
</div>

</body>
</html>

<html>