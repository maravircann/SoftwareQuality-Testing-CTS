package clase.singletonEager;

import clase.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        ConnectionPoolEager pool= ConnectionPoolEager.getInstance();

        DatabaseConnection c1=pool.getConnection();
        DatabaseConnection c2=pool.getConnection();
        DatabaseConnection c3=pool.getConnection();
        pool.showStatus();

        if (c1 != null) c1.connect();
        if (c2 != null) c2.connect();

        pool.showStatus();


//        ConnectionPoolStaticBlock poolStaticBlock=ConnectionPoolStaticBlock.getInstance();
//
//        DatabaseConnection c4=poolStaticBlock.getConnection();
//        DatabaseConnection c5=poolStaticBlock.getConnection();
//
//        poolStaticBlock.showStatus();

        //if(c4!=null) c4.connect();
        //if(c5!=null) c5.connect();

        //poolStaticBlock.showStatus();
    }
}