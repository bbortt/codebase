package io.github.butcher.butcher.back.socket.event;

import io.github.butcher.butcher.back.socket.GameEvent;
import java.util.Map;

public class VoteUpdateEvent implements SocketIOEvent {

  private Map<String, Long[]> options;

  public Map<String, Long[]> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Long[]> options) {
    this.options = options;
  }

  @Override
  public String getStringId() {
    return GameEvent.VOTE_UPDATE.getStringId();
  }

  @Override
  public Long getTeamId() {
    // TODO: Is this team relevant?
    return null;
  }

  @Override
  public String toString() {
    return "VoteUpdateEvent{" +
        "options=" + options +
        '}';
  }
}
