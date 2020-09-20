package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    private List<String> defaultRecipients;

    public Map<String, Boolean> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, Boolean> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    private Map<String,Boolean> additionalHeaders;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    private Credentials credentials;

    public static class Credentials{
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        private String password;

        public String getAuthMethod() {
            return authMethod;
        }

        public void setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
        }

        private String authMethod;

    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ",defaultRecipients[0]=" + defaultRecipients.get(0) +
                ",defaultRecipients[1]=" + defaultRecipients.get(1) +
                ",additionalHeaders.redelivery=" + additionalHeaders.get("redelivery") +
                ",additionalHeaders.secure=" + additionalHeaders.get("secure") +
                ",credentials.username=" + credentials.getUsername() +
                ",credentials.password=" + credentials.getPassword() +
                ",credentials.authMethod=" + credentials.getAuthMethod() +
                '}';
    }
}
