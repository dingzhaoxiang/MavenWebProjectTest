<%--
  Created by IntelliJ IDEA.
  User: dzx
  Date: 2017/6/2
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>登录确认界面</h2>
<form action="/push/PushMeessageServlet" method="post">
    <input type="submit" value="登录">
</form>
<form action="/API/LogoutServlet" method="post">
    <input type="submit" value="切换账号">
</form>

</body>
</html>
