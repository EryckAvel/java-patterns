package criacionais.factorymethod.apple.firstmodel.factory;

import criacionais.factorymethod.apple.firstmodel.model.IPhone;
import criacionais.factorymethod.apple.firstmodel.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
