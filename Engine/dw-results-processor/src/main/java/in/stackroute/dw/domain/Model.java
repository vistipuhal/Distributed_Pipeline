package in.stackroute.dw.domain;

import java.util.UUID;

public class Model {

	private String jobId;
	private String stage;
	private String taskName;
	private String type;
	private String[] input;
	private String[] output;
	private int errcode;
	private String stderr;
	
	
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getInput() {
		return input;
	}
	public void setInput(String[] input) {
		this.input = input;
	}
	public String[] getOutput() {
		return output;
	}
	public void setOutput(String[] output) {
		this.output = output;
	}
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getStderr() {
		return stderr;
	}
	public void setStderr(String stderr) {
		this.stderr = stderr;
	}
	
	
	public Model(String jobId, String stage, String type, String[] input, String[] output, int errcode, String stderr) {
		super();
		this.jobId = jobId;
		this.stage = stage;
		this.type = type;
		this.input = input;
		this.output = output;
		this.errcode = errcode;
		this.stderr = stderr;
	}
	public Model() {
		super();
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
