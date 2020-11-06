package io.quarkus.workshop.super_heroes.hero;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
class HeroApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {

        LOGGER.info("  ▄▄       ▄▄  ▄         ▄       ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄" );
        LOGGER.info(" ▐░░▌     ▐░░▌▐░▌       ▐░▌     ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
        LOGGER.info(" ▐░░▌     ▐░░▌▐░▌       ▐░▌     ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
        LOGGER.info(" ▐░▌░▌   ▐░▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ");
        LOGGER.info(" ▐░▌▐░▌ ▐░▌▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌");     
        LOGGER.info(" ▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌");     
        LOGGER.info(" ▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌" );    
        LOGGER.info(" ▐░▌   ▀   ▐░▌ ▀▀▀▀█░█▀▀▀▀      ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌     ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀      ▐░▌" );   
        LOGGER.info(" ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌     ▐░▌       ▐░▌▐░▌               ▐░▌" );    
        LOGGER.info(" ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌       ▐░▌▐░▌           ▄▄▄▄█░█▄▄▄▄" );
        LOGGER.info(" ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌     ▐░▌       ▐░▌▐░▌          ▐░░░░░░░░░░░▌");
        LOGGER.info("  ▀         ▀       ▀            ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀         ▀  ▀            ▀▀▀▀▀▀▀▀▀▀▀ ");
        LOGGER.info("                                                                                                              Powered by Quarkus");
        LOGGER.info(ProfileManager.getActiveProfile());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application HERO is stopping...");
    }
}