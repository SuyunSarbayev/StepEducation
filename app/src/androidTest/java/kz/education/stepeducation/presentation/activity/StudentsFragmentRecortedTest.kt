package kz.education.stepeducation.presentation.activity


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import kz.education.stepeducation.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class StudentsFragmentRecortedTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(StudentsActivity::class.java)

    @Test
    fun studentsFragmentRecortedTest() {
        val appCompatButton = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton.perform(click())

        val appCompatButton2 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton2.perform(click())

        val appCompatButton3 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton3.perform(click())

        val appCompatButton4 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton4.perform(click())

        val appCompatButton5 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton5.perform(click())

        val appCompatButton6 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton6.perform(click())

        val appCompatButton7 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton7.perform(click())

        val appCompatButton8 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton8.perform(click())

        val appCompatButton9 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton9.perform(click())

        val appCompatButton10 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton10.perform(click())

        val appCompatButton11 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton11.perform(click())

        val appCompatButton12 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton12.perform(click())

        val appCompatButton13 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton13.perform(click())

        val appCompatButton14 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton14.perform(click())

        val appCompatButton15 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton15.perform(click())

        val appCompatButton16 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton16.perform(click())

        val appCompatButton17 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton17.perform(click())

        val appCompatButton18 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton18.perform(click())

        val appCompatButton19 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton19.perform(click())

        val appCompatButton20 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton20.perform(click())

        val appCompatButton21 = onView(
            allOf(
                withId(R.id.button_fragment_students_action),
                withText("HELLO WORLD  WORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLDWORLD"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.relativelayout_activity_students_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatButton21.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
