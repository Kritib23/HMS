package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.DBconnect;
import com.entity.User;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String id = req.getParameter("id");
			String fullName = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			System.out.print("11");
			User u = new User(id,fullName, email, password);

			UserDao dao = new UserDao(DBconnect.getConn());
			System.out.print("1");
//			HttpSession session = req.getSession();

			boolean f = dao.register(u);
			System.out.print("Registeration successful1");
			if (f) {
                System.out.print("Registeration successful");
				/*
				 * session.setAttribute("sucMsg", "Register Sucessfully");
				 * resp.sendRedirect("signup.jsp");
				 */

			} else {
//				session.setAttribute("errorMsg", "Something wrong on server");
//				resp.sendRedirect("signup.jsp");
				System.out.println("Error in ") ; 
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}