package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import domain.UserInfo;


public class UserDaoImpl implements UserDao
{
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;
       	

	@Override
	public void saveUser(UserInfo user)
	{
      try
      {
    	  session.save(user);
      }catch(Exception ex)
      {
    	  transaction.rollback();
    	  ex.printStackTrace();
      }
      
	}
    @SuppressWarnings("unchecked")
	@Override
	public List<UserInfo> listUser()
	{
         List<UserInfo> userList=null;
         try
         {
        	 userList= session.createQuery("from UserInfo").list();
		 }catch(Exception ex)
         {
        	 ex.printStackTrace();
         }
		  
		return userList;
	}
   
}
