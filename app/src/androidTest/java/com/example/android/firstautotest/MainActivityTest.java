package com.example.android.firstautotest;


import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by kanishka.a on 17/08/16.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void typeTextAndClick() {

        String typeText1 = "HeyHoe!";

        // Check for the Hello World
        onView(withId(R.id.hello)).check(matches(withText("HelloWorld!")));

        // To type the string in edit text field
        onView(withId(R.id.editText)).perform(typeText(typeText1));

        // To check the typed text
        onView(withId(R.id.editText)).check(matches(withText(typeText1)));

        // to save the text
        onView(withId(R.id.button)).perform(click());

        // scroll to id and click
        onView(withId(R.id.buttonx)).perform(scrollTo(),click());


        }

}
