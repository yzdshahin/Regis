
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registering Page</title>
    </head>
    <body>
           <body>
                
        <form action="Login/register" method="post">  
  
Name:<input type="text" name="name"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
Father:<input type="text" name="father"/><br/><br/>  
Birth: <input type="date" name="birth"/><br/><br/>  
Gender:  
<select name="gender">  
<option>male</option>  
<option>female</option>  
</select>  
  
<br/><br/>  

<input type="submit" value="register"/>  
  
        </form>  
    </body>
    </body>
</html>
