package com.seoleo.infoapp_tests

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest {

    @JvmField
    @Rule
    val mainActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun text_view_is_displayed() {
        textViewInsideLinearLayoutInteraction(R.id.text_view).check(
            ViewAssertions.matches(ViewMatchers.isDisplayed())
        )
    }

    @Test
    fun button_is_displayed() {
        goToActivityButtonInteraction(R.id.to_second_activty).check(
            ViewAssertions.matches(ViewMatchers.isDisplayed())
        )
    }
}