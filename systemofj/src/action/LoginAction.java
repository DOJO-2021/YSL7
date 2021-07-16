package action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.User;
import service.LoginService;

public class LoginAction {
	public String Login(HttpServletRequest request) {
		//戻り値に設定するページを初期設定しておく
		String page="/WEB-INF/jsp/login.jsp";

		//idとpwをリクエスト領域から取得
		String uId = request.getParameter("uId");
		String uPw = request.getParameter("uPw");

		//出力値を格納するBean
		User user = null;

		try {
			//入力値のチェック
			if(uId.trim().equals("") || uPw.trim().equals("")) {
				//リクエスト領域にエラーメッセージを格納
				request.setAttribute("l_error2","※全て入力してください");
			}else{
				//入力されていたらサービスへ処理を譲渡
				LoginService service = new LoginService();
				user=service.login(uId,uPw);

				if(user != null) {
					HttpSession session = request.getSession();
					session.setAttribute("user",user);

					//ログイン成功なのでトップページへ
					return "/WEB-INF/jsp/top.jsp";

				}else {
					request.setAttribute("l_error1", "※IDまたはpasswordが間違っています");
				}
			}

		}catch(SQLException e) {
			request.setAttribute("errMsg","SQL文おかしい");
		}catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

}
