package com.vidvaan.network.bean;

public class Samsung {

	private Network network;

	public void setNetwork(Network network) {
		this.network = network;
	}

	public void connectNetwork() {
		network.calls();
		network.sms();
		network.data();

	}

}
