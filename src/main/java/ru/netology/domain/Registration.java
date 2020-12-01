package ru.netology.domain;

public class Registration {
    private long id;
    private String imageId;
    private String login;
    private String password;
    private boolean buttonLogin;
    private boolean buttonRegistration;
    private boolean buttonDoNotRememberMe;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isButtonLogin() {
        return buttonLogin;
    }

    public void setButtonLogin(boolean buttonLogin) {
        this.buttonLogin = buttonLogin;
    }

    public boolean isButtonRegistration() {
        return buttonRegistration;
    }

    public void setButtonRegistration(boolean buttonRegistration) {
        this.buttonRegistration = buttonRegistration;
    }

    public boolean isButtonDoNotRememberMe() {
        return buttonDoNotRememberMe;
    }

    public void setButtonDoNotRememberMe(boolean buttonDoNotRememberMe) {
        this.buttonDoNotRememberMe = buttonDoNotRememberMe;
    }
}
