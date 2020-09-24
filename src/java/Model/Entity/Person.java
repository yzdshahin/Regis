
package Model.Entity;


public class Person {
    
    private String name;
    private String password;
    private String father;
    private String birth;
    private String gender;
  

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
      
        this.birth = birth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
      
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}
