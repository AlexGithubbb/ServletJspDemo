package com.alexpower.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alexpower.bean.Product;
import com.alexpower.dao.getProductDAO;

/**
 * Servlet implementation class getProductController
 */
public class getProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("prodid"));
		
		// set id into dao
		getProductDAO dao =  new getProductDAO();
		Product product = null;
		try {
			product = dao.getProduct(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		request.setAttribute("product", product);
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("product", product);
		
		RequestDispatcher rd =  request.getRequestDispatcher("showProduct.jsp");
		
		rd.forward(request, response);

		
		
	}


}
