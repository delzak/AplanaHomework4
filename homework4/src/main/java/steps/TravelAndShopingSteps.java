package steps;

import pages.TravelAndShopingPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Алексей on 28.01.2019.
 */
public class TravelAndShopingSteps {

    @Step("Выполнена проверка наличия заголовка на странице {0}")
    public void stepFindTitle(String titleItem) {
        new TravelAndShopingPage().findTitle("Страхование путешественников");
    }

    @Step("Выполнено нажатие на кнопку 'Оформить онлайн'")
    public void stepClickRegistrationButton() {
        new TravelAndShopingPage().registrationButton.click();

        for (String winHandle : BaseSteps.getDriver().getWindowHandles()) {
            BaseSteps.getDriver().switchTo().window(winHandle);
        }
    }
}
