package dsgnpattn.observer.example;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {

	private List<Integer> scoreList = new ArrayList<Integer>();
	
	public void addScore(int score) {
		System.out.println(String.format("========= add %d =======", score));
		this.scoreList.add(score);
		// 데이터가 변경되면 각 옵서버에 변경 사항을 통보한다.
		notifyObserver();
	}
	
	public List<Integer> getScoreList() {
		return this.scoreList;
	}
	
	
}
