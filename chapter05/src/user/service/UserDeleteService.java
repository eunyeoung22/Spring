package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {
	@Setter
	private UserDAO userDAO = null;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		// 수정할 아이디 입력
		System.out.println();
		System.out.print("삭제할 아이디 입력 : ");
		String id = scan.next();
		
		UserDTO userDTO = userDAO.getId(id);
		
		if(userDTO ==null) {
			System.out.println("찾고자하는 아이디가 없습니다.");
			return;
		}
		userDAO.delete(id);
		
		System.out.println("삭제완료하였습니다.");

	}

}
