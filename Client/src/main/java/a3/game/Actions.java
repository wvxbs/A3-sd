package a3.game;

import java.net.HttpURLConnection;
import java.net.URL;

public class Actions {
    private String BaseUrl;

    public Actions() {
        BaseUrl = "http://localhost:8080";
    }

    public void Attack() {

    }

    public void Heal() {

    }

    public void Defend () {

    }

    public void Forfeit () {

    }

    public void getStatus () {
        try {
            URL Url = new URL(BaseUrl + "/status");
            HttpURLConnection connection = (HttpURLConnection) Url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            System.out.println(connection.getResponseCode());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
