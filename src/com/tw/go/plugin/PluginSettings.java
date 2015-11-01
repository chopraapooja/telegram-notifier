package com.tw.go.plugin;

public class PluginSettings {
    private String serverBaseURL;
    private String telegramToken;
    private String telegramRoomId;

    public PluginSettings(String serverBaseURL, String telegramToken, String telegramRoomId) {
        this.serverBaseURL = serverBaseURL;
        this.telegramToken = telegramToken;
        this.telegramRoomId = telegramRoomId;
    }

    public String getServerBaseURL() {
        return serverBaseURL;
    }

    public void setServerBaseURL(String serverBaseURL) {
        this.serverBaseURL = serverBaseURL;
    }

    public String getTelegramToken() {
        return telegramToken;
    }

    public void setTelegramToken(String telegramToken) {
        this.telegramToken = telegramToken;
    }

    public String getTelegramRoomId() {
        return telegramRoomId;
    }

    public void setTelegramRoomId(String telegramRoomId) {
        this.telegramRoomId = telegramRoomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PluginSettings that = (PluginSettings) o;

        if (telegramRoomId != null ? !telegramRoomId.equals(that.telegramRoomId) : that.telegramRoomId != null) return false;
        if (telegramToken != null ? !telegramToken.equals(that.telegramToken) : that.telegramToken != null) return false;
        if (serverBaseURL != null ? !serverBaseURL.equals(that.serverBaseURL) : that.serverBaseURL != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serverBaseURL != null ? serverBaseURL.hashCode() : 0;
        result = 31 * result + (telegramToken != null ? telegramToken.hashCode() : 0);
        result = 31 * result + (telegramRoomId != null ? telegramRoomId.hashCode() : 0);
        return result;
    }
}
