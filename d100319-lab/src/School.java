public class School {
    private String location;
    private String name;
    private String type;
    private Principal principal;
    public School(){};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrincipalName() {
        return principal.getName();
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void schoolInformation(){
        System.out.println("This school is " + this.getName() +", a " + this.getType()
                + ", located in " + this.getLocation() + ", and the principal is " + this.getPrincipalName());
    }
}
