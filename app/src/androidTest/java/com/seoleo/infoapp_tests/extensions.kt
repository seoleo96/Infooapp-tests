package com.seoleo.infoapp_tests

import androidx.annotation.StringRes
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers

fun toolbarWithTitle(@StringRes title: Int): ViewInteraction {
    return Espresso.onView(
        Matchers.allOf(
            ViewMatchers.withText(title),
            ViewMatchers.withParent(ViewMatchers.isAssignableFrom(Toolbar::class.java))
        )
    )
}