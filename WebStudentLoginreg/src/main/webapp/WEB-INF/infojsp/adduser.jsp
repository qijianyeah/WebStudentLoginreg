<%--
  Created by IntelliJ IDEA.
  User: QiJian
  Date: 2021/5/24
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>表格</title>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <script language="javascript">
        function check1(){
            var  f=document.form;
            if(f.name.value==""){
                alert("请输入用户名");
                f.name.focus();
                return false;
            }

            if((f.password.value.length &lt; 6)||(f.password.value=="")){
                alert("请输入至少 6 个字符的密码!");
                f.password.focus();
                return false;
            }

            if (document.form.password.value!=document.form.password1.value){
                alert("确认码必须和输入的密码相同！");
                f.password.focus();
                return false;
            }

            if ((f.radio[0].checked==false )&amp;&amp; (f.radio[1].checked==false))
            {
                alert("请指定性别");
                f.radio[0].focus();
                return false;
            }


            var q1=f.email.value.indexOf("@");
            var q2=f.email.value.indexOf(".");
            if (q1==-1||q2==-1)
            {
                alert("请输入有效的电子邮件地址");
                f.email.focus();
                return false;
            }


            document.form.submit();
        }

    </script>

</head>

<body>


<form name="form" action="RegisterServelet" method="post">
    <table width="900" height="200" align="center" border="1" >
        <tr>
            <td>
                用户名：	</td>
            <td><input type="text" name="name" size="30" maxlength="16">&nbsp;&nbsp;&nbsp;&nbsp;登陆时使用的ID</td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"   size="30" maxlength="16">&nbsp;&nbsp;&nbsp;&nbsp;请输入密码</td>
        </tr>

        <tr>
            <td>密码确认：</td>
            <td><input type="password" name="password1" size="30" maxlength="16">&nbsp;&nbsp;&nbsp;&nbsp;请再次输入密码</td>
        </tr>

        <tr>
            <td>性别：</td>
            <td><input type="radio" name="radio" value="男" >男&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="radio" value="女">女</td>
        </tr>

        <tr>
            <td>E-mail:</td>
            <td><input type="text" name="email" >&nbsp;&nbsp;&nbsp;&nbsp;请输入邮箱</td>
        </tr>

        <tr >
            <td></td>

            <td align="center">
                <input type="button" value="提交" name="register" onclick="check1()" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </tr>

    </table>
</form>
</body>
</html>
