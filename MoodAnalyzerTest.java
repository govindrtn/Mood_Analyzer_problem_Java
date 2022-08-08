package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_Should_Return_Sad() {
		MoodAnalyzer myMood = new MoodAnalyzer("i am in Sad Mood ");
		String mood = myMood.analyseMood();
		Assert.assertEquals("SAD", mood);

	}
	
	@Test
	public void givenMessage_When_in_Any_mood_Should_Return_Happy() {
		MoodAnalyzer myMood = new MoodAnalyzer("i am in any Mood ");
		String mood = myMood.analyseMood();
		Assert.assertEquals("HAPPY", mood);

	}
}
