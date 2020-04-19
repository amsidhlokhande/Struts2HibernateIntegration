<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:head />
<style type="text/css">
  @IMPORT url("style.css");
</style>
</head>
<body>
   <s:form action="addUser.action" >
      <s:textfield name="name" label="User Name"/>
      <s:password name="password" label="Password"/>
      <s:radio list="{'M','F'}" name="gender" label="Gender"/>
      <s:select name="country" list="{'India','USA','UK'}" headerKey=""
		headerValue="Country" label="Select a country" />
	  <s:textarea name="aboutYou" label="About Yourself"/>
      <s:checkbox name="mailingList" label="Would you like to join our mailing list?"/>
      <s:submit></s:submit><s:reset></s:reset>
   </s:form>
   
   <s:if test="userList.size > 0">
     <div class="content">
       <table class="userTable" cellpadding="5px">
          <tr class="even">
             <th>Name</th>
             <th>Gender</th>
             <th>Country</th>
             <th>About You</th>
             <th>Mailing List</th>
          </tr>
          <s:iterator  status="userStatus" value="userList">
               <tr class='<s:if test="#userstatus.odd==true">odd</s:if><s:else>even</s:else>'>
                  <td><s:property value="name"/></td>
                  <td><s:property value="gender"/></td>
                  <td><s:property value="country"/></td>
                  <td><s:property value="aboutYou"/></td>
                  <td><s:property value="mailingList"/></td>
               </tr>
          </s:iterator>
          
       </table>
     </div>
   </s:if>
      
</body>
</html>