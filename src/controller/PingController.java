package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PingController extends Thread {
	private final String msg;
	private final String serverName;

	public PingController(String msg, String serverName) {
		this.msg = msg;
		this.serverName = serverName;
	}
	
	private String os() { 
		String osName = System.getProperty("os.name");
		return osName;
	}
	
	@Override
	public void run() {
		if (os().contains("Linux")) {
			pingServer();

		} else {
			System.out.println("Sistema operacional invalido: " + os());
			System.out.println("Aplicacao so pode ser executada em uma distribuicao linux");
		}
		
}
	
	private void pingServer() {
		String[] refactoredMessage = msg.split(" ");
		
		try {
			Process process = Runtime.getRuntime().exec(refactoredMessage);
			readAllLines(process);
			
		} catch (Exception e) {
			
		}
		
		
	}
	
	private void readAllLines(Process p) {
		InputStream inStream = p.getInputStream();
		InputStreamReader reader = new InputStreamReader(inStream);
		BufferedReader buffer = new BufferedReader(reader);

		try {
			String linha = buffer.readLine();

			while (linha != null) {
				
					if (linha.contains("ttl")) {
						String trimmedLine = linha.trim();
						String[] lineArray = trimmedLine.split("=");
						
						System.out.println(serverName + " tempo de iteracao: " + lineArray[3] + "\n");
						
					}
					
					if (linha.contains("avg")) { // teste de tempo medio com ping para os servidores
						String[] averageTime = linha.split("/");
						System.out.println("Tempo médio ping no server " + serverName +": " + averageTime[4] + "ms");
						
					}
					
					linha = buffer.readLine();
			}
			
			buffer.close();
			inStream.close();
			reader.close();

		} catch (Exception e) {
			String msg = e.getMessage();
			System.err.println(msg);

		}
		
	}	
}
