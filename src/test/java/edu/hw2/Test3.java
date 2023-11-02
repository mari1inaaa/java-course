package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Fail.fail;
import edu.hw2.Task3.*;

public class Test3 {
    @Test
    void stableConnection() {
        StableConnection connection = new StableConnection();
        try {
            connection.execute("test command");
        } catch (Exception e) {
            fail("exception");
        }

    }

//    @Test
//    void faultyConnection() {
//        FaultyConnection connection = new FaultyConnection();
//        try {
//            connection.execute("test command");
//        } catch (Exception e) {
//            fail("exception");
//        }
//    }

    @Test
    void defaultManager() {
        DefaultConnectionManager connectionManager = new DefaultConnectionManager();
        try {
            connectionManager.getConnection();
        } catch (Exception e) {
            fail("exception");
        }
    }
    @Test
    void faultyManager(){
        FaultyConnectionManager connectionManager = new FaultyConnectionManager();
        try {
            connectionManager.getConnection();
        } catch (Exception e) {
            fail("exception");
        }
    }
    @Test
    void popularCommandExecutor() {
        DefaultConnectionManager defaultConnectionManager = new DefaultConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(defaultConnectionManager, 3);
        try {
            executor.updatePackages();
        } catch (Exception e) {
            fail("exception");
        }
    }
}
