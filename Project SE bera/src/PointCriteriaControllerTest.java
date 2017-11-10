import static org.junit.Assert.*;

import org.junit.Test;

public class PointCriteriaControllerTest {
	@Test
	public void testScorePercentInput() {
		
		PointCriteriaController.setCriteria(20, 10, 40, 30);
		assertTrue("result of score could not more than or less than 100",PointCriteriaController.isCorrect());
	}
	@Test
	public void ScoreInput(){
			PointCriteriaController.setCriteria(20, 20, 20, 20);
			assertTrue("result of score could not more than or less than 100", (PointCriteriaController.getQuiz() >= 0 && PointCriteriaController.getQuiz() <= 100) && (PointCriteriaController.gethomeWork() >= 0 && PointCriteriaController.gethomeWork() <= 100)&&(PointCriteriaController.getMidTest() >= 0 && PointCriteriaController.getMidTest() <= 100)&&(PointCriteriaController.getFinalTest() >= 0 && PointCriteriaController.getFinalTest() <= 100));
	}
	

}
