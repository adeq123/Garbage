package cw2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class DB{
  
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
  
  public void createTable(){
      connect();
      try {
		stmt = conn.createStatement();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      
      try {
		stmt.executeUpdate( "CREATE TABLE IF NOT EXISTS pracownicy " +
				   "(PESEL VARCHAR(64) NOT NULL," +
				   "WYNAGRODZENIE VARCHAR(64) NOT NULL,"+
				   "PRIMARY KEY (PESEL))"
				   );
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
  }
  
  public void wylistujPracownikow(){
	    try {
	      connect();
	      stmt = conn.createStatement();
	 
	      // Wyciagamy wszystkie pola z db
	      // znajdujące się w tabeli users
	      rs = stmt.executeQuery("SELECT * FROM pracownicy");
	      
	      while(rs.next()){
	        String PESEL = rs.getString(1);
	        String WYNAGRODZENIE = rs.getString(2);
	        System.out.println(PESEL + " " + WYNAGRODZENIE);
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
  
  public void deleteByPesel(String pesel){
	    try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			stmt.executeUpdate(
			        "DELETE FROM pracownicy WHERE PESEL=" + pesel);
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
  
  public void dodajPracownika(String PESEL, String Wynagordzenie){
	    try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			stmt.executeUpdate(
					"INSERT INTO pracownicy VALUES ('"+PESEL+"','"+Wynagordzenie+"')");
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
    
  public void znajdzPracownika(String pesel){
	  try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	    	rs = stmt.executeQuery(
			        "SELECT * FROM pracownicy WHERE pesel="+pesel);
	    while(rs.next())	
	    	System.out.println(rs.getString(1)+" "+rs.getString(2));
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
  
  public void updatePracownik(String pesel, String noweWynagrodzenie){
	  
	  try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	    	 stmt.executeUpdate(
			        "UPDATE pracownicy SET wynagrodzenie = '"+noweWynagrodzenie+"' WHERE pesel='"+pesel+"'");
	   znajdzPracownika(pesel);
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
  
  public void closeCon(){
	  try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
