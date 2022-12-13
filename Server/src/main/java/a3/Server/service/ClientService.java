package a3.Server.service;

import a3.Server.model.ClientModel;

import java.util.ArrayList;

public class ClientService {
    private ArrayList<ClientModel> ActiveUsers;

    public ClientService() {
        ActiveUsers = new ArrayList<ClientModel>();
    }

    public void AddClient(ClientModel client) {
        if(getNumberOfActiveUsers() < 2) {
            if (ValidateClient(client))
                ActiveUsers.add(client);
        }
    }

    public int getNumberOfActiveUsers() {
        return ActiveUsers.size();
    }

    private boolean ValidateClient (ClientModel client) {
        if (client.getName() == "")
            return false;

        if (client.getUserCode() > 2)
            return false;

        if (client.isWinner() == true)
            return false;

        return true;
  }
}
