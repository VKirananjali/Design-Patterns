package Builder;
class Student{
  String name;
  int id;
  int age;
  String address;

  private Student(Builder b){
    this.name=b.name;
    this.id=b.id;
    this.age=b.age;
    this.address=b.address;
  }

  public static Builder getBulider() {
    return new Builder();
  }

  public static class Builder {
    String name;
    int id;
    int age;
    String address;
    private Builder() {
      // Default constructor
    }
    public Builder setName(String name){
      this.name=name;
      return this;
    } 
    public Builder setId(int id){
      this.id=id;
      return this;
    }
    public Builder setAge(int age){
      this.age=age;
      return this;
    } 
    public Builder setAddress(String address){
      this.address=address;
      return this;
    }

    public boolean validate() throws Exception{
      if(age>18){
        throw new Exception("");
      }
      return true;
    }

    public Student build() throws Exception{
      if(!validate()){
        throw new Exception("");
      }
      return new Student(this);
    }
  }
}