package a3.Server.model;

public class ClientModel {
    private String Name;
    private int UserCode;
    private boolean Winner;

    public ClientModel(String name, int userCode, boolean winner) {
        Name = name;
        UserCode = userCode;
        Winner = winner;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getUserCode() {
        return UserCode;
    }

    public void setUserCode(int userCode) {
        UserCode = userCode;
    }

    public boolean isWinner() {
        return Winner;
    }

    public void setWinner(boolean winner) {
        Winner = winner;
    }
}
