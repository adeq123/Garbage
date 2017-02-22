package l8;


import java.io.*;
import java.net.*;

public class EchoClient3 {

	private Socket echoSocket = null;
	private PrintWriter out = null;
	private BufferedReader in = null;
	private String ID = null;
	private String[] files = null;

	public static void main(String[] args) {
		EchoClient3 haha = new EchoClient3();
//		haha.findPassword();
//		System.out.println("Finito");
		try {
			if (haha.loginToServer("szymon", "najakuratniej")) {
				if (haha.ls()) {
//					haha.get(0);
//					haha.get(1);
//					haha.get(2);
				}
//				haha.put();
			}
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

	public void connect() {
		try {
			echoSocket = new Socket("149.156.98.145", 3000);
			out = new PrintWriter(echoSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(
					echoSocket.getInputStream()));
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host: localhost.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for "
					+ "the connection to: localhost.");
			System.exit(1);
		}
	}

	public void closeAll() throws IOException {
		if (out != null) {
			out.close();
		}
		if (in != null) {
			in.close();
		}
		if (echoSocket != null) {
			echoSocket.close();
		}
	}

	public boolean loginToServer(String login, String password)
			throws IOException {
		connect();
		out.println("LOGIN " + login + ";" + password);
		String result = in.readLine();
		System.out.println("echo: " + result);
		closeAll();

		if (result.equals("false")) {
			return false;
		} else {
			ID = result;
			return true;
		}
	}

	public boolean logout() throws IOException {
		connect();
		out.println("LOGOUT " + ID);
		String result = in.readLine();
		System.out.println("echo: " + result);
		closeAll();
		return !result.equals("false");
	}

	public boolean ls() throws IOException {
		connect();
		out.println("LS " + ID);
		String result = in.readLine();
		System.out.println("echo: " + result);
		closeAll();
		if (result.equals("false")) {
			return false;
		}
		files = result.split(";");
		return true;
	}

	public boolean put() throws IOException {
		connect();
		out.println("PUT " + ID + " Kasperek Ha!");
		String result = in.readLine();
		System.out.println("echo: " + result);
		closeAll();
		if (result.equals("false")) {
			return false;
		}
		return true;
	}
	public boolean get(int number) throws IOException {
		String result = null;
		connect();
		if (files != null) {
			if (number >= 0 || number < files.length) {
				out.println("GET " + ID + " " + files[number]);
				result = in.readLine();
				System.out.println("echo: " + result);
			}
		}
		closeAll();
		return !result.equals("false");
	}

	public void findPassword() {
		try {
			FileInputStream fstream = new FileInputStream("polish-dic.txt");
			DataInputStream inn = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(inn));
			String strLine;
			int i = 0;
			boolean flag = false;
			while ((strLine = br.readLine()) != null) {
				if (strLine.contains("zadreptany")) {
					flag = true;
				}
				if (flag) {
					System.out.println(strLine);
					connect();
					strLine = strLine.split("/")[0];
					// System.out.println(strLine);
					out.println("LOGIN szymon;" + strLine);
					out.flush();
					String result = in.readLine();

					if (i % 1000 == 0) {
						System.out.println(i);
					}

					if (!result.equals("false")) {
						System.out.println(strLine);
						break;
					}
					i++;
				}
				closeAll();
			}
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
