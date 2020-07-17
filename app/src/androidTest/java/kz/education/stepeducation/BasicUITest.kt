package kz.education.stepeducation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import kz.education.stepeducation.presentation.activity.StudentsActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BasicUITest {

    @Rule
    @JvmField var activityRule: ActivityTestRule<StudentsActivity> = ActivityTestRule(StudentsActivity::class.java)

    @Before
    fun initiateBeforeTest(){
        BaseUiConfiguration()
    }

    @After
    fun initiateAfterTest(){

    }

    @Test
    fun initiateUITest(){
        onView(ViewMatchers.isRoot()).perform(WaitAction(1000))
        onView(withId(R.id.button_fragment_students_action)).perform(ViewActions.click())

        onView(ViewMatchers.isRoot()).perform(WaitAction(1000))
        onView(withId(R.id.button_fragment_students_action)).perform(ViewActions.click())

        onView(ViewMatchers.isRoot()).perform(WaitAction(1000))
        onView(withId(R.id.button_fragment_students_action)).perform(ViewActions.click())

        onView(ViewMatchers.isRoot()).perform(WaitAction(1000))
        onView(withId(R.id.button_fragment_students_action)).perform(ViewActions.click())

        onView(ViewMatchers.isRoot()).perform(WaitAction(1000))
        onView(withId(R.id.button_fragment_students_action)).perform(ViewActions.click())
    }
}