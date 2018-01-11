import java.util.Scanner;

public class regist {
	private String ID;
	private String NAME;
	private String GENDER;
	private String BIRTHDATE;
	private String BLOODGROUP;
	private String REGISTRATIONDATE;
	private String CLINICAL;
	private String DOCTORNAME;
	public static int numberOfPatient = 0;

	Scanner input = new Scanner(System.in);

	public regist() {
		numberOfPatient++;
	}

	public String toString() {
		return "regist [ID=" + this.ID + ", NAME=" + this.NAME + ", GENDER="
				+ this.GENDER + ", BIRTHDATE=" + this.BIRTHDATE
				+ ", BLOODGROUP=" + this.BLOODGROUP + ", REGISTRATIONDATE="
				+ this.REGISTRATIONDATE + ", CLINICAL=" + this.CLINICAL
				+ ", DOCTORNAME=" + this.DOCTORNAME + "]";
	}

	public regist(String ID, String NAME, String GENDER, String BIRTHDATE,
			String BLOODGROUP, String REGISTRATIONDATE, String CLINICAL,
			String DOCTORNAME) {
		this.ID = ID;
		this.NAME = NAME;
		this.GENDER = GENDER;
		this.BIRTHDATE = BIRTHDATE;
		this.BLOODGROUP = BLOODGROUP;
		this.REGISTRATIONDATE = REGISTRATIONDATE;
		this.CLINICAL = CLINICAL;
		this.DOCTORNAME = DOCTORNAME;
		numberOfPatient++;
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String iD) {
		this.ID = this.input.nextLine();
	}

	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String nAME) {
		this.NAME = this.input.nextLine();

	}

	public String getGENDER() {
		return this.GENDER;
	}

	public void setGENDER(String gENDER) {
		this.GENDER = this.input.nextLine();
	}

	public String getBIRTHDATE() {
		return this.BIRTHDATE;
	}

	public void setBIRTHDATE(String bIRTHDATE) {
		this.BIRTHDATE = this.input.nextLine();
	}

	public String getBLOODGROUP() {
		return this.BLOODGROUP;
	}

	public void setBLOODGROUP(String bLOODGROUP) {
		this.BLOODGROUP = this.input.nextLine();
	}

	public String getREGISTRATIONDATE() {
		return this.REGISTRATIONDATE;
	}

	public void setREGISTRATIONDATE(String rEGISTRATIONDATE) {
		this.REGISTRATIONDATE = this.input.nextLine();
	}

	public String getCLINICAL() {
		return this.CLINICAL;
	}

	public void setCLINICAL(String cLINICAL) {
		this.CLINICAL = this.input.nextLine();
	}

	public String getDOCTORNAME() {
		return this.DOCTORNAME;
	}

	public void setDOCTORNAME(String dOCTORNAME) {
		this.DOCTORNAME = this.input.nextLine();
	}

}
