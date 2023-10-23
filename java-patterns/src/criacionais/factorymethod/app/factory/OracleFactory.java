package criacionais.factorymethod.app.factory;

import criacionais.factorymethod.app.model.DB;
import criacionais.factorymethod.app.model.OracleDB;

public class OracleFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
