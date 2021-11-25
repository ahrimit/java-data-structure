package dsgnpattn.observer.example;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer{
	private ScoreRecord scoreRecord;
	
	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}
	
	public void update() {
		List<Integer> records = scoreRecord.getScoreList();
		printScores(records);
	}
	
	private void printScores(List<Integer> scores) {
		int min = Collections.min(scores);
		int max = Collections.max(scores);
		System.out.println(String.format("min : %d, max : %d", min, max));
	}
}
