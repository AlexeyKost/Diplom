package ru.iteco.fmhandroid.ui.screenElement;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.data.Helper;

public class GeneralElements {
    public static ViewInteraction butterflyNewsListImage = onView(withId(R.id.empty_news_list_image_view));
    public static ViewInteraction GeneralCancelButton = onView(withId(R.id.cancel_button));
    public static ViewInteraction GeneralSaveButton = onView(withId(R.id.save_button));
    public static ViewInteraction oKButton = onView(withText("OK"));
    public static ViewInteraction refreshText = onView(withText("Refresh"));
    public static ViewInteraction nothingText = onView(withText("There is nothing here yet…"));

    public static ViewInteraction invalidData(String text) {
        return onView(allOf(withId(android.R.id.message), withText(text)));
    }

    public static ViewInteraction emptyToastMatcher(int id) {
        return onView(withText(id)).inRoot(new Helper.ToastMatcher());
    }

    public static ViewInteraction errorToastMatcher(int id) {
        return onView(withText(id)).inRoot(new Helper.ToastMatcher());
    }

    public static int getEmptyInfoMatcher() {
        return R.string.empty_login_or_password;
    }

    public static int getEmptyFields() {
        return R.string.empty_fields;
    }

    public static int getSomethingError() {
        return R.string.error;
    }
}