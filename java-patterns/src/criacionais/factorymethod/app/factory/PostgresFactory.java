package criacionais.factorymethod.app.factory;

import criacionais.factorymethod.app.model.DB;
import criacionais.factorymethod.app.model.PostgresDB;

public class PostgresFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
