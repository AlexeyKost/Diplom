
package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.ui.screenElement.LoveElement.getDescriptionText;
import static ru.iteco.fmhandroid.ui.screenElement.LoveElement.missionConstraintLayout;
import static ru.iteco.fmhandroid.ui.screenElement.LoveElement.missionList;
import static ru.iteco.fmhandroid.ui.screenElement.LoveElement.missionName;

import io.qameta.allure.kotlin.Allure;

public class LoveStep {
    public void checkMissionElements() {
        Allure.step("Элементы экрана - Love is all");
        missionName.check(matches(isDisplayed()));
        missionList.check(matches(isDisplayed()));
    }

    public void checkQuote(int number) {
        Allure.step("Развернуть/свернуть цитату");
        missionConstraintLayout.check(matches(isDisplayed()));
        missionConstraintLayout.perform(actionOnItemAtPosition(number, click()));
    }

    public void descriptionNotDisplay(String text) {
        Allure.step("Отображение цитаты");
        onView(allOf(getDescriptionText(),
                withText(text))).check(matches(not(isDisplayed())));
    }

    public void descriptionIsDisplay(String text) {
        Allure.step("Cкрытие цитаты");
        onView(allOf(getDescriptionText(),
                withText(text))).check(matches(isDisplayed()));
    }
}
