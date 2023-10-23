package criacionais.factorymethod.apple.simplemodel.factory;

import criacionais.factorymethod.apple.simplemodel.model.*;

public abstract class IPhoneFactory {

    public static IPhone orderIphone(String model, String tipo){
        IPhone device = null;

        switch (model) {
            case "X" -> {
                switch (tipo) {
                    case "Standart" -> device = new IPhoneX();
                    case "HighEnd" -> device = new IPhoneXSMax();
                }
            }
            case "11" -> {
                switch (tipo) {
                    case "Standart" -> device = new IPhone11();
                    case "HighEnd" -> device = new IPhone11Pro();
                }
            }
            default -> System.out.println("Modelo não encontrado!");
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
	
}
