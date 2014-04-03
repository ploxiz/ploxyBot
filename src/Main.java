import org.jibble.pircbot.IrcException;
import utils.Bot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, IrcException {

        Bot bot = new Bot();
        bot.setVerbose(true);
        bot.connect("irc.twitch.tv", 6667, "oauth:pvk9oaefb3hezh0fpyqy0f8tglfd4xz");
        if (bot.isConnected()) {
            System.out.println("________________________________________Successfully Connected" +
                    "________________________________________");
        }
        bot.joinChannel("#ploxiz");
    }
}
