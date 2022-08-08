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
	
	
}
