package config;

import java.time.Duration;

public class Config {
    public final static int TIMEOUT = (int)Duration.ofMillis(200).toMillis();
    public final static String SERVER_IP = "127.0.0.1";
}
