<%@page import="jums.UserData"%>
<%
   HttpSession hs = request.getSession();
   UserData udb = (UserData)hs.getAttribute("user");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>top</title>
    </head>
    <body>
        <h2>このサイトは商品検索が行え、金額を気にせず、好きなだけ購入ができます。<br>
        購入確認画面でカートの中身を変更・削除が可能ですが、その場合一つ前のページであるカートに戻ります。</h2><br>
        <%if(hs.getAttribute("user")==null){%>
        <a href="Login?p=top"><h3>ログイン</h3></a>
        <%}else{%>
        <h3><a href="Login">ログアウト</a> <a href="Mydata">マイページ</a>　<a href="Cart">カート</a>
        </h3><%}%>
        <form action="Search" method="GET">
        <h3>キーワード検索：</h3>
        <input type="text" name="query"/>
        <input type="submit" value="ここで検索"/>
        </form>
    </body>
</html>
