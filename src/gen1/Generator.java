package gen1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Generator {
	
	private String text;
	
	public Generator(int howMany) {
		this.text = null;
		this.generate(howMany);
		try {
			PrintWriter writer = new PrintWriter("Goods.txt", "UTF-8");
			writer.println(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Created file Goods.txt and wrote " + howMany + " records");
		}
	}
	
	public Generator(int howMany, String filePath) {
		this.text = null;
		this.generate(howMany);
		try {
			try( PrintWriter out = new PrintWriter(filePath) ) {
				out.println(text);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Wrote " + howMany + " records to file " + filePath);
		}
	}
	
	private void generate(int howMany) {
		Random r = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < howMany ; i++) {
			sb.append(i);
			sb.append(" ");
			sb.append((r.nextInt(9)+1)*100);
			sb.append("\n");
		}
		text = sb.toString();
	}
}