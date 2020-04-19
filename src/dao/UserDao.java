
package dao;

import java.util.List;

import domain.UserInfo;

public interface UserDao
{

	public void saveUser(UserInfo user);

	public List<UserInfo> listUser();
}
