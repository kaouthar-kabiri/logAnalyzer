package org.example;

public class UserAgent {
    final String operatingSystem;
    final String browser;
    final String operatingSystemVersion;

    public UserAgent(String operatingSystem, String browser, String operatingSystemVersion) {
        this.operatingSystem = operatingSystem;
        this.browser = browser;
        this.operatingSystemVersion = operatingSystemVersion;

    }


    public String getOperatingSystemVersion() { return operatingSystemVersion;}
    public String getOperatingSystem() {return operatingSystem;}
    public String getBrowser() {
        return browser;
    }

}
