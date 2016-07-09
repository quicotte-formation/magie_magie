/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicotte.game.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import quicotte.game.entity.Game;

/**
 *
 * @author tom
 */
@Service
public class GameService {
    
    @Autowired
    private GameServiceCRUD gameServiceCRUD;
    
    /**
     * Creates one new game in state NOT_STARTED if no one is existing
     */
    @Scheduled(fixedDelay = 1000)
    public void createNewGameIfNeeded(){
        
        long nbGames = gameServiceCRUD.countByStatus(Game.Status.NOT_STARTED);
        if( nbGames>=2 )
            return;
        
        Game game = new Game();
        game.setCreationDate(new Date());
        game.setStatus(Game.Status.NOT_STARTED);
        
        gameServiceCRUD.save(game);
    }
}
