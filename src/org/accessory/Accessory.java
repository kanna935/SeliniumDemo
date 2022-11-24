package org.accessory;

import org.monitor.MonitorInfo;

public class Accessory extends MonitorInfo {
private void accessoryAll() {
	System.out.println("KEYBOARD MOUSE WIRES ETC....");
}
public static void main(String[] args) {
	Accessory ac=new Accessory();
	ac.desktopSize();
	ac.monitorName();
	ac.accessoryAll();
	ac.computerBrand();
	ac.computerModel();
	ac.sound();
}
}
