package edu.hw2;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {
    private final static Logger LOGGER = LogManager.getLogger();

    public interface Connection extends AutoCloseable {
        void execute(String command);

        void close();
    }

    public interface ConnectionManager {
        Connection getConnection();
    }

    public static class StableConnection implements Connection {
        @Override
        public void execute(String command) {
            LOGGER.info("Executing command on stable connection: " + command);
        }

        @Override
        public void close() {
            LOGGER.info("Closing stable connection");
        }
    }

    public static class FaultyConnection implements Connection {
        private static final double FAIL_PROBABILITY = 0.5;

        @Override
        public void execute(String command) {
            LOGGER.info("Executing command on faulty connection: " + command);
            if (new Random().nextDouble() < FAIL_PROBABILITY) {
                throw new ConnectionException("Connection failed");
            } else {
                LOGGER.info("Executed successfully");
            }
        }

        @Override
        public void close() {
            LOGGER.info("Closing faulty connection");
        }
    }

    public static class DefaultConnectionManager implements ConnectionManager {
        private static final double FAIL_PROBABILITY = 0.5;

        @Override
        public Connection getConnection() {
            LOGGER.info("Getting connection in default connection manager");
            if (new Random().nextDouble() < FAIL_PROBABILITY) {
                return new FaultyConnection();
            }
            return new StableConnection();
        }
    }

    public static class FaultyConnectionManager implements ConnectionManager {
        @Override
        public Connection getConnection() {
            return new FaultyConnection();
        }
    }

    public static class ConnectionException extends RuntimeException {
        public ConnectionException(String message) {
            super(message);
        }
    }

    public static final class PopularCommandExecutor {
        private final ConnectionManager manager;
        private final int maxAttempts;

        public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
            this.manager = manager;
            this.maxAttempts = maxAttempts;
        }

        public void updatePackages() {
            tryExecute("apt update && apt upgrade -y");
        }

        void tryExecute(String command) {
            Connection connection = manager.getConnection();
            int attempts = 1;
            while (attempts <= maxAttempts) {
                try {
                    connection.execute(command);
                    connection.close();
                    return;
                } catch (ConnectionException e) {
                    LOGGER.info("Error executing command: " + command);
                    attempts++;
                }
            }
            connection.close();
            LOGGER.info("Failed to execute command: " + command);
        }
    }
}
