package com.example.dashboard1;

public class LogRecord {
    final String ipAddress;
    final String clientId;
    final String userId;
    final TimeStamp creationTime;
    final String method;
    final String protocol;
    final String statusCode;
    final double size;
    final String domainName;
    final UserAgent userAgent;


    public String getIpAddress() {
        return ipAddress;
    }

    public String getClientID() {
        return clientId;
    }

    public String getUserID() {
        return userId;
    }

    public TimeStamp getRequestDate() {
        return creationTime;
    }

    public String getMethodType() {
        return method;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public double getSize() {
        return size;
    }

    public String getDomainName() {
        return domainName;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public LogRecord(String ipAddress, String clientId, String userId, TimeStamp creationTime, String method, String protocol, String statusCode, double size, String domainName, UserAgent userAgent) {
        this.ipAddress = ipAddress;
        this.clientId = clientId;
        this.userId = userId;
        this.creationTime = creationTime;
        this.method = method;
        this.protocol = protocol;
        this.statusCode = statusCode;
        this.size = size;
        this.domainName = domainName;
        this.userAgent = userAgent;
    }
}
