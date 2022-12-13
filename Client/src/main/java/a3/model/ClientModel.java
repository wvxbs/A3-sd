package a3.model;

public class ClientModel {
    private String Name;
    private int UserCode;
    private boolean Winner;

    public ClientModel(String name) {
        Name = name;
        UserCode = 0;
        Winner = false;
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
