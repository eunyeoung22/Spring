package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserInsertService implements UserService {
	@Autowired//생성된 빈 중에서 UserDTO을 찾아서 자동으로 매핑해라
	private UserDTO userDTO = null;	
	
	@Autowired
	private UserDAO userDAO = null;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("아이디 입력: ");
		String id = scan.next();
		System.out.print("비밀번호 입력: ");
		String pwd = scan.next();
		
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		userDAO.write(userDTO);
		
		System.out.println(name + "님의 데이터를 저장하였습니다.");
	}

}
