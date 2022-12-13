package a3.Server.controller;

import a3.Server.model.ClientModel;
import a3.Server.service.ClientService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    ClientService clientService = new ClientService();

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public int getNumberOfActiveUsers() {
        return clientService.getNumberOfActiveUsers();
    }

    @RequestMapping(value = "/client/add", method = RequestMethod.POST)
    public void addActiveUser(@RequestBody ClientModel client) {
        clientService.AddClient(client);
    }
}
