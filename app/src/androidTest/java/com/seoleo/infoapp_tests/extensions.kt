package com.seoleo.infoapp_tests

import android.widget.LinearLayout
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers

fun textViewInsideLinearLayoutInteraction(textView: Int): ViewInteraction {
    return Espresso.onView(
        Matchers.allOf(
            ViewMatchers.withId(textView),
            ViewMatchers.withParent(ViewMatchers.isAssignableFrom(LinearLayout::class.java))
        )
    )
}

fun goToActivityButtonInteraction(button: Int): ViewInteraction {
    return Espresso.onView(
        Matchers.allOf(
            ViewMatchers.withId(button),
            ViewMatchers.withParent(ViewMatchers.isAssignableFrom(LinearLayout::class.java))
        )
    )
}