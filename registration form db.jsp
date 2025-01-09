<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<body>
    <%
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String mno = request.getParameter("mno");

        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "");

            // Prepare the SQL statement
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblUser (username, password, email, mobile_no) VALUES (?, ?, ?, ?)");
            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, mno);


            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<p>Record Saved Successfully</p>");
            } else {
                out.println("<p>Failed to save the record.</p>");
            }


            ps.close();
            con.close();
        } catch (ClassNotFoundException e) {
            out.println("<p>Driver not found: " + e.getMessage() + "</p>");
        } catch (SQLException e) {
            out.println("<p>Database error: " + e.getMessage() + "</p>");
        } catch (Exception ex) {
            out.println("<p>Unexpected error: " + ex.getMessage() + "</p>");
        }
    %>
</body>
</html>
