import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public static void main(String arg[]){
		try {
			FormatSRT fm = new FormatSRT();
			FileInputStream file = new FileInputStream("D:/a.srt");
			TimedTextObject tto = fm.parseFile("abc", file);
			int count = 0;
			//System.out.println(tto.captions.size());
			while (true) {
				Thread.sleep(1);
				count++;
				try {						
					System.out.println(tto.captions.get(count).content);
				} catch (Exception e) {
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
