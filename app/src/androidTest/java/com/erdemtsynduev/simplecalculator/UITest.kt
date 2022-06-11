package com.erdemtsynduev.simplecalculator


import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class UITest {
    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testFormulaIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.formula))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testResultIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonClearIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_clear))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonClearIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_clear))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonPlusMinusIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_plus_minus))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonPlusMinusIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_plus_minus))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonPercentIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_percent))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonPercentIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_percent))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonDivisionIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_division))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonDivisionIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_division))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonSevenIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_seven))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonSevenIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_seven))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonEightIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_eight))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonEightIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_eight))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonNineIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_nine))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonNineIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_nine))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonMultiplyIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_multiply))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonMultiplyIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_multiply))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonFourIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_four))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonFourIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_four))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonFiveIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_five))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonFiveIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_five))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonSixIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_six))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonSixIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_six))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonMinusIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_minus))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonMinusIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_minus))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonOneIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_one))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonOneIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_one))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonTwoIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_two))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonTwoIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_two))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonThreeIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_three))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonThreeIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_three))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonPlusIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_plus))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonPlusIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_plus))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonZeroIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_zero))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonZeroIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_zero))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonCommaIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_comma))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonCommaIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_comma))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonEquallyIsVisible() {
        Espresso.onView(ViewMatchers.withId(R.id.button_equally))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonEquallyIsClickable() {
        Espresso.onView(ViewMatchers.withId(R.id.button_equally))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }

    @Test
    fun testButtonsOneTwoThreeIsWorked() {
        Espresso.onView(ViewMatchers.withId(R.id.button_one)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_two)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_three)).perform(click())
        Espresso.onView(ViewMatchers.withText("123"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonsFourFiveSixIsWorked() {
        Espresso.onView(ViewMatchers.withId(R.id.button_four)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_five)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_six)).perform(click())
        Espresso.onView(ViewMatchers.withText("456"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testButtonsSevenEightNineZeroIsWorked() {
        Espresso.onView(ViewMatchers.withId(R.id.button_seven)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_eight)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_nine)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_zero)).perform(click())
        Espresso.onView(ViewMatchers.withText("7,890"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testNinePlusNine() {
        Espresso.onView(ViewMatchers.withId(R.id.button_nine)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_plus)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_nine)).perform(click())
        Espresso.onView(ViewMatchers.withId(R.id.button_equally)).perform(click())
        Espresso.onView(ViewMatchers.withText("18"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}