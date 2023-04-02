package ffCoPilot.model;

import java.util.List;

public class Draft {

  List<Player> players;
  List<Team> teams;

  public Draft(List<Player> players, List<Team> teams){
      this.players = players;
      this.teams = teams;
  }

}
