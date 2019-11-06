package seven;

public abstract class Staff {
    private String jobNumber;
    private String name;
    private float payRoll;

    public abstract void job();
    public abstract void eat();

    public Staff() {
    }

    public Staff(String jobNumber, String name, float payRoll) {
        this.jobNumber = jobNumber;
        this.name = name;
        this.payRoll = payRoll;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPayRoll() {
        return payRoll;
    }

    public void setPayRoll(float payRoll) {
        this.payRoll = payRoll;
    }


}
