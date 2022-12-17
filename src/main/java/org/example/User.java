package org.example;


public class User {
    private int number;
    private int hits;
    private int visitors;
    private String txamount;
    private String avgts;
    private String cumts;
    private String maxts;
    private String data;

    public User(int number, int hits, int visitors, String txamount, String avgts, String cumts, String maxts, String data) {
        this.number = number;
        this.hits = hits;
        this.visitors = visitors;
        this.txamount = txamount;
        this.avgts = avgts;
        this.cumts = cumts;
        this.maxts = maxts;
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public int getHits() {
        return hits;
    }

    public int getVisitors() {
        return visitors;
    }

    public String getTxamount() {
        return txamount;
    }

    public String getAvgts() {
        return avgts;
    }

    public String getCumts() {
        return cumts;
    }

    public String getMaxts() {
        return maxts;
    }

    public String getData() {
        return data;
    }
}
