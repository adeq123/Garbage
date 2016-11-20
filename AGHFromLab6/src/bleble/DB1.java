package bleble;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class DB1{
  
	  private Connection conn = null;
	  private Statement stmt = null;
	  private ResultSet rs = null;
  
  public void connect(){
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      conn = 
        DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net/sql7145431",
                                    "sql7145431","2jDzS2bajA");
 
      
 
    } catch (SQLException ex) {
      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }catch(Exception e){e.printStackTrace();}	
  }
  
  public void listNames(){
	    try {
	      connect();
	      stmt = conn.createStatement();
	 
	      // Wyciagamy wszystkie pola z db
	      // znajdujące się w tabeli users
	      rs = stmt.executeQuery("SELECT * FROM books");
	      
	      while(rs.next()){
	        String ISBN = rs.getString(1);
	        String title = rs.getString(2);
	        String author = rs.getString(3);
	        String year = rs.getString(4);
	        System.out.println(ISBN + " " + title + " " + author + " " + year);
	      }
	    }catch (SQLException ex){
	      // handle any errors
	 
	    }finally {
	      // zwalniamy zasoby, które nie będą potrzebne
	      if (rs != null) {
	        try {
	          rs.close();
	        } catch (SQLException sqlEx) { } // ignore
	        rs = null;
	      }
	 
	      if (stmt != null) {
	        try {
	          stmt.close();
	        } catch (SQLException sqlEx) { } // ignore
	 
	        stmt = null;
	      }
	    }
	  }
  
  public void deleteAuthor(String author){
	    try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			stmt.executeUpdate(
			        "DELETE FROM books WHERE author="+author);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		      // zwalniamy zasoby, które nie będą potrzebne
		      if (rs != null) {
		        try {
		          rs.close();
		        } catch (SQLException sqlEx) { } // ignore
		        rs = null;
		      }
		 
		      if (stmt != null) {
		        try {
		          stmt.close();
		        } catch (SQLException sqlEx) { } // ignore
		 
		        stmt = null;
		      }
		    }
	  }
  
  public void deleteISBN(String isbn){
	    try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			stmt.executeUpdate(
			        "DELETE FROM books WHERE isbn="+isbn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		      // zwalniamy zasoby, które nie będą potrzebne
		      if (rs != null) {
		        try {
		          rs.close();
		        } catch (SQLException sqlEx) { } // ignore
		        rs = null;
		      }
		 
		      if (stmt != null) {
		        try {
		          stmt.close();
		        } catch (SQLException sqlEx) { } // ignore
		 
		        stmt = null;
		      }
		    }
	  }
  
  public void findAuthor(String author){
	  try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	    	rs = stmt.executeQuery(
			        "SELECT title FROM books WHERE author='"+author+"'");
	    while(rs.next())	
	    	System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		      // zwalniamy zasoby, które nie będą potrzebne
		      if (rs != null) {
		        try {
		          rs.close();
		        } catch (SQLException sqlEx) { } // ignore
		        rs = null;
		      }
		 
		      if (stmt != null) {
		        try {
		          stmt.close();
		        } catch (SQLException sqlEx) { } // ignore
		 
		        stmt = null;
		      }
		    }  
  }
  
  public void findISBN(String isbn){
	
	  try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	    	rs = stmt.executeQuery(
			        "SELECT title FROM books WHERE isbn="+isbn);
	    if(rs.next())	
	    	System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		      // zwalniamy zasoby, które nie będą potrzebne
		      if (rs != null) {
		        try {
		          rs.close();
		        } catch (SQLException sqlEx) { } // ignore
		        rs = null;
		      }
		 
		      if (stmt != null) {
		        try {
		          stmt.close();
		        } catch (SQLException sqlEx) { } // ignore
		 
		        stmt = null;
		      }
		    }
	  
  }
}