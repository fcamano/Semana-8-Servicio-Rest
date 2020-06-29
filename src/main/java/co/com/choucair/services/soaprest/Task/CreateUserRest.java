package co.com.choucair.services.soaprest.Task;

import co.com.choucair.services.soaprest.interactions.ConsumeService;
import co.com.choucair.services.soaprest.models.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateUserRest implements Task {
    private List<ModelCreateUserRest> modelCreateUserRest;

    public CreateUserRest(List<ModelCreateUserRest> modelCreateUserRest) {
        this.modelCreateUserRest = modelCreateUserRest;
    }
    public static Performable with(List<ModelCreateUserRest> modelCreateUserRests) {
        return Tasks.instrumented(CreateUserRest.class, modelCreateUserRests);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateUserRest.get(0).toString()));
    }
}
