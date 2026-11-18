package iot.client;

import iot.zengxiangzhen.IoTDataService;
import iot.zengxiangzhen.IoTDataServiceImplService;

public class ClientMain {
    public static void main(String[] args) {
        IoTDataServiceImplService service = new IoTDataServiceImplService();
        IoTDataService port = service.getIoTDataServiceImplPort();

        System.out.println("1) 上报 GH-01: " + port.reportData("GH-01", 25.5, 62.0));
        System.out.println("2) 上报 GH-02: " + port.reportData("GH-02", 28.3, 55.4));
        System.out.println("3) 设备列表: " + port.listDevices());
        System.out.println("4) 查询 GH-01: " + port.queryDevice("GH-01"));
        System.out.println("5) 查询 GH-99: " + port.queryDevice("GH-99"));
    }
}
