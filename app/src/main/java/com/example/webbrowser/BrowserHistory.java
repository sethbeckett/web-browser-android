package com.example.webbrowser;

import java.util.ArrayList;

public class BrowserHistory {
    private int current = -1;
    ArrayList<String> history;
    BrowserHistory() {
        history = new ArrayList<>();
    }

    public void addPage(String address) {
        current += 1;
        history.add(address);
        }

    public boolean hasPrev() {
        return current > 0;
    }

    public boolean hasNext() {
        return current < (history.size() - 1);
    }

    public String getPrev() {
        current -= 1;
        return history.get(current);
    }

    public String getNext() {
        current += 1;
        return history.get(current);
    }
//    WebPage current;
//    BrowserHistory() {}
//
//    public void addPage(String address) {
//        WebPage newPage = new WebPage(address);
//
//        if (current != null) {
//            current.prev = current;
//        }
//        current = newPage;
//    }
//
//    public boolean hasPrev() {
//        return current.prev != null;
//    }
//
//    public boolean hasNext() {
//        return current.next != null;
//    }
//
//    public String getPrev() {
//        current = current.prev;
//        return current.page;
//    }
//
//    public String getNext() {
//        current = current.next;
//        return current.page;
//    }
//
//    //similar to node class, but specific for web pages
//    private static class WebPage {
//        WebPage(String page) {
//            this.page = page;
//        }
//        WebPage next;
//        WebPage prev;
//        String page;
//    }
}

