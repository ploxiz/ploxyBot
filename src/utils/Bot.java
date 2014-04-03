package utils;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.PircBot;

import java.io.IOException;

public class Bot extends PircBot {

    public Bot() throws IrcException, IOException {
        this.setName("ploxyBot");
        this.setLogin("ploxyBot");
    }

    public void onConnect(String channel) {
        sendMessage(channel, "I am activated!" );
    }

    public void onMessage(String channel, String sender,
                          String login, String hostname, String message) {
        if (message.equalsIgnoreCase("time")) {
            String time = new java.util.Date().toString();
            sendMessage(channel, "???");
        }
    }
}
