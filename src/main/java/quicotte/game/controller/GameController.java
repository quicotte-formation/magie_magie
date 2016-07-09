/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicotte.game.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import quicotte.game.entity.Game;
import static quicotte.game.entity.Game_.status;
import quicotte.game.service.GameServiceCRUD;

/**
 *
 * @author tom
 */
@Controller
@RequestMapping("/game")
public class GameController {
    
    @Autowired
    private GameServiceCRUD serviceCRUD;
    
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(){
        
        return "game/list";
    }
    
    @RequestMapping(value="ajax_list", method = RequestMethod.GET)
    @ResponseBody
    public List<Game> ajaxList(){
        
        return serviceCRUD.findAllByStatusOrderByCreationDateDesc(Game.Status.NOT_STARTED);
    }
}
