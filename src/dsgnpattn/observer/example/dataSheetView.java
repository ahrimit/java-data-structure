package dsgnpattn.observer.example;

import java.util.List;

public class dataSheetView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public dataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update() {
		List<Integer> records = scoreRecord.getScoreList();
		printScores(records);
	}
	
	private void printScores(List<Integer> scores) {
		for(int i = 0 ; i < viewCount && i < scores.size(); i++) {
			System.out.print(scores.get(i) + " ");
		}
		
		System.out.println("");
	}
}
