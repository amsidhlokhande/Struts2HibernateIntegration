
package web;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.UserDao;
import dao.UserDaoImpl;
import domain.UserInfo;

public class UserAction extends ActionSupport implements ModelDriven<UserInfo>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserInfo user = new UserInfo();
    private List<UserInfo>userList=new ArrayList<UserInfo>();
    
    UserDao userDao=new UserDaoImpl();
    @Override
    public UserInfo getModel()
    {
      return user;
    }
    
    public String add()
    {
    	userDao.saveUser(user);
    	return SUCCESS;
    }

	
	public UserInfo getUser()
	{
	
		return user;
	}
    
	
	
	public List<UserInfo> getUserList()
	{
	
		return userList;
	}

	
	public void setUserList(List<UserInfo> userList)
	{
	
		this.userList = userList;
	}

	public void setUser(UserInfo user)
	{
	
		this.user = user;
	}
	public String list()
	{
		userList=userDao.listUser();
		return SUCCESS;
		
	}
    
}
