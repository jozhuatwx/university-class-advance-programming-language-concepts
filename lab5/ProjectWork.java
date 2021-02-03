package lab5;

public class ProjectWork {
  // properties
  private String code;
  private String agency;
  private String name;
  private String state;
  private String type;

  // constructor
  public ProjectWork() {}

  public ProjectWork(String code, String agency, String name, String state, String type) {
    this.code = code;
    this.agency = agency;
    this.name = name;
    this.state = state;
    this.type = type;
  }

  // getters and setters
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ProjectWork {code = " + code + ", agency = " + agency + ", name = " + name + ", state = " + state + ", type = " + type + "}";
  }
}
