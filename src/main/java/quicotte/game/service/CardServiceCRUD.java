/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicotte.game.service;

import org.springframework.data.repository.CrudRepository;
import quicotte.game.entity.Card;

/**
 *
 * @author tom
 */
public interface CardServiceCRUD extends CrudRepository<Card, Long> {
    
}
