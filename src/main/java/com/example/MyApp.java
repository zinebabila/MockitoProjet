package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApp {
    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {
        logger.info("Début de l'application.");
        logger.debug("Ceci est un message de debug.");
        logger.warn("Ceci est un avertissement.");
        logger.error("Ceci est une erreur.");
        logger.fatal("Ceci est une erreur fatale.");
        logger.info("Fin de l'application.");
    }
}
