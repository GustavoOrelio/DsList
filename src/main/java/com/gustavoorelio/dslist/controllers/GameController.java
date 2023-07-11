package com.gustavoorelio.dslist.controllers;

import com.gustavoorelio.dslist.dto.GameMinDTO;
import com.gustavoorelio.dslist.entities.Game;
import com.gustavoorelio.dslist.repositories.GameRepository;
import com.gustavoorelio.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
