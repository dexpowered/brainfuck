package ru.brainfuck.domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @author: smile10
 * @about: Здесь мы должны получать IP адрес зарегистрированного домена ( но это не точно), и если не валид то слать всех нахуй.
 */
public class DomainController {

    public static final DomainController _instance = new DomainController();

    public static DomainController getInstance() {
        return _instance;
    }

    public static String registered = "google.ru";

    public  void checkRegisteredDomain() throws UnknownHostException {
        InetAddress address = java.net.InetAddress.getByName(registered);
        String domainIP = address.getHostAddress();
        System.out.println("Registered IP address for this domain: " + domainIP);
        if(domainIP.equals(getIpAddress())) {
            System.out.println("Your IP:" + getIpAddress() + " is valide, tomcat228 has loaded");
        }
        else  {
            System.out.println("Your IP address: " + getIpAddress() +" INVALID, HAHAHAHHAHAHAHAHAHA");
            System.out.println("SASI CHLEN PASKUDA");
        }
    }

    private final String[] _urls = { "checkip.amazonaws.com", "icanhazip.com", "myip.dnsomatic.com" };

    public  String getIpAddress() {
        String ip = null;
        for (String link : _urls) {
            try {
                URL url = new URL("http://" + link);
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                return reader.readLine();
            }
            catch (Exception e) {
                ip = "UNKNOWN";
            }
        }
        return ip;
    }
}
