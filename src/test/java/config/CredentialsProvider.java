package config;

public class CredentialsProvider {

    public static String getUserName(){
        String username = System.getenv("MB_USERNAME");
        if (username == null) {
            throw new RuntimeException("Username is not set");
        }
        return username;
    }

    public static String getPassword() {
        String passsword = System.getenv("MB_PASSWORD");
        if (passsword == null) {
            throw new RuntimeException("passsword is not set");
        }
        return passsword;
    }
}
