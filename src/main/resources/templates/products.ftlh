<!DOCTYPE html>
<html>
<head>
    <title>MinkasShop</title>
</head>
<body>
<h2>Welcome!</h2>
<br>
<h3>Товары</h3>
<#--Прохожу по листу продуктов-->
<#list products as product>
<#--Создаю контейнер-->
    <div>
<#--Вывожу название и цену товара, а после я создаю кнопку, которая ссылается по артиклу товара на подрбное описание-->
        <p><b>${product.title}</b> ${product.price} | <a href="/product/${product.article}">Подробнее.....</a> </p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="product/create" method="post">
    Название товара: <input type="text" name="title"/><br><br>
    Описание товара: <input type="text" name="description"/><br><br>
    Стоимость товара: <input type="number" name="price"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>