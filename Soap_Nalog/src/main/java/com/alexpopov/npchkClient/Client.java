package com.alexpopov.npchkClient;

import unisoft.ws.fnsndscaws2.webServer.FNSNDSCAWS2;
import unisoft.ws.fnsndscaws2.request.NdsRequest2;
import unisoft.ws.fnsndscaws2.request.ObjectFactory;
import unisoft.ws.fnsndscaws2.response.NdsResponse2;
import unisoft.ws.fnsndscaws2.webServer.FNSNDSCAWS2Port;

import java.util.List;
import java.util.Scanner;


public class Client {

    private FNSNDSCAWS2 fsn = new FNSNDSCAWS2();
    private FNSNDSCAWS2Port port = fsn.getFNSNDSCAWS2Port();
    private NdsRequest2 request = new NdsRequest2();
    private List<NdsRequest2.NP> list;
    private NdsRequest2.NP np = new ObjectFactory().createNdsRequest2NP();

    public void checkUrL(Scanner scanner){
        list = request.getNP();
        enterInfoIntoList(scanner, "ur");
        printInfo("Юридического лица");
    }

    public void checkIP(Scanner scanner){
        list = request.getNP();
        enterInfoIntoList(scanner, "ip");
        printInfo("ИП");
    }

    public void enterInfoIntoList(Scanner scanner, String kind){
        String str;
        do {
            System.out.println("(обязательное поле)\nВведите ИНН :");
            str = scanner.nextLine();
        } while (str.isEmpty());
        np.setINN(str);
        if(kind.equals("ur")) {
            System.out.println("(при наличии)\nВведите КПП :");
            str = scanner.nextLine();
            if (!str.isEmpty()) {
                np.setKPP(str);
            }
        }
        System.out.println("(при наличии)\nДата сделки :");
        str = scanner.nextLine();
        if(!str.isEmpty()){
            np.setDT(str);
        }
        list.add(np);
    }

    public void printInfo(String name){
        System.out.format("Данные по ИНН %s :%s ,Статус:%s%n",name,np.getINN(),
                new VariantResp().getNeedParametrs(port.ndsRequest2(request).getNP().get(0).getState(), name));
    }
}


