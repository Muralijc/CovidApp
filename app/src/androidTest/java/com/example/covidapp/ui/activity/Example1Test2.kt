package com.example.covidapp.ui.activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import androidx.test.runner.screenshot.Screenshot
import com.example.covidapp.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class Example1Test2 {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(SplashScreen::class.java)

    @Test
    fun example1Test1() {
//        onView(withId(R.id.action_bar_container)).check(matches(isDisplayed()))
        Screenshot.capture().process()
        onView(withText("CovidApp")).check(matches(isDisplayed()))
        onView(withText("COVID-19")).check(matches(isDisplayed()))
        onView(withId(R.id.btnGo)).perform(click())
//        example1Test2()
//        example1Test3()
    }

    fun example1Test2() {
        onView(withText("Global")).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerView)).perform(swipeUp())
        onView(withId(R.id.recyclerView)).perform(swipeUp())
        onView(withId(R.id.recyclerView)).perform(swipeDown())
        onView(withId(R.id.recyclerView)).perform(swipeDown())
        Screenshot.capture().process()

    }
    fun example1Test3() {
        onView(withId(R.id.recyclerView)).perform(swipeLeft())
        onView(withId(R.id.recyclerView)).perform(swipeRight())
        onView(withId(R.id.recyclerView)).perform(swipeUp())
        onView(withId(R.id.recyclerViewPrecautions)).perform(swipeLeft())
        onView(withId(R.id.recyclerViewPrecautions)).perform(swipeRight())
        Thread.sleep(2000)
        Screenshot.capture().process()
    }
    }

