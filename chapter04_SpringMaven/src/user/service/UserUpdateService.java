package user.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserUpdateService implements UserService {
	@Autowired
	private UserDAO userDAO = null;


	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		// 수정할 아이디 입력
		System.out.println();
		System.out.print("수정할 아이디 입력 : ");
		String id = scan.next();
		
		UserDTO userDTO = userDAO.getId(id);
		
		if(userDTO ==null) {
			System.out.println("찾고자하는 아이디가 없습니다.");
			return;
		}
			System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t" + userDTO.getPwd());
		
			System.out.println();
			System.out.println("수정할 이름 입력 : ");
			String name = scan.next();
			System.out.println("수정할 비밀번호 입력 : ");
			String pwd = scan.next();
			
			Map<String, String> map = new HashedMap<String, String>();
			map.put("name",name);
			map.put("id",id);
			map.put("pwd",pwd);
			
			userDAO.update(map);
			
		}

}
