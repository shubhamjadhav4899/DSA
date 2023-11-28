package question.one;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class FileTest {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("r.txt"));BufferedWriter bw=new BufferedWriter(new FileWriter("result1.txt"))){
			int charecter=0;
			int vovel=0;
			int word=0;
			int line=0;
			String str;
			String longWord="";
			String shortWord="";
			int countLong=0;
			int countShort=0;
			while((str=br.readLine())!=null) {
				line++;
				String[] words=str.split("\\s+");
				for(String s:words) {
					
					if(s.length()>countLong) {
						longWord=s;
						countLong=s.length();
					}
					
					if(s.length()<countShort) {
						shortWord=s;
						countShort=s.length();
					}
					charecter+=s.length();
					if(s.length()>0) {
						word++;
						for(char c:s.toCharArray()) {
							if("aeiouAEIOU".indexOf(c)!=-1) {
								vovel++;
							}
						}
					}
				}
			}
			bw.write("Total Charecter is :"+charecter+"\n");
			bw.write("Total Line is :"+line+"\n");
			bw.write("Total Word is :"+word+"\n");
			bw.write("Total Word is :"+vovel+"\n");
			bw.write("LongWord is :"+longWord+"\n");
			bw.write("ShortWord is :"+shortWord+"\n");
			bw.write("Name: Shubham Sudhakar Jadhav\n");
			bw.write("ROll No:");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
