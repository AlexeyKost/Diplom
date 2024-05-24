package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.core.IsNot.not;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.GeneralCancelButton;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.GeneralSaveButton;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.butterflyNewsListImage;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.emptyToastMatcher;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.errorToastMatcher;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.invalidData;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.nothingText;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.oKButton;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.refreshText;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.screenElement.GeneralElements;

public class GeneralStep {

    public void clickSaveButton() {
        Allure.step("Нажать - SAVE");
        GeneralSaveButton.perform(click());
    }

    public void clickCancelButton() {
        Allure.step("Нажать - CANCEL");
        GeneralCancelButton.perform(click());
    }

    public void clickOkButton() {
        Allure.step("Нажать - ОК");
        oKButton.perform(click());
    }

    public void checkEmptyToast(int id, boolean visible) {
        if (visible) {
            emptyToastMatcher(id).check(matches(isDisplayed()));
        } else {
            emptyToastMatcher(id).check(matches(not(isDisplayed())));
        }
    }

    public void checkInvalidAuthDataToast() {
        Allure.step("Проверка предупреджения");
        checkEmptyToast(GeneralElements.getSomethingError(), true);
    }

    public void checkEmptyAuthDataToast() {
        Allure.step("Проверка предупреджения");
        checkEmptyToast(GeneralElements.getEmptyInfoMatcher(), true);
    }

    public void checkErrorToast(int id, boolean visible) {
        if (visible) {
            errorToastMatcher(id).check(matches(isDisplayed()));
        } else {
            errorToastMatcher(id).check(matches(not(isDisplayed())));
        }
    }

    public void checkEmptyFieldError() {
        Allure.step("Текст ошибки - empty fields");
        checkErrorToast(GeneralElements.getEmptyFields(), true);
    }

    public void checkInvalidData(String text, boolean visible) {
        if (visible) {
            invalidData(text).check(matches(isDisplayed()));
        } else {
            invalidData(text).check(matches(not(isDisplayed())));
        }
    }

    public void checkNewsButterfly() {
        Allure.step("Картинка с бабочкой - News");
        butterflyNewsListImage.check(matches(isDisplayed()));
    }

    public void checkNothingToShow() {
        Allure.step("Элементы экрана - Nothing to show");
        nothingText.check(matches(isDisplayed()));
        refreshText.check(matches(isDisplayed()));
    }
}