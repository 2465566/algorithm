package pattern.behavior.mediator;

import org.springframework.util.CollectionUtils;

public class ConcreteMedia extends Media {

  @Override
  public void register(Colleague colleague)  {
    if (CollectionUtils.isEmpty(colleagueList) || !colleagueList.contains(colleague)) {
      colleagueList.add(colleague);
      System.out.println("media add new colleague: " + colleague.hashCode());
    }
  }

  @Override
  public void forward(Colleague colleague, String message) {
    colleagueList
        .forEach(input -> {
          if (null != input && !colleague.equals(input)) {
            input.receive(message);
          }
        });
  }
}
