package criacionais.factorymethod.apple.firstmodel.factory;

import criacionais.factorymethod.apple.firstmodel.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(){
        IPhone device = null;
        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
	
}
