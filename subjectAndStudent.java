package courseUd;

class subject{
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObt;
	
	public String getSubID() {return subID;}
	public String getName() {return name;}
	public int getMaxMarks() {return maxMarks;}
	public int getMarksObtained() {return marksObt;}
	
	public void setMaxMarks(int m) {this.maxMarks = m;}
	public void setMarksObt(int m) {this.marksObt = m;}
	public boolean isQualified(int m) {return m>=maxMarks/10*4;}
	public String toString() {
		return "\nSubjectID :"+subID+"\nName : "+name+"\nMaxMarks : "+maxMarks+"\nMarks Obtained : "+marksObt;
	}
	
	subject(String sId, String name){
		subID=sId;
		this.name = name;
	}
	subject(String sId, String name, int maxMarks, int marksObt){
		subID=sId;
		this.name = name;
		this.marksObt = marksObt;
		this.maxMarks = maxMarks;
	}
	
}

public class subjectAndStudent {

	public static void main(String[] args) {
		subject subj[]=new subject[3];
		subj[0] = new subject("s101","DSA",100,78);
		subj[1] = new subject("s102","OS",100,98);
		subj[2] = new subject("s103","DAA",100,89);
		
		for(subject s:subj) {
			System.out.println(s);
		}
	}

}
