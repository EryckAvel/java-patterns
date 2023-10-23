package criacionais.factorymethod.apple.firstmodel.factory;

import criacionais.factorymethod.apple.firstmodel.model.IPhone;
import criacionais.factorymethod.apple.firstmodel.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }

}
