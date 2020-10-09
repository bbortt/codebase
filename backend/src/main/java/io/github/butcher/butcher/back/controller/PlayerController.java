package io.github.butcher.butcher.back.controller;

import io.github.butcher.butcher.back.domain.Player;
import io.github.butcher.butcher.back.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @PostMapping(value = "/players")
  public Player createPlayer() {
    Player player = new Player();
    player.setUsername("test");
    return playerService.createPlayer(player);
  }
}
