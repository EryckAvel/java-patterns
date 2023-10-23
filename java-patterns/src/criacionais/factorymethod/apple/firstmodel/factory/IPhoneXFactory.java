package criacionais.factorymethod.apple.firstmodel.factory;

import criacionais.factorymethod.apple.firstmodel.model.IPhone;
import criacionais.factorymethod.apple.firstmodel.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
