package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

/**
 * Created by Алексей on 31.01.2019.
 */
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    TravelAndShopingSteps travelAndShopingSteps = new TravelAndShopingSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMainMenu(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^выбран раздел \"(.*)\"$")
    public void stepSelectSubMenu(String menuItem) {
        mainSteps.stepSelectSubMenu(menuItem);
    }

    @When("^выполнена проверка наличия заголовка \"([^\"]*)\" на странице$")
    public void stepFindTitle(String titleItem) {
        travelAndShopingSteps.stepFindTitle(titleItem);
    }

    @When("^выполнено нажатие на кнопку - Оформить онлайн$")
    public void stepClickRegistrationButton() {
        travelAndShopingSteps.stepClickRegistrationButton();
    }

    @When("^выбран полис на сумму страховой защиты – Минимальная$")
    public void stepClickMinInsurance() {
        travelInsuranceSteps.stepClickMinInsurance();
    }

    @When("^выполнено нажатие кнопки - Оформить$")
    public void stepClickIssueButton() {
        travelInsuranceSteps.stepClickIssueButton();
    }

    @When("заполняются поля:")
    public void stepFillFields(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> travelInsuranceSteps.stepFillField(key, value));
    }

    @When("проверяются поля:")
    public void stepAssertFields(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> travelInsuranceSteps.stepAssertField(key, value));
    }

    @When("^выполнено нажатие кнопки - Продолжить$")
    public void stepClickContinueButton() {
        travelInsuranceSteps.stepClickContinueButton();
    }

    @When("^выполнена проверка появления сообщения об ошибке \"(.*)\"$")
    public void stepAssertErrorText(String errorText) {
        errorText = "Заполнены не все обязательные поля";
        travelInsuranceSteps.stepAssertErrorText(errorText);
    }


}
