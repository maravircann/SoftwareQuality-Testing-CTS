package clase.singletonStaticBlock;

import clase.DatabaseConnection;

public class MainStatic {
    public static void main(String[] args) {
        ConnectionPoolStaticBlock poolStaticBlock=ConnectionPoolStaticBlock.getInstance();

        DatabaseConnection c4=poolStaticBlock.getConnection();
        DatabaseConnection c5=poolStaticBlock.getConnection();

        poolStaticBlock.showStatus();

        if(c4!=null) c4.connect();
        if(c5!=null) c5.connect();

        poolStaticBlock.showStatus();
    }
}
