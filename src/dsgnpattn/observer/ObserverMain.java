package dsgnpattn.observer;

import dsgnpattn.observer.example.MinMaxView;
import dsgnpattn.observer.example.ScoreRecord;
import dsgnpattn.observer.example.dataSheetView;

public class ObserverMain {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		scoreRecord.attachObserver(new dataSheetView(scoreRecord, 5));
		scoreRecord.attachObserver(new MinMaxView(scoreRecord));
	
		scoreRecord.addScore(100);
		scoreRecord.addScore(97);
		scoreRecord.addScore(99);
		scoreRecord.addScore(63);
	}

}
