package ru.brainfuck;

import ru.brainfuck.domain.DomainController;
import ru.brainfuck.key.KeyGenerator;

import java.net.UnknownHostException;

public class Controller {

    public static void main(String args[]) throws UnknownHostException {
        //KeyGenerator.genKey();
        DomainController.getInstance().checkRegisteredDomain();


    }
}
