package com.seoleo.infoapp_tests

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.Matchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun screen_should_apply_correct_title(){
        toolbarWithTitle(R.string.title).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun contains_recycler_view(){
        Espresso.onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.recycler_view),
                ViewMatchers.withParent(
                    ViewMatchers.isAssignableFrom(ConstraintLayout::class.java)
                )
            )
        ).check(
            ViewAssertions.matches(
                ViewMatchers.isDisplayed()
            )
        )
    }
}