package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_Should_Return_Sad() {
		MoodAnalyzer myMood = new MoodAnalyzer("i am in Sad Mood ");
		String mood;
		try {
			mood = myMood.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void givenMessage_When_in_Any_mood_Should_Return_Happy() {
		MoodAnalyzer myMood = new MoodAnalyzer("i am in any Mood ");
		String mood;
		try {
			mood = myMood.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void givenMessage_is_Null_Should_Return_Happy() {
		MoodAnalyzer myMood = new MoodAnalyzer(null);
		String mood;
		try {
			mood = myMood.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void givenMood_Is_Null_Should_Throw_Exception() {

		MoodAnalyzer myMood = new MoodAnalyzer(null);
		String mood;
		try {
			mood = myMood.analyseMood(null);
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_EMPTY_Exception, e.type);
		}

	}

}
