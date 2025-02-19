package com.flagg.msu.criminalintent

import androidx.fragment.app.testing.FragmentScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CrimeDetailFragmentTest {

    private lateinit var scenario: FragmentScenario<CrimeDetailFragment>

    @Before
    fun setUp() {
        scenario = launch(CrimeDetailFragment::class.java)
    }

    private fun launch(java: Class<CrimeDetailFragment>): FragmentScenario<CrimeDetailFragment> {
        TODO("Not yet implemented")
    }

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test // Chat GPT
    fun testFragmentScenarioOnFragment() {
        val newTitle = "New Crime Title"
        onView(withId(R.id.crime_title)).perform(typeText(newTitle))

        onView(withId(R.id.crime_solved)).perform(click())

        onView(withId(R.id.crime_title)).check(matches(withText(newTitle)))
        onView(withId(R.id.crime_solved)).check(matches(isChecked()))
    }
}
