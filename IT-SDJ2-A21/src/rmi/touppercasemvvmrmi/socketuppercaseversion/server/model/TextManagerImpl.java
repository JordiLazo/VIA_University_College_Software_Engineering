package rmi.touppercasemvvmrmi.socketuppercaseversion.server.model;

import rmi.touppercasemvvmrmi.socketuppercaseversion.shared.transferobjects.LogEntry;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class TextManagerImpl implements TextManager {

    private PropertyChangeSupport support;
    private List<LogEntry> logEntries;

    public TextManagerImpl() {
        this.support = new PropertyChangeSupport(this);
        this.logEntries = new ArrayList<>();
    }

    @Override
    public void addListener(String eventName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(eventName,listener);
    }

    @Override
    public void removeListener(String eventName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(eventName,listener);
    }

    @Override
    public String toUppercase(String str) {
        String result = str.toUpperCase();
        LogEntry logEntry = new LogEntry(str,result);
        logEntries.add(logEntry);
        support.firePropertyChange("NewLogEntry",null,logEntry);
        return result;
    }

    @Override
    public List<LogEntry> getlog() {
        return new ArrayList<>(logEntries);
    }
}
