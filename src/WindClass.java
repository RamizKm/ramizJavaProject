public class WindClass {

private String name;

public String getName() {

return name;
}

public void setName(String n) {
this.name=n;

}

public String getSubName() {

if(name==null || name.length()==0) {
return null;

}
return name;

}


}