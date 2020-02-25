package pattern.behavior.mediator;

public class ConcreteMedia extends Media {

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            System.out.println("media add new colleague, colleague hashcode: " + colleague.hashCode());
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
