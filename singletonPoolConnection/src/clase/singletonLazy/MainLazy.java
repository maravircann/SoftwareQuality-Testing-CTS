package clase.singletonLazy;

import clase.DatabaseConnection;

public class MainLazy {
    public static void main(String[] args) {
        ConnectionPoolLazy poolLazy=ConnectionPoolLazy.getInstance();
        poolLazy.showStatus();
        DatabaseConnection c6=poolLazy.getConnection();
        DatabaseConnection c7=poolLazy.getConnection();

        poolLazy.showStatus();

        if(c6!=null) c6.connect();
        if(c7!=null) c7.connect();
        poolLazy.showStatus();
    }
}
