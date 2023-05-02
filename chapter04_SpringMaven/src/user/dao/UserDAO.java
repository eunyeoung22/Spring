/**
 * 
 */
package user.dao;

import java.util.List;
import java.util.Map;

import user.bean.UserDTO;

/**
 * @author bitcamp
 *
 */
public interface UserDAO {

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList();

	public UserDTO getId(String id);

	public void update(Map<String, String> map);

	public void delete(String id);

}
