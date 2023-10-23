package criacionais.factorymethod.apple.firstmodel.factory;

import criacionais.factorymethod.apple.firstmodel.model.IPhone;
import criacionais.factorymethod.apple.firstmodel.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }

}
