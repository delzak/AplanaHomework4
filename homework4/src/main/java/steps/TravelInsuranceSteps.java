package steps;

import pages.TravelInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

/**
 * Created by Алексей on 28.01.2019.
 */
public class TravelInsuranceSteps {

    @Step("Поле {0} заполнено значением {1}")
    public void stepFillField(String field, String value) {
        new TravelInsurancePage().fillField(field, value);
    }

    @Step("Заполняются поля:")
    public void stepFillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepFillField);
    }

    @Step("Проверить корректность поля {0} заполненным значением {1}")
    public void stepAssertField(String field, String value) {
        new TravelInsurancePage().assertFieldText(field, value);
    }

    @Step("Проверяются поля:")
    public void stepAssertFields(HashMap<String, String> fields) {
        fields.forEach(this::stepAssertField);
    }

    @Step("Выбор полиса на сумму страховой защиты – Минимальная")
    public void stepClickMinInsurance() {
        new TravelInsurancePage().minInsurance.click();
    }

    @Step("Нажатие кнопки 'Оформить'")
    public void stepClickIssueButton() {
        new TravelInsurancePage().issueButton.click();
    }


    @Step("Нажатие кнопки 'Продолжить'")
    public void stepClickContinueButton() {
        new TravelInsurancePage().continueButton.click();
    }

    @Step("Проверка появления сообщения об ошибке {0}")
    public void stepAssertErrorText(String errorText) {
        errorText = "Заполнены не все обязательные поля";
        new TravelInsurancePage().assertFieldText("Сообщение об ошибке", errorText);
    }
}
