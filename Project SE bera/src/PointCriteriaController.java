
public class PointCriteriaController {
	private final int TOTAL_POINT = 100;
	private static int quiz = 25;
	private static int homeWork = 25;
	private static int midTest = 25;
	private static int finalTest = 25;

	public static void setCriteria(int quizz, int homeworkk, int midTestt, int finalTestt) {
			quiz = quizz;
			homeWork = homeworkk;
			midTest = midTestt;
			finalTest = finalTestt;
	}

	public static int getQuiz() {
		return quiz;
	}

	public static int gethomeWork() {
		return homeWork;
	}

	public static int getMidTest() {
		return midTest;
	}

	public static int getFinalTest() {
		return finalTest;
	}
	public static boolean isCorrect(){
		boolean bool = false;
		if(getQuiz() + gethomeWork() + getMidTest() + getFinalTest() == 100){
			bool = true;
			
		}else bool = false;
		
		return bool;
	}

}
