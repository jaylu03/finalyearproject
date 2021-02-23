<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no"
	name="viewport">
<title>House Mart</title>
<!-- General CSS Files -->
<link rel="stylesheet" href="adminResources/css/app.min.css">
<!-- Template CSS -->
<link rel="stylesheet" href="adminResources/css/datatables.min.css">
<link rel="stylesheet"
	href="adminResources/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" href="adminResources/css/style.css">
<link rel="stylesheet" href="adminResources/css/components.css">
<!-- Custom style CSS -->
<link rel="stylesheet" href="adminResources/css/custom.css">
<link rel="stylesheet" href="adminResources/css/datatable.css">
<link rel='shortcut icon' type='image/x-icon'
	href='adminResources/image/favicon.ico' />
</head>

<body>
<%


Class.forName("com.mysql.jdbc.Driver");

Connection c = DriverManager.getConnection("jdbc:mysql://localhost/housepriceprediction","root","root");


Statement s= c.createStatement();



ResultSet rs = s.executeQuery("select * from users");	



/* 
s.close();
c.close();
 */

%>
	<div id="app">
		<div class="main-wrapper main-wrapper-1">
			<div class="navbar-bg"></div>

			<jsp:include page="header.jsp"></jsp:include>


			<jsp:include page="menu.jsp"></jsp:include>


			<!-- Main Content -->
			<div class="main-content">
				<section class="section">
					<div class="section-body">
						<div class="row">
							<div class="col-12">
								<div class="card">
									<div class="card-header">
										<h4>View State</h4>
									</div>
									<div class="card-body">
										<div class="table-responsive">
											<table class="table table-striped table-hover"
												id="tableExport" style="width: 100%;">
												<thead>
													<tr>
														<th>State Name</th>
														<th>State Description</th>
														<th>Actions</th>
																										
													</tr>
												</thead>
												<tbody>
												<%
													while(rs.next()){
														
														String fn = rs.getString("firstname");
														String ln = rs.getString("lastname");
														String email = rs.getString("email");
														String phone = rs.getString("phonenumber");
														String psw = rs.getString("password");
													
													%>
													<tr>
														<td><%out.println(fn); %></td>
														<td><%out.println(ln); %></td>
													<!-- <td><%out.println(email); %></td>
														<td><%out.println(phone); %></td> -->
														<td>
															<button class="btn btn-outline-success">Edit</button> 
															<button class="btn btn-outline-danger">Delete</button>
														</td>
													
													</tr>
													<% } %>
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>

			<jsp:include page="footer.jsp"></jsp:include>


		</div>
	</div>
	<!-- General JS Scripts -->
	<script src="adminResources/js/app.min.js"></script>
	<!-- JS Libraies -->
	<!-- Page Specific JS File -->
	<script src="adminResources/js/datatables.min.js"></script>
	<script src="adminResources/js/dataTables.bootstrap4.min.js"></script>
	<script src="adminResources/js/dataTables.buttons.min.js"></script>
	<script src="adminResources/js/buttons.flash.min.js"></script>
	<script src="adminResources/js/jszip.min.js"></script>
	<script src="adminResources/js/pdfmake.min.js"></script>
	<script src="adminResources/js/vfs_fonts.js"></script>
	<script src="adminResources/js/buttons.print.min.js"></script>
	<script src="adminResources/js/datatables.js"></script>
	<!-- Template JS File -->
	<script src="adminResources/js/scripts.js"></script>
	<!-- Custom JS File -->
	<script src="adminResources/js/custom.js"></script>
</body>

</html>