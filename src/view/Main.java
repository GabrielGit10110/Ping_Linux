package view;

import controller.PingController;

public class Main {

	public static void main(String[] args) {
		
		PingController pUol = new PingController("ping -4 -c 10 www.uol.com.br", "UOL");
		PingController pTerra = new PingController("ping -4 -c 10 www.google.com.br", "Terra");
		PingController pGoogle = new PingController("ping -4 -c 10 www.terra.com.br", "Google");

		pUol.start();
		pTerra.start();
		pGoogle.start();

	}

}
