package com.covalense.eportal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.eportal.dao.EmployeeDAO;
import com.covalense.eportal.dao.EmployeeDAOFactory;
import com.covalense.eportal.dto.EmployeeInfoBean;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		// validate the session
		HttpSession session = req.getSession(false);
		if (session == null) {
			// invalid session;generate login page with error Info
			out.print("<h1><span style='color:red'>Invalid Request!!!!</span></h1>");
			out.print("<br>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("emplogin.html");
			dispatcher.include(req, resp);
		} else {
			// valid session;
			String idValue = req.getParameter("id");

			// Interact with DB & get the Employee Info
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

			// Send the Response to browser

			if (bean != null) {
				
				RequestDispatcher dispatcher = null;
				resp.setContentType("text/html");
				dispatcher = req.getRequestDispatcher("./homepage.jsp");
				dispatcher.include(req, resp);
				
				/*
				 * out.print(" <!DOCTYPE html>"); out.print(" <html lang='en'>");
				 * out.print(" <head>"); out.print(
				 * " <link href='//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css' rel='stylesheet'>"
				 * ); out.
				 * print(" <link href='//www.fuelcdn.com/fuelux/3.13.0/css/fuelux.min.css' rel='stylesheet'>"
				 * ); out.print(" <meta charset='UTF-8'>"); out.
				 * print(" <meta name='viewport' content='width=device-width, initial-scale=1.0'>"
				 * ); out.print(" <meta http-equiv='X-UA-Compatible' content='ie=edge'>");
				 * out.print(
				 * " <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>"
				 * ); out.print(" <title>Document</title>"); out.print("          </head>");
				 * out.print("          <body>");
				 * out.print("                  <header class='container-fluid'>"); out.
				 * print("                          <div class='row' style='background: gray;margin-bottom:10px; '>"
				 * ); out.print(" <div class='col-sm-1' style='margin-top:10px; '>"); out.print(
				 * "     <img class='rounded-circle' alt='Bootstrap Image Preview' style='height: 50px; width: 50px' src='https://www.layoutit.com/img/sports-q-c-140-140-3.jpg' />"
				 * ); out.print(" </div>");
				 * out.print("<form method='get' action='./empsearch'>");
				 * out.print(" <div class='col-sm-10' style='margin-top:10px; '>");
				 * out.print("         <div class='form-group'>");
				 * out.print("  <label class='control-label' for='searchInput'></label>");
				 * out.print("  <div class='col-md-12'>"); out.
				 * print("    <div class='search input-group' data-initialize='search' role='search' id='search'>"
				 * ); out.print(
				 * "      <input type='text' class='form-control' id='search' name='search' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default'>"
				 * ); out.print("      <span class='input-group-btn'>");
				 * out.print("        <button class='btn btn-default' type='submit'> ");
				 * out.print("         <span class='glyphicon glyphicon-search'></span>");
				 * out.print("          <span class='sr-only'>Search</span>");
				 * out.print("        </button>"); out.print("      </span>");
				 * out.print("  </div>"); out.print("  </div>"); out.print(" </div>");
				 * out.print("  </div>"); out.print("</form>");
				 * out.print("  <div class='col-md-1' style='margin-top:10px; '>"); out.
				 * print("  <button type='button' class='btn btn-success btn-inline' id='btn' onclick='logout()'>"
				 * ); out.print(" logout"); out.print(" </button>"); out.print(" </div>");
				 * out.print("</div>"); out.print(" </header>");
				 * out.print(" <section style='margin: 25%'>");
				 * out.print(" <h1><span style=\'color:green\'>EmployeeFound !!!</span></h1>");
				 * out.print(" <h3><br>"); out.print(" <br> ID 		        ---" +
				 * bean.getId()); out.print(" <br> NAME			    ---" + bean.getName());
				 * out.print(" <br> AGE 			    ---" + bean.getAge());
				 * out.print(" <br> GENDER			---" + bean.getGender());
				 * out.print(" <br> SALARY  		    ---" + bean.getSalary());
				 * out.print(" <br> PHONE  		  	---" + bean.getPhnum());
				 * out.print(" <br> JOINING_DATE	    ---" + bean.getJoiningDate());
				 * out.print(" <br> ACCCOUNT_NUMBER   ---" + bean.getAccountNumber());
				 * out.print(" <br> EMAIL  			---" + bean.getEmail());
				 * out.print(" <br> DESIGNATION    ---" + bean.getDesignation());
				 * out.print(" <br> DOB        		---" + bean.getDateOfBirth());
				 * out.print(" <br> DEPT_NO (FK)   	---" + bean.getDepartmentId());
				 * out.print(" <br> MGR_ID			---" + bean.getManagerId());
				 * out.print(" </h3>"); out.print("  </section>    ");
				 * out.print("  <footer style='background: gray; width: 100%; height: 30px;'>");
				 * out.print("     footer details"); out.print("   </footer>");
				 * out.print("  </body>"); out.print("  <script>");
				 * out.print("  function logout() {"); out.print("   alert('logging out');");
				 * out.print("    window.location.href='./logout'; }");
				 * out.print("  </script>"); out.print("  </html>");
				 */

			} else {

				RequestDispatcher dispatcher = null;
				resp.setContentType("text/html");
				dispatcher = req.getRequestDispatcher("emplogin.html");
				dispatcher.include(req, resp);
				out.print("<html>");
				out.print("<body>");
				out.print("  <script>");
				out.print("   alert('Invalid password or id');");
				out.print("  </script>");
				out.print("</body>");

				out.print("<html>");

			}

			// get the object from
//		ServletContext ctx = getServletContext();
//		EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("employeeInfo");
		}
	}
}