package com.seoleo.infoapp_tests

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class SecondActivityTest {

    @JvmField
    @Rule
    val rule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun text_view_is_displayed(){
        textViewInsideLinearLayoutInteraction(R.id.text_view).check(
            ViewAssertions.matches(ViewMatchers.isDisplayed())
        )
    }

    @Test
    fun back_button_is_displayed(){
        goToActivityButtonInteraction(R.id.to_back).check(
            ViewAssertions.matches(ViewMatchers.isDisplayed())
        )
    }
}