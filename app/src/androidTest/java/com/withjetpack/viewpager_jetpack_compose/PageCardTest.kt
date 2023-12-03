package com.withjetpack.viewpager_jetpack_compose

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class PageCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun pageCardContent_isDisplayed() {
        val content = "Test Content"

        composeTestRule.setContent {
            PageCard(content = content)
        }

        composeTestRule.onNodeWithText(content).assertIsDisplayed()
    }
}
