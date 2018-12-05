<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<@spring.url '/css/style.css'/>">
</head>
<body>

<h2>Responsive Column Cards</h2>
<p>Resize the browser window to see the effect.</p>

<div class="row">
    <#list columnList as column>
        <div class="column">
        <#list column.cardList as card>
            <div class="card">
                <h3>${card.title}</h3>
                <p>${card.text}</p>
            </div>
        </#list>
        </div>
    </#list>
</div>

</body>
</html>