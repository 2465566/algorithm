package pattern.behavior.mediator;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Media {
  List<Colleague> colleagueList = Lists.newArrayList();
  public abstract void register(Colleague colleague);
  public abstract void forward(Colleague colleague, String message);

}
