/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicotte.game.service;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import quicotte.game.entity.Game;

/**
 *
 * @author tom
 */
public interface GameServiceCRUD extends CrudRepository<Game, Long>{
    
}
