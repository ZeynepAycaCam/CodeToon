package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Database connection in eclipse to take questions, hint, answer.
 * @author Group2D
 */
public class Questions {

	// Directing Database in Netbeans
	String dbURL = "jdbc:derby://localhost:1527/Questions;create=true;user=admin;password=admin";
	String tableName = "APP.UNTITLED";
	// Jdbc Connection
	Connection conn = null;
	Statement stmt = null;

	/**
	 * A method to create connection between my database and eclipse.e
	 */
	public void createConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
		} catch (Exception except) {
			except.printStackTrace();
		}
	}

	/**
	 * A method to select specific questions in database
	 * @param n an integer to represent specific row in table database
	 * @return String the question
	 */
	@SuppressWarnings("finally")
	public String selectQuestions(int n) {
		String question = "";
		try {
			// create statement based on result set which is scroll sensitive
			// and updatable to take any value in it.
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// selecting all the values
			ResultSet results = stmt.executeQuery("select * from " + tableName);
			ResultSetMetaData rsmd = results.getMetaData();

			// absolute to take any data
			results.absolute(n);
			question = results.getString("Question");

			return question;
			
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		} finally {
			return question;
		}
	}

	/**
	 * A method to select specific changeable questions in database
	 * @param n an integer to represent specific row in table database
	 * @return String the changeable question
	 */
	@SuppressWarnings("finally")
	public String selectChangeable(int n) {
		String changeable = "";
		try {
			// create statement based on result set which is scroll sensitive
			// and updatable to take any value in it.
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// selecting all the values
			ResultSet results = stmt.executeQuery("select * from " + tableName);
			ResultSetMetaData rsmd = results.getMetaData();

			// absolute to take any data
			results.absolute(n);
			changeable = results.getString("Question_Changeable");

			return changeable;
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		} finally {
			return changeable;
		}
	}

	/**
	 * A method to select specific hint in database
	 * @param n an integer to represent specific row in table database
	 * @return String the hint
	 */
	@SuppressWarnings("finally")
	public String selectHint(int n) {
		String hint = "";
		try {
			// create statement based on result set which is scroll sensitive
			// and updatable to take any value in it.
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// selecting all the values
			ResultSet results = stmt.executeQuery("select * from " + tableName);
			ResultSetMetaData rsmd = results.getMetaData();

			// absolute to take any data
			results.absolute(n);
			hint = results.getString("Hint");

			return hint;
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		} finally {
			return hint;
		}
	}

	/**
	 * A method to select specific answer in database
	 * @param n an integer to represent specific row in table database
	 * @return String the answer
	 */
	@SuppressWarnings("finally")
	public String selectAnswer(int n) {
		String answer = "";
		try {
			// create statement based on result set which is scroll sensitive
			// and updatable to take any value in it.
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// selecting all the values
			ResultSet results = stmt.executeQuery("select * from " + tableName);
			ResultSetMetaData rsmd = results.getMetaData();

			// absolute to take any row in data
			results.absolute(n);
			answer = results.getString("Answer");
			return answer;

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		} finally {
			return answer;
		}
	}

	/**
	 * A method to shut down the database based on statement and connection
	 */
	public void shutdown() {
		try {
			// closing statement
			if (stmt != null) {
				stmt.close();
			}
			// closing connection
			if (conn != null) {
				DriverManager.getConnection(dbURL + ";shutdown=true");
				conn.close();
			}
		} catch (SQLException sqlExcept) {

		}

	}
}