package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        // Consome o serviço de pedidos
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

        Service service = Service.create(url, qName);
        WineStockService wineStockService = service.getPort(WineStockService.class);

        String order = wineStockService.placeOrder("Merlot", 2);
        System.out.println("Resultado do pedido: " + order);

        // Consome o serviço de aviso
        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");

        Service service2 = Service.create(url2, qName2);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String warn = wineWarningService.sendWarn();
        System.out.println("Aviso: " + warn);
    }
}